package api.model.proyecto;

import com.google.gson.annotations.SerializedName;

public class Estimate{

	@SerializedName("estimate")
	private String estimate;

	@SerializedName("type")
	private String type;

	public String getEstimate(){
		return estimate;
	}

	public String getType(){
		return type;
	}
}