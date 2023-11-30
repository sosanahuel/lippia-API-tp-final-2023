package api.model.proyecto;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseProyecto{

	@SerializedName("ResponseProyecto")
	private List<ResponseProyectoItem> responseProyecto;

	public List<ResponseProyectoItem> getResponseProyecto(){
		return responseProyecto;
	}
}