package ba.unsa.etf.si.beans;

public class DeviceType implements java.io.Serializable  {
	long type_id;
	String type;
	
	public long getType_id() {
		return type_id;
	}
	public void setType_id(long type_id) {
		this.type_id = type_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public DeviceType() {}

}
