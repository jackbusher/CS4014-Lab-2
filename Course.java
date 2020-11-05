

import java.util.Arrays;

public class Course {
  private String courseName;
  private String[] students = new String[4];
  private int numberOfStudents;
    
  /** 
   * public Course creates a course object with the name that you inserted
   */
  
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  /**
   * addStudent adds a student to the students array and then increases the number of 
   * students by 1
   */
  public void addStudent(String student) {
      if(numberOfStudents == students.length) {
          String [] copy = new String [students.length*2];
          System.arraycopy(students,0,copy,0,students.length);
          students = copy;
        }
        
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  /**
   * the getStudents method returns the array of students. This consists of all the 
   * names of the students in the course
   */
  public String[] getStudents() {
    return students;
  }
  
  
  
  /**
   * the method getNumberOfStudents returns how many students are currently 
   * enrolled in the course
   */
  public int getNumberOfStudents() {
    return numberOfStudents;
  }  
  
  

  /**
   * the method getCourseName returns the name of the course object
   */
  public String getCourseName() {
    return courseName;
  }  
  
  /**
   * the method dropStudent requests the name of a student in the course and removes 
   * them from the list of students array
   */
  public void dropStudent(String student) {
    
    for(int i=0;i<students.length;i++) {
        if(students[i]==student) {
            students[i] = null;
            for(i=i;i<students.length-1;i++) {
                students[i] = students[i+1];
            }
        }
        
            
            
        }
        
            }
           
}

  
