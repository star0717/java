public class Member {
    static int name;
    int age;

    static {
        name = 10000;
    }

    public Member(){
    }
    public Member(int age){
        this.age = age;
    }
}
