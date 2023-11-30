package api.model.proyecto;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseProyectoItem{

	@SerializedName("template")
	private boolean template;

	@SerializedName("note")
	private String note;

	@SerializedName("clientId")
	private String clientId;

	@SerializedName("costRate")
	private Object costRate;

	@SerializedName("color")
	private String color;

	@SerializedName("clientName")
	private String clientName;

	@SerializedName("billable")
	private boolean billable;

	@SerializedName("memberships")
	private List<MembershipsItem> memberships;

	@SerializedName("timeEstimate")
	private TimeEstimate timeEstimate;

	@SerializedName("duration")
	private String duration;

	@SerializedName("archived")
	private boolean archived;

	@SerializedName("public")
	private boolean jsonMemberPublic;

	@SerializedName("budgetEstimate")
	private Object budgetEstimate;

	@SerializedName("name")
	private String name;

	@SerializedName("estimate")
	private Estimate estimate;

	@SerializedName("id")
	private String id;

	@SerializedName("hourlyRate")
	private HourlyRate hourlyRate;

	@SerializedName("workspaceId")
	private String workspaceId;

	public boolean isTemplate(){
		return template;
	}

	public String getNote(){
		return note;
	}

	public String getClientId(){
		return clientId;
	}

	public Object getCostRate(){
		return costRate;
	}

	public String getColor(){
		return color;
	}

	public String getClientName(){
		return clientName;
	}

	public boolean isBillable(){
		return billable;
	}

	public List<MembershipsItem> getMemberships(){
		return memberships;
	}

	public TimeEstimate getTimeEstimate(){
		return timeEstimate;
	}

	public String getDuration(){
		return duration;
	}

	public boolean isArchived(){
		return archived;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public Object getBudgetEstimate(){
		return budgetEstimate;
	}

	public String getName(){
		return name;
	}

	public Estimate getEstimate(){
		return estimate;
	}

	public String getId(){
		return id;
	}

	public HourlyRate getHourlyRate(){
		return hourlyRate;
	}

	public String getWorkspaceId(){
		return workspaceId;
	}
}