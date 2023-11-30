package api.model.agregarTiempo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseAgregarTiempo{

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

	public void setTagIds(List<Object> tagIds){
		this.tagIds = tagIds;
	}

	public List<Object> getTagIds(){
		return tagIds;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setBillable(boolean billable){
		this.billable = billable;
	}

	public boolean isBillable(){
		return billable;
	}

	public void setCustomFieldValues(List<Object> customFieldValues){
		this.customFieldValues = customFieldValues;
	}

	public List<Object> getCustomFieldValues(){
		return customFieldValues;
	}

	public void setIsLocked(boolean isLocked){
		this.isLocked = isLocked;
	}

	public boolean isIsLocked(){
		return isLocked;
	}

	public void setTimeInterval(TimeInterval timeInterval){
		this.timeInterval = timeInterval;
	}

	public TimeInterval getTimeInterval(){
		return timeInterval;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setProjectId(String projectId){
		this.projectId = projectId;
	}

	public String getProjectId(){
		return projectId;
	}

	public void setKioskId(Object kioskId){
		this.kioskId = kioskId;
	}

	public Object getKioskId(){
		return kioskId;
	}

	public void setTaskId(String taskId){
		this.taskId = taskId;
	}

	public String getTaskId(){
		return taskId;
	}

	public void setWorkspaceId(String workspaceId){
		this.workspaceId = workspaceId;
	}

	public String getWorkspaceId(){
		return workspaceId;
	}
}