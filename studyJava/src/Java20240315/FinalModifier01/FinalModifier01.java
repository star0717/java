package Java20240315.FinalModifier01;

class A{
    void abc(){}
    final void bcd(){}
}

class B extends A{
    void abc(){}
    // void bcd(){} => final 메서드는 오버라이딩 불가
}

class A1{ // 선언과 동시에 값 대입
    int a = 3;
    final int b = 5;

    A1(){
    }
}

class A2{ // 선언과 값 대입 분리
    int a ;
    final int b ;
    A2(){
        a=3;
        b=5;
    }
}

class A3{ // final 필드값을 대입한 후에는 추가 값 대입 불가
    int a = 3 ;
    final int b = 5 ;
    A3(){
        a=7;
//      b=9; => 불가능
    }
}

final class C {}
// class D extends C{} => final클래스는 상속 자체가 불가

public class FinalModifier01 {
}
