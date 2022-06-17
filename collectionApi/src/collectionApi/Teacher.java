package collectionApi;

public class Teacher {
private String tecaherId;
private String teacherName;
private long teacherAge;
public Teacher(String tecaherId, String teacherName, long teacherAge) {
	super();
	this.tecaherId = tecaherId;
	this.teacherName = teacherName;
	this.teacherAge = teacherAge;
}
public String getTecaherId() {
	return tecaherId;
}
public void setTecaherId(String tecaherId) {
	this.tecaherId = tecaherId;
}
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
public long getTeacherAge() {
	return teacherAge;
}
public void setTeacherAge(long teacherAge) {
	this.teacherAge = teacherAge;
}
@Override
public String toString() {
	return "Teacher [tecaherId=" + tecaherId + ", teacherName=" + teacherName + ", teacherAge=" + teacherAge + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (teacherAge ^ (teacherAge >>> 32));
	result = prime * result + ((teacherName == null) ? 0 : teacherName.hashCode());
	result = prime * result + ((tecaherId == null) ? 0 : tecaherId.hashCode());
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
	Teacher other = (Teacher) obj;
	if (teacherAge != other.teacherAge)
		return false;
	if (teacherName == null) {
		if (other.teacherName != null)
			return false;
	} else if (!teacherName.equals(other.teacherName))
		return false;
	if (tecaherId == null) {
		if (other.tecaherId != null)
			return false;
	} else if (!tecaherId.equals(other.tecaherId))
		return false;
	return true;
}

}
