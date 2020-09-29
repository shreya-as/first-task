
public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String faculty;
    private String program;
    private boolean canEdit;

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, String faculty, String program) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.program = program;
        canEdit = false;
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

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
    
    
}
