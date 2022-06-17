package query2;
import java.util.*;
public class Student extends Person {

	private String mId;
	private int mNumCourses;
	private boolean mtuitionPaid;
	//early instantition
	private Course[] mCourseEnrolled = { new Course("java", "TE001", 6, 'A'), new Course("java", "TE001", 6, 'A'),
			new Course("java", "TE001", 6, 'A'), new Course("java", "TE001", 6, 'A'),
			new Course("java", "TE001", 6, 'A'), new Course("java", "TE001", 6, 'A') };

	public void SortCourses() {
System.out.println();
	}

	public void Print() {

	}

	public int GetHoursEnrolled() {
		return 1;
	}

}
