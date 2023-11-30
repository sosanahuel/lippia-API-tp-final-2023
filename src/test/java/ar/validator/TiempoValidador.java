package ar.validator;


import api.model.agregarTiempo.ResponseAgregarTiempo;
import api.model.agregarTimeEntry.ResponseAgregarTimeEntry;
import api.model.tiempos.ResponseTiemposItem;
import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

import java.util.Arrays;
import java.util.logging.Logger;

import static services.BaseService.TIEMPO_NUEVO_ID;

public class TiempoValidador {

    public static void obtengoLosTiempos(){
        Logger logger = Logger.getLogger(ProyectoValidador.class.getName());

        ResponseTiemposItem[] response = (ResponseTiemposItem[]) APIManager.getLastResponse().getResponse();
        for (ResponseTiemposItem tiempo: response) {
            logger.info("Nombre del tiempo ingresado: "+tiempo.getDescription());
            logger.info("ID del tiempo ingresado: "+tiempo.getId());
        }
    }

    public static void obtengoElIdCreado(){
        TIEMPO_NUEVO_ID.set("");
        Logger logger = Logger.getLogger(ProyectoValidador.class.getName());
        ResponseAgregarTiempo response = (ResponseAgregarTiempo) APIManager.getLastResponse().getResponse();
            logger.info("El ID del nuevo tiempo es: "+response.getId());
            logger.info("Y el nombre del nuevo tiempo es: "+response.getDescription());
            TIEMPO_NUEVO_ID.set(response.getId());
    }




}
