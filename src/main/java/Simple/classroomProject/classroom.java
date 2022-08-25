package Simple.classroomProject;
import java.util.ArrayList;
import java.util.Collections;

public class classroom {
    public static void main(String[] args){
    	StudentInfo s1 = new StudentInfo(01,22,"Mayank",351);
    	StudentInfo s2 = new StudentInfo(02,17,"Akshat",303);
    	StudentInfo s3 = new StudentInfo(03,19,"Palak",421);
    	StudentInfo s4 = new StudentInfo(04,18,"Nikhil",331);
    	StudentInfo s5 = new StudentInfo(05,20,"Saurav",251);

        ArrayList<StudentInfo> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);

        System.out.println("-----Students according to their Marks-----");
        Collections.sort(a1,new MarksComparator());
        for(StudentInfo s:a1)
            System.out.println(s.studentId+ " is " +s.studentAge+" and their name is "+s.studentName+" and the marks are "+s.studentMarks );
 
      
        System.out.println("-----Students according to their ID-----");
        Collections.sort(a1,new idComparator());
        for(StudentInfo s:a1)
            System.out.println(s.studentId+ " is " +s.studentAge+" and their name is "+s.studentName+" and the marks are "+s.studentMarks );
   
        
        System.out.println("-----Students according to their Age-----");
        Collections.sort(a1,new AgeComparator());
        for(StudentInfo s:a1)
            System.out.println(s.studentId+ " is " +s.studentAge+" and their name is "+s.studentName+" and the marks are "+s.studentMarks );   
    }
}

