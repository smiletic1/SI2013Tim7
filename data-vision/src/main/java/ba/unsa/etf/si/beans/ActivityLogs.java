package ba.unsa.etf.si.beans;

public class ActivityLogs implements java.io.Serializable {
	
	long activitylogs_id;
	String command;
	int isGranted;
	//datetime timestapm;
	User user;
	public long getActivitylogs_id() {
		return activitylogs_id;
	}

	public void setActivitylogs_id(long activitylogs_id) {
		this.activitylogs_id = activitylogs_id;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public int getIsGranted() {
		return isGranted;
	}

	public void setIsGranted(int isGranted) {
		this.isGranted = isGranted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFixtureTime() {
		return fixtureTime;
	}

	public void setFixtureTime(String fixtureTime) {
		this.fixtureTime = fixtureTime;
	}

	String fixtureTime;
	
	public ActivityLogs() {}
	
	

}
