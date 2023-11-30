package api.model.tiempos;

import com.google.gson.annotations.SerializedName;

public class TimeInterval{

	@SerializedName("duration")
	private String duration;

	@SerializedName("start")
	private String start;

	@SerializedName("end")
	private String end;

	public String getDuration(){
		return duration;
	}

	public String getStart(){
		return start;
	}

	public String getEnd(){
		return end;
	}
}