package collectionApi;

public class Percentage {
	private String SubjectNAme;
	private String SubjectMarks;
	public Percentage(String subjectNAme, String subjectMarks) {
		super();
		SubjectNAme = subjectNAme;
		SubjectMarks = subjectMarks;
	}
	public Percentage() {
		super();
	}
	public String getSubjectNAme() {
		return SubjectNAme;
	}
	public void setSubjectNAme(String subjectNAme) {
		SubjectNAme = subjectNAme;
	}
	public String getSubjectMarks() {
		return SubjectMarks;
	}
	public void setSubjectMarks(String subjectMarks) {
		SubjectMarks = subjectMarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SubjectMarks == null) ? 0 : SubjectMarks.hashCode());
		result = prime * result + ((SubjectNAme == null) ? 0 : SubjectNAme.hashCode());
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
		Percentage other = (Percentage) obj;
		if (SubjectMarks == null) {
			if (other.SubjectMarks != null)
				return false;
		} else if (!SubjectMarks.equals(other.SubjectMarks))
			return false;
		if (SubjectNAme == null) {
			if (other.SubjectNAme != null)
				return false;
		} else if (!SubjectNAme.equals(other.SubjectNAme))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Percentage [SubjectNAme=" + SubjectNAme + ", SubjectMarks=" + SubjectMarks + "]";
	}
	

}
