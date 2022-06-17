package java8.predicate;

public class Student {
	public Student(String studentId, long studentAge, String studentName) {
		super();
		StudentId = studentId;
		StudentAge = studentAge;
		StudentName = studentName;
	}

	private String StudentId;
	private long StudentAge;
	private String StudentName;

	public Student() {
		super();
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public long getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(long studentAge) {
		StudentAge = studentAge;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (StudentAge ^ (StudentAge >>> 32));
		result = prime * result + ((StudentId == null) ? 0 : StudentId.hashCode());
		result = prime * result + ((StudentName == null) ? 0 : StudentName.hashCode());
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
		if (StudentAge != other.StudentAge)
			return false;
		if (StudentId == null) {
			if (other.StudentId != null)
				return false;
		} else if (!StudentId.equals(other.StudentId))
			return false;
		if (StudentName == null) {
			if (other.StudentName != null)
				return false;
		} else if (!StudentName.equals(other.StudentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentAge=" + StudentAge + ", StudentName=" + StudentName + "]";
	}

}
