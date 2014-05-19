package ba.unsa.etf.si.beans;

import java.sql.Date;



public class ActivityLogs implements java.io.Serializable{

	Long activitylogs_id;
	String command;
	boolean isGranted;
	Date timestamp;
	String user;
	String fixtureName;
	
	public ActivityLogs(){}

	public Long getActivitylogs_id() {
		return activitylogs_id;
	}

	public void setActivitylogs_id(Long activitylogs_id) {
		this.activitylogs_id = activitylogs_id;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public boolean isGranted() {
		return isGranted;
	}

	public void setGranted(boolean isGranted) {
		this.isGranted = isGranted;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getFixtureName() {
		return fixtureName;
	}

	public void setFixtureName(String fixtureName) {
		this.fixtureName = fixtureName;
	}
	
	
	

}
