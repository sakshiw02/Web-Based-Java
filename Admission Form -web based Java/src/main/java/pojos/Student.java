package pojos;

public class Student {
	private String firstName;
	private String lastname;
	private int score;
	private Course selectedCourse;
	private boolean admissionStatus;
	
	
	public Student() {
		super();
	}
	public Student(String firstName, String lastname, int score, Course selectedCourse) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.score = score;
		this.selectedCourse = selectedCourse;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Course getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	public boolean isAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(boolean admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastname=" + lastname + ", score=" + score + ", selectedCourse="
				+ selectedCourse + "]";
	}
	
	
	
}
