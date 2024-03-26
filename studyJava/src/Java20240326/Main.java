package Java20240326;

public class Main {
    public static void main(String[]args){
        ChildA a = new ChildA();
        a.abc();
        a.bcd();

        // 인터페이스에서 필드의 이름이 같을 경우 각자 다른 인터페이스에서 호출하는 방법
        System.out.println(A.a); // 인터페이스 A의 int a 는 10
        System.out.println(B.a); // 인터페이스 B의 int a 는 20

        // 단 static 제어자이기 때문에
        // A.a = 100 =>에러남(final 제이자이므로 변경 불가)
    }
}
