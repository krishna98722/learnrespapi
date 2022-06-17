package encapsulation.relationship;

public class Mentor {
private String mentorId;
private String mentorName;

public String getMentorId() {
	return mentorId;
}
public void setMentorId(String mentorId) {
	this.mentorId = mentorId;
}
public String getMentorName() {
	return mentorName;
}
public void setMentorName(String mentorName) {
	this.mentorName = mentorName;
}
public Mentor() {
	super();
}
//Helper method
public Mentor createMentorObject() {
	return new Mentor(); 
}
}
