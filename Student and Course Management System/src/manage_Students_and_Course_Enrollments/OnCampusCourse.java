package manage_Students_and_Course_Enrollments;

public class OnCampusCourse extends Course {
	private String roomNumber;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "OnCampusCourse [roomNumber=" + roomNumber + "]";
	}

	public OnCampusCourse(String courseName, String roomNumber) {
		super(courseName);
		this.roomNumber = roomNumber;
	}
	

}
