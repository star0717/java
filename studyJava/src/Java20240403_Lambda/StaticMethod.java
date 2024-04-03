package Java20240403_Lambda;

interface AAA{
    void methodAAA();
}

class B2 { // 외부 라이브러리 클래스라고 가정
    static void methodB(){
        System.out.println("외부 클래스의 정적 메서드");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 외부클래스 메서드가 static이므로 외부 클래스를 객체화 할 필요가 없음
        // => new키워드로 생성하는 부분이 필요없음
        AAA a = () -> {B2.methodB();};
        AAA a1 = B2::methodB;
    }
}
