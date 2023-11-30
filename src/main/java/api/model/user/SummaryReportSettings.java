package api.model.user;

import com.google.gson.annotations.SerializedName;

public class SummaryReportSettings{

	@SerializedName("subgroup")
	private String subgroup;

	@SerializedName("group")
	private String group;

	public String getSubgroup(){
		return subgroup;
	}

	public String getGroup(){
		return group;
	}
}