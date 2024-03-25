package Java20240325;

public class Students {
    private String name;
    private String department;
    private int studentId;

    public Students() {
    }

    public Students(String name, String department, int studentId) {
        this.name = name;
        this.department = department;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return this.name + "," + this.department + "," + this.studentId;
    }
}



