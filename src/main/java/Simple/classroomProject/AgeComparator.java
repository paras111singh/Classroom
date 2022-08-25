package Simple.classroomProject;
import java.util.Comparator;

public class AgeComparator implements Comparator<StudentInfo> {
	public int compare(StudentInfo s1, StudentInfo s2){
        if(s1.studentAge == s2.studentAge) {
            return 0;
        }
        if(s1.studentAge>s2.studentAge)
            return 1;
        else
            return -1;
    }


}