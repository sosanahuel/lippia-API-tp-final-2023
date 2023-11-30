package ar.validator;

import api.model.user.ResponseUserItem;
import com.crowdar.api.rest.APIManager;
import services.BaseService;

import java.util.logging.Logger;

public class UsuarioValidador {
    public static void getPrimerIdDeUsuario(){
        Logger logger = Logger.getLogger(EspacioDeTrabajoValidador.class.getName());
        BaseService.ID_USUARIO.set("");

        ResponseUserItem[] response = (ResponseUserItem[]) APIManager.getLastResponse().getResponse();

        for (ResponseUserItem users: response) {
            BaseService.ID_USUARIO.set( users.getId());
            break;
        }
        logger.info("ID de usuario: "+BaseService.ID_USUARIO.get());
    }
}
