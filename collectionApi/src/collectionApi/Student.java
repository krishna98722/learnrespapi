package collectionApi;

public class Student {

	private String StudentName;
	private String StudentId;
	private Integer StudentMarks;
	private Standard standard;
	public Student() {
		super();
	}
	public Student(String studentName, String studentId, Integer studentMarks, Standard standard) {
		super();
		StudentName = studentName;
		StudentId = studentId;
		StudentMarks = studentMarks;
		this.standard = standard;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public Integer getStudentMarks() {
		return StudentMarks;
	}
	public void setStudentMarks(Integer studentMarks) {
		StudentMarks = studentMarks;
	}
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentId=" + StudentId + ", StudentMarks=" + StudentMarks
				+ ", standard=" + standard + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StudentId == null) ? 0 : StudentId.hashCode());
		result = prime * result + ((StudentMarks == null) ? 0 : StudentMarks.hashCode());
		result = prime * result + ((StudentName == null) ? 0 : StudentName.hashCode());
		result = prime * result + ((standard == null) ? 0 : standard.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudentId == null) {
			if (other.StudentId != null)
				return false;
		} else if (!StudentId.equals(other.StudentId))
			return false;
		if (StudentMarks == null) {
			if (other.StudentMarks != null)
				return false;
		} else if (!StudentMarks.equals(other.StudentMarks))
			return false;
		if (StudentName == null) {
			if (other.StudentName != null)
				return false;
		} else if (!StudentName.equals(other.StudentName))
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}
	
	
	
	
}
