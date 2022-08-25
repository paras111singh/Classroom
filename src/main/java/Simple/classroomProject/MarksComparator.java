package Simple.classroomProject;
import java.util.Comparator;
public class MarksComparator implements Comparator<StudentInfo>{
	public int compare(StudentInfo s1, StudentInfo s2){
        if(s1.studentMarks == s2.studentMarks)
            return 0;
        if(s1.studentMarks>s2.studentMarks)
            return 1;
        else
            return -1;
    }
}