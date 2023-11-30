package api.model.tiempos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseTiempos{

	@SerializedName("ResponseTiempos")
	private List<ResponseTiemposItem> responseTiempos;

	public List<ResponseTiemposItem> getResponseTiempos(){
		return responseTiempos;
	}
}