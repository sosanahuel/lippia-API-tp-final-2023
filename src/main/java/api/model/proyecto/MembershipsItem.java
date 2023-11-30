package api.model.proyecto;

import com.google.gson.annotations.SerializedName;

public class MembershipsItem{

	@SerializedName("membershipType")
	private String membershipType;

	@SerializedName("costRate")
	private Object costRate;

	@SerializedName("targetId")
	private String targetId;

	@SerializedName("hourlyRate")
	private Object hourlyRate;

	@SerializedName("membershipStatus")
	private String membershipStatus;

	@SerializedName("userId")
	private String userId;

	public String getMembershipType(){
		return membershipType;
	}

	public Object getCostRate(){
		return costRate;
	}

	public String getTargetId(){
		return targetId;
	}

	public Object getHourlyRate(){
		return hourlyRate;
	}

	public String getMembershipStatus(){
		return membershipStatus;
	}

	public String getUserId(){
		return userId;
	}
}