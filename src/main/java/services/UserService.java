package services;

import api.model.user.ResponseUser;
import api.model.user.ResponseUserItem;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class UserService  extends BaseService{
    public static Response get(String jsonName) {
        return get(jsonName, ResponseUserItem[].class,setParams());
    }
    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base_url"));
        params.put("api-key",API_KEY.get());
        params.put("workspaceId", PRIMER_ESPACIO_DE_TRABAJO.get());
        return params;
    }
}
