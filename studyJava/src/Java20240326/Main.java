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

        A a2 = new A() {
            @Override
            public void abc() {
                System.out.println("나는 익명의 이너클래스");
            }
        };
        a2.abc();

        // 인터페이스 생성 방법1
        // 자식클래스(ChildA)를 선언하고 해당 인터페이스를 상속하게 하면
        // 아래와 같이 동일한 코드 내용(=메서드 오버라이딩 내용)을 계속해서 사용할 수 있음
        ChildA c2 = new ChildA();
        ChildA c3 = new ChildA();
        ChildA c4 = new ChildA();

        // 인터페이스 생성 방법2
        // 아래와 같이 익명 이너 클래스 형식으로 생성하면,
        // 방법 1에서와 같이 재사용할 수 있는 클래스 이름이 없으므로
        // 동일한 코드 내용(=메서드 오버라이딩 내용)을 매번 복붙해서 넣어야 함
        A a3 = new A() {
            @Override
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
    }
}
