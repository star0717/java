public class Students {
    private String name;
    private int age;
    private String address;
    private String personalNum;

    public Students() { // 기본생성자
    }

    public Students(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public String getName() {
        return name;
    }// return형이 있는 메서드 사용법
    // return => 메서드를 사용하고 최종 값을 사용자에게 리턴해줌

    public void setName(String name) { // 매개변수 (Parameter)
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void displayName() { // 메소드
        System.out.println(this.name);
    }
    public void displayAge() {
        System.out.println(this.age);
    }
    public void displayAddress() {
        System.out.println(this.address);
    }
    public void displayAll() {
        System.out.println(this.name + " " + this.age + " " + this.address);
    }
}