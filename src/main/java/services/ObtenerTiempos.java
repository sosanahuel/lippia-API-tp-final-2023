package services;

import api.model.tiempos.ResponseTiemposItem;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ObtenerTiempos extends BaseService{
    public static Response get(String jsonName) {
        return get(jsonName, ResponseTiemposItem[].class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base_url"));
        params.put("api-key",API_KEY.get());
        params.put("workspaceId", PRIMER_ESPACIO_DE_TRABAJO.get());
        params.put("id", ID_USUARIO.get());
        return params;
    }
}
