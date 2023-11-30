package api.model.tiempos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseTiemposItem{

	@SerializedName("costRate")
	private CostRate costRate;

	@SerializedName("tagIds")
	private List<Object> tagIds;

	@SerializedName("description")
	private String description;

	@SerializedName("type")
	private String type;

	@SerializedName("userId")
	private String userId;

	@SerializedName("billable")
	private boolean billable;

	@SerializedName("customFieldValues")
	private List<Object> customFieldValues;

	@SerializedName("isLocked")
	private boolean isLocked;

	@SerializedName("timeInterval")
	private TimeInterval timeInterval;

	@SerializedName("id")
	private String id;

	@SerializedName("hourlyRate")
	private HourlyRate hourlyRate;

	@SerializedName("projectId")
	private String projectId;

	@SerializedName("kioskId")
	private Object kioskId;

	@SerializedName("taskId")
	private Object taskId;

	@SerializedName("workspaceId")
	private String workspaceId;

	public CostRate getCostRate(){
		return costRate;
	}

	public List<Object> getTagIds(){
		return tagIds;
	}

	public String getDescription(){
		return description;
	}

	public String getType(){
		return type;
	}

	public String getUserId(){
		return userId;
	}

	public boolean isBillable(){
		return billable;
	}

	public List<Object> getCustomFieldValues(){
		return customFieldValues;
	}

	public boolean isIsLocked(){
		return isLocked;
	}

	public TimeInterval getTimeInterval(){
		return timeInterval;
	}

	public String getId(){
		return id;
	}

	public HourlyRate getHourlyRate(){
		return hourlyRate;
	}

	public String getProjectId(){
		return projectId;
	}

	public Object getKioskId(){
		return kioskId;
	}

	public Object getTaskId(){
		return taskId;
	}

	public String getWorkspaceId(){
		return workspaceId;
	}
}