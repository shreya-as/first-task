import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "st", eager = true)
@SessionScoped

public class StudentData implements Serializable{
 private static final long serialVersionUID = 1L;   
     private String firstName;
    private String middleName;
    private String lastName;
    private String faculty;
    private String program;
    private Student student;
    private final  ArrayList<Student> students;

    public StudentData() {
        this.students = new ArrayList();
    }
    public ArrayList<Student> getStudents() {
      return students;
   }

   public String addStudent() {		 
      Student student = new Student( firstName, middleName,  lastName, faculty ,program);
      students.add(student);
      return null;
   }

   public String deleteStudent(Student student) {
      students.remove(student);		
      return null;
   }

   public String editStudent(Student student) {
      student.setCanEdit(true);
      return null;
   }
      public String saveStudents() {
      
      //set "canEdit" of all employees to false 
      
      for (Student student : students) {
         student.setCanEdit(false);
      }		
      return null;
   }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
   
    

}
