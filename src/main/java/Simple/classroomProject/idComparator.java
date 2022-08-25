package Simple.classroomProject;
import java.util.Comparator;

public class idComparator implements Comparator <StudentInfo> {
	public int compare(StudentInfo s1, StudentInfo s2) {
		if (s1.studentId == s2.studentId)
		return 0;
		if (s1.studentId > s2.studentId)
			return 1;
		else
			return -1;
			
	}


}