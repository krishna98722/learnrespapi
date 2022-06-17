package query2;

public class Course extends Person {
private String mCourseName;
private String mCoursenum;
private int mcourseCredits;

public Course(String mCourseName, String mCoursenum, int mcourseCredits, char mCourseGrade) {
	super();
	this.mCourseName = mCourseName;
	this.mCoursenum = mCoursenum;
	this.mcourseCredits = mcourseCredits;
	this.mCourseGrade = mCourseGrade;
}

public String getmCourseName() {
	return mCourseName;
}
public String getmCoursenum() {
	return mCoursenum;
}

public int getMcourseCredits() {
	return mcourseCredits;
}

public char getmCourseGrade() {
	return mCourseGrade;
}

public void setmCourseGrade(char mCourseGrade) {
	this.mCourseGrade = mCourseGrade;
}

private char mCourseGrade;

public void Print() {
	
}


}
