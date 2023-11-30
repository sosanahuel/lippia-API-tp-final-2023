package services;

import api.model.agregarTimeEntry.ResponseAgregarTimeEntry;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class EliminarTiempo extends BaseService{
    public static Response delete(String jsonName) {
        return delete(jsonName, ResponseAgregarTimeEntry.class,setParams());
    }
    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base_url"));
        params.put("api-key",API_KEY.get());
        params.put("workspaceId", PRIMER_ESPACIO_DE_TRABAJO.get());
        params.put("idTime",TIEMPO_NUEVO_ID.get());
        return params;
    }
}
