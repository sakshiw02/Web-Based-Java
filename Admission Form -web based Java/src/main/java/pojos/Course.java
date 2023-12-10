package pojos;

public enum Course {
JAVA(90),MERN(75),PYTHON(89),DATA_SCIENCE(86),TABLEAU(63);
	
	private int marks;

	public int getMarks() {
		return marks;
	}

	private Course(int marks) {
		this.marks = marks;
	}

	
	
}
