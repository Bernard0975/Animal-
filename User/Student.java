public class Student extends User{
 String matric_no;
 int admission_no;

 String registerCourse(String courseName, int courseCode, int courseUnit){
    System.out.println("Course registered Successfully. See Details below");
    System.out.println("Course Name: " + courseName);
    System.out.println("Course Code: " + courseCode);
    System.out.println("Course Unit: " + courseUnit);

 }   

 String checkResult(String matric_no){
    Student newStudent = new Student;
    if(newStudent.login().equals("Logged In")){
        return "Open results";
    }
 }
}