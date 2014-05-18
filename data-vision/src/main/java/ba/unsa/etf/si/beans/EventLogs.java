package ba.unsa.etf.si.beans;

public class EventLogs implements java.io.Serializable {
	long eventlogs_id;
	public long getEventlogs_id() {
		return eventlogs_id;
	}
	public void setEventlogs_id(long eventlogs_id) {
		this.eventlogs_id = eventlogs_id;
	}
	public String getEvent_message() {
		return event_message;
	}
	public void setEvent_message(String event_message) {
		this.event_message = event_message;
	}
	public DeviceName getDevice_name() {
		return device_name;
	}
	public void setDevice_name(DeviceName device_name) {
		this.device_name = device_name;
	}
	public DeviceType getDevice_type() {
		return device_type;
	}
	public void setDevice_type(DeviceType device_type) {
		this.device_type = device_type;
	}
	public ActivityLogs getActivity_logs() {
		return activity_logs;
	}
	public void setActivity_logs(ActivityLogs activity_logs) {
		this.activity_logs = activity_logs;
	}
	String event_message;
	//datetime timestamp
	DeviceName device_name;
	DeviceType device_type;
	ActivityLogs activity_logs;
	

}
