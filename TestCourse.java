import java.util.Arrays;
public class TestCourse {
 public static void main() {
     Course compScience = new Course("Computer Science");
     compScience.addStudent("Jack");
     compScience.addStudent("Dean");
     compScience.addStudent("Steve");
     compScience.dropStudent("Dean");
     System.out.println("The students currently in this course are "+ Arrays.toString(compScience.getStudents()));
    }
}