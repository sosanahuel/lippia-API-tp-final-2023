package api.model.proyecto;

import com.google.gson.annotations.SerializedName;

public class TimeEstimate{

	@SerializedName("includeNonBillable")
	private boolean includeNonBillable;

	@SerializedName("estimate")
	private String estimate;

	@SerializedName("active")
	private boolean active;

	@SerializedName("type")
	private String type;

	@SerializedName("resetOption")
	private Object resetOption;

	public boolean isIncludeNonBillable(){
		return includeNonBillable;
	}

	public String getEstimate(){
		return estimate;
	}

	public boolean isActive(){
		return active;
	}

	public String getType(){
		return type;
	}

	public Object getResetOption(){
		return resetOption;
	}
}