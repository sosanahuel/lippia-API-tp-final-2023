package api.model.agregarTimeEntry;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseAgregarTimeEntry{

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

	@SerializedName("projectId")
	private String projectId;

	@SerializedName("kioskId")
	private Object kioskId;

	@SerializedName("taskId")
	private String taskId;

	@SerializedName("workspaceId")
	private String workspaceId;

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

	public String getProjectId(){
		return projectId;
	}

	public Object getKioskId(){
		return kioskId;
	}

	public String getTaskId(){
		return taskId;
	}

	public String getWorkspaceId(){
		return workspaceId;
	}
}