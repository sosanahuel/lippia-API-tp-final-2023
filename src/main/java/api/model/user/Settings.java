package api.model.user;

import com.google.gson.annotations.SerializedName;

public class Settings{

	@SerializedName("reminders")
	private boolean reminders;

	@SerializedName("dashboardViewType")
	private String dashboardViewType;

	@SerializedName("dateFormat")
	private String dateFormat;

	@SerializedName("showOnlyWorkingDays")
	private boolean showOnlyWorkingDays;

	@SerializedName("groupSimilarEntriesDisabled")
	private boolean groupSimilarEntriesDisabled;

	@SerializedName("weekStart")
	private String weekStart;

	@SerializedName("projectPickerTaskFilter")
	private boolean projectPickerTaskFilter;

	@SerializedName("longRunning")
	private boolean longRunning;

	@SerializedName("scheduling")
	private boolean scheduling;

	@SerializedName("onboarding")
	private boolean onboarding;

	@SerializedName("theme")
	private String theme;

	@SerializedName("dashboardPinToTop")
	private boolean dashboardPinToTop;

	@SerializedName("lang")
	private String lang;

	@SerializedName("isCompactViewOn")
	private boolean isCompactViewOn;

	@SerializedName("projectListCollapse")
	private int projectListCollapse;

	@SerializedName("timeTrackingManual")
	private boolean timeTrackingManual;

	@SerializedName("dashboardSelection")
	private String dashboardSelection;

	@SerializedName("sendNewsletter")
	private boolean sendNewsletter;

	@SerializedName("approval")
	private boolean approval;

	@SerializedName("timeZone")
	private String timeZone;

	@SerializedName("pto")
	private boolean pto;

	@SerializedName("scheduledReports")
	private boolean scheduledReports;

	@SerializedName("collapseAllProjectLists")
	private boolean collapseAllProjectLists;

	@SerializedName("myStartOfDay")
	private String myStartOfDay;

	@SerializedName("alerts")
	private boolean alerts;

	@SerializedName("summaryReportSettings")
	private SummaryReportSettings summaryReportSettings;

	@SerializedName("timeFormat")
	private String timeFormat;

	@SerializedName("multiFactorEnabled")
	private boolean multiFactorEnabled;

	@SerializedName("weeklyUpdates")
	private boolean weeklyUpdates;

	public boolean isReminders(){
		return reminders;
	}

	public String getDashboardViewType(){
		return dashboardViewType;
	}

	public String getDateFormat(){
		return dateFormat;
	}

	public boolean isShowOnlyWorkingDays(){
		return showOnlyWorkingDays;
	}

	public boolean isGroupSimilarEntriesDisabled(){
		return groupSimilarEntriesDisabled;
	}

	public String getWeekStart(){
		return weekStart;
	}

	public boolean isProjectPickerTaskFilter(){
		return projectPickerTaskFilter;
	}

	public boolean isLongRunning(){
		return longRunning;
	}

	public boolean isScheduling(){
		return scheduling;
	}

	public boolean isOnboarding(){
		return onboarding;
	}

	public String getTheme(){
		return theme;
	}

	public boolean isDashboardPinToTop(){
		return dashboardPinToTop;
	}

	public String getLang(){
		return lang;
	}

	public boolean isIsCompactViewOn(){
		return isCompactViewOn;
	}

	public int getProjectListCollapse(){
		return projectListCollapse;
	}

	public boolean isTimeTrackingManual(){
		return timeTrackingManual;
	}

	public String getDashboardSelection(){
		return dashboardSelection;
	}

	public boolean isSendNewsletter(){
		return sendNewsletter;
	}

	public boolean isApproval(){
		return approval;
	}

	public String getTimeZone(){
		return timeZone;
	}

	public boolean isPto(){
		return pto;
	}

	public boolean isScheduledReports(){
		return scheduledReports;
	}

	public boolean isCollapseAllProjectLists(){
		return collapseAllProjectLists;
	}

	public String getMyStartOfDay(){
		return myStartOfDay;
	}

	public boolean isAlerts(){
		return alerts;
	}

	public SummaryReportSettings getSummaryReportSettings(){
		return summaryReportSettings;
	}

	public String getTimeFormat(){
		return timeFormat;
	}

	public boolean isMultiFactorEnabled(){
		return multiFactorEnabled;
	}

	public boolean isWeeklyUpdates(){
		return weeklyUpdates;
	}
}