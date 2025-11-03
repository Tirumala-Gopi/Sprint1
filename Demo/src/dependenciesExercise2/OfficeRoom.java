package dependenciesExercise2;

import java.util.ArrayList;

public class OfficeRoom {

	private String roomName;
	private ArrayList<SmartDevice> devices=new ArrayList<>();
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public ArrayList<SmartDevice> getDevices() {
		return devices;
	}
	public void setDevices(ArrayList<SmartDevice> devices) {
		this.devices = devices;
	}
	public OfficeRoom(String roomName, ArrayList<SmartDevice> devices) {
		super();
		this.roomName = roomName;
		this.devices = devices;
	}
	@Override
	public String toString() {
		return "OfficeRoom [roomName=" + roomName + ", devices=" + devices + "]";
	}
	public void addDevice(SmartDevice device) {
		devices.add(device);
	}
	
	public void getdevices()
	{
		
	}
}
