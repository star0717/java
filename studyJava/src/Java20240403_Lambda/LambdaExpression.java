package Java20240403_Lambda;

// Lambda식의 네가지 방식
interface A{
    void method1(); // 입력 X, 리턴 X
}

interface B{
    void method2(int a); // 입력 O, 리턴 X
}

interface C{
    int method3(); // 입력 X, 리턴 O
}

interface D{
    double method4(int a, double b); // 입력 O, 리턴 O
}

public class LambdaExpression {
    public static void main(String[]args){

        // pattern 01
        // 익명 이너클래스 방식
        A a0 = new A(){
            @Override
            public void method1(){
                System.out.println("[pattern01]입력과 리턴을 하지 않는 함수");
            }
        };
        a0.method1();

        // 람다식 표현
        A a = () -> System.out.println("[pattern01]입력과 리턴을 하지 않는 함수");
        a.method1();

        // pattern 02
        B b = (int x) -> System.out.println("pattern02" + x); // 매개변수가 있고 입력은 하되 리턴은 안함
        B b1 = (x) -> System.out.println("pattern02 " + x);
        B b2 = x -> System.out.println("pattern02 " + x); // 매개변수가 하나인 경우만 소괄호 삭제
        b2.method2(5);

        C c = () -> {return 4;}; // return이 있으므로 중괄호 필요
        C c1 = () -> 4; // return을 생략할 경우 {중괄호}도 같이 생략
        System.out.println(c1.method3());

        D d = (int x, double y) -> {return x + y;};
        D d1 = (int x, double y) -> x + y;
        D d2 = (x, y) -> x + y;
        System.out.println(d2.method4(4,4.5));


    }
}
