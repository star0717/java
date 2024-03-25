package Java20240325;

public class Students {
    // 1 필드생성
    private String name;
    private String department;
    private int studentId;

    // 2. 생성자 선언
    public Students() {
    } //기본생성자

    public Students(String name, String department, int studentId) {
        this.name = name;
        this.department = department;
        this.studentId = studentId;
    }

    // 3. getter setter 생성
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

    // 4. 오버라이드
    @Override
    public String toString() {
        return this.name + "," + this.department + "," + this.studentId;
    }
}



