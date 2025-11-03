package dependenciesExercise2;

import java.util.ArrayList;

public class SmartOffice {

	
	private String officeName;
	private ArrayList<OfficeRoom>rooms=new ArrayList<>();
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public ArrayList<OfficeRoom> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<OfficeRoom> rooms) {
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "SmartOffice [officeName=" + officeName + ", rooms=" + rooms + "]";
	}
	public SmartOffice(String officeName, ArrayList<OfficeRoom> rooms) {
		super();
		this.officeName = officeName;
		this.rooms = rooms;
	}
	
}
