package manage_Students_and_Course_Enrollments;

public class OnlineCourse extends Course {

	private String platform;

	public OnlineCourse(String courseName, String platform) {
		super(courseName);
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "OnlineCourse [platform=" + platform + "]";
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
}
