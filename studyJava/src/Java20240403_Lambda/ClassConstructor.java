package Java20240403_Lambda;

interface CC{
    MyClass method();
}

interface CC2{
    MyClass method(int k);
}

class MyClass{
    int k;
    MyClass(){
        System.out.println("MyClass 기본생성자");
    }
    MyClass(int k){
        System.out.println("매개변수 생성자" + k);
        this.k = k;
    }
}
public class ClassConstructor {
    public static void main(String[] args) {
        // 함수 인터페이스 메서드가 외부 클래스를 리턴 하는 경우
        // 메서드 내에서 외부 클래스의 생성자를 이용하여 인스턴스 객체를 생성해야함
        CC a1 = new CC() {
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };

        CC a2 = () -> new MyClass(3); // 람다식 단축형1
        a2.method();
        CC a3 = MyClass::new; // 람다식 단축형2 (이 형식에서는 매개변수 못넣음 )
        a3.method();
    }
}
