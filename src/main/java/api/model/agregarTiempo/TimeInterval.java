package api.model.agregarTiempo;

import com.google.gson.annotations.SerializedName;

public class TimeInterval{

	@SerializedName("duration")
	private String duration;

	@SerializedName("start")
	private String start;

	@SerializedName("end")
	private String end;

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setStart(String start){
		this.start = start;
	}

	public String getStart(){
		return start;
	}

	public void setEnd(String end){
		this.end = end;
	}

	public String getEnd(){
		return end;
	}
}