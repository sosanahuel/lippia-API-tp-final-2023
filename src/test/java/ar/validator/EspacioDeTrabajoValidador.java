package ar.validator;


import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;

import java.util.Arrays;
import java.util.logging.Logger;

public class EspacioDeTrabajoValidador {
    public static void responseWorkspaces(){
        WorkspacesResponse[] response = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();
        for (WorkspacesResponse Work: response) {
            String id = Work.getId();
            Assert.assertNotNull(id,"El campo ID es nulo");
        }
        System.out.println(Arrays.toString(response));
    }

    public static void getPrimerWorkspaces(){
        Logger logger = Logger.getLogger(EspacioDeTrabajoValidador.class.getName());
        BaseService.PRIMER_ESPACIO_DE_TRABAJO.set("");

        WorkspacesResponse[] response = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();

        for (WorkspacesResponse Work: response) {
            BaseService.PRIMER_ESPACIO_DE_TRABAJO.set(Work.getId());
            logger.info("Nombre del espacio de trabajo seleccionado: " + Work.getName());

            break;
        }
        logger.info("Espacio de trabajo seleccionado ID: "+BaseService.PRIMER_ESPACIO_DE_TRABAJO.get());
    }



}
