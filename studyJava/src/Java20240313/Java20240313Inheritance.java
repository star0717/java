package Java20240313;

public class Java20240313Inheritance {
    // refactor에서 이름 바꾸면 자동으로 연동돼서 이름 같이 변경됨!
    public static void main(String[]args){
        class A{}
        class B extends A {}
        class C extends B {}
        class D extends B {}

        B bb = new B();
        A a = (A)bb;

        A aa = new A();
//        B b (B)aa; => 다운캐스팅
//        C c (C)aa; => 다운캐스팅

        A ab = new B();
        // 10000라인의 코드가 있음
        // 아래에서 ab변수를 B 또는 C 타입으로 캐스팅이 필요할 경우

        if (ab instanceof B){
            B b = (B)ab;
        } else if (ab instanceof C) {
            C c = (C)ab;
        } //A -> C 다운캐스팅(수동변환) : 불가능
        else {
            System.out.println("둘 다 아님 망함");
        }

        B b = (B)ab;
//      C c = (C)ab; => A -> C 다운캐스팅(수동변환) : 불가능

        B bd = new D();
        D d = (D)bd; // B -> D 다운캐스팅(수동변환)
        A ad = new D();
        B b1 = (B)ad; // A -> B 다운캐스팅(수동변환)
        D d1 = (D)ad; // A -> D 다운캐스팅(수동변환)
    }
}
