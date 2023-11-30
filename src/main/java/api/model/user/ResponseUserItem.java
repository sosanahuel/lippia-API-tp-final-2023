package api.model.user;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseUserItem{

	@SerializedName("profilePicture")
	private String profilePicture;

	@SerializedName("settings")
	private Settings settings;

	@SerializedName("customFields")
	private List<Object> customFields;

	@SerializedName("name")
	private String name;

	@SerializedName("defaultWorkspace")
	private String defaultWorkspace;

	@SerializedName("id")
	private String id;

	@SerializedName("activeWorkspace")
	private String activeWorkspace;

	@SerializedName("email")
	private String email;

	@SerializedName("memberships")
	private List<Object> memberships;

	@SerializedName("status")
	private String status;

	public String getProfilePicture(){
		return profilePicture;
	}

	public Settings getSettings(){
		return settings;
	}

	public List<Object> getCustomFields(){
		return customFields;
	}

	public String getName(){
		return name;
	}

	public String getDefaultWorkspace(){
		return defaultWorkspace;
	}

	public String getId(){
		return id;
	}

	public String getActiveWorkspace(){
		return activeWorkspace;
	}

	public String getEmail(){
		return email;
	}

	public List<Object> getMemberships(){
		return memberships;
	}

	public String getStatus(){
		return status;
	}
}