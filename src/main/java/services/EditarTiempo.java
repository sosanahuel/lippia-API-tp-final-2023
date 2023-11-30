package services;

import api.model.agregarTimeEntry.ResponseAgregarTimeEntry;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class EditarTiempo extends BaseService{
    public static Response put(String jsonName) {
        return put(jsonName, ResponseAgregarTimeEntry.class,setParams());
    }
    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base_url"));
        params.put("api-key",API_KEY.get());
        params.put("nombreTiempo",TIEMPO_NUEVO_NOMBRE.get());
        params.put("fechaFin", TIEMPO_FIN.get());
        params.put("fechaInicio", TIEMPO_INICIO.get());
        params.put("workspaceId",PRIMER_ESPACIO_DE_TRABAJO.get());
        params.put("idTime",TIEMPO_NUEVO_ID.get());
        params.put("projectId",ID_PROYECTO.get());
        return params;
    }
}
