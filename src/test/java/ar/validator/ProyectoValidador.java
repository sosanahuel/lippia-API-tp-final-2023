package ar.validator;

import api.model.proyecto.ResponseProyectoItem;
import com.crowdar.api.rest.APIManager;

import java.util.logging.Logger;

import static services.BaseService.ID_PROYECTO;

public class ProyectoValidador {
    public static void primerProyecto(){
        Logger logger = Logger.getLogger(ProyectoValidador.class.getName());
        ResponseProyectoItem[] response = (ResponseProyectoItem[]) APIManager.getLastResponse().getResponse();
        ID_PROYECTO.set("");
        for (ResponseProyectoItem proyecto: response) {
            ID_PROYECTO.set(proyecto.getId());
            logger.info("Id de proyecto seleccionado: "+proyecto.getId());
            logger.info("Nombre del proyecto seleccionado: "+proyecto.getName());
            break;
        }
    }
}
