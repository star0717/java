package Java20240403_Lambda;


interface AA { //함수형 인터페이스
    void abc();
}

class LibraryB{
    void methodB(){ // 내가 만든 클래스가 아닌 라이브러리 클래스라고 가정
        System.out.println("원래 존재하는 라이브러리 메서드");
    }
}

public class InstanceMethodType {
    public static void main(String[]args){
        AA aa0 = new AA(){ // 익명 이너클래스
            @Override
            public void abc(){
                LibraryB b = new LibraryB();
                b.methodB();
            }
        };

        // 위 식을 람다식으로 단축하기
        // 내가 만든 함수형 인터페이스 메서드에서 외부 클래스의 메서드를 사용하려면
        // 그 외부 클래스의 인스턴스가 필요하므로 아래처럼 인스턴스 생성과정이 필요
        AA aa = () -> { // 1단계
            LibraryB b = new LibraryB();
            b.methodB();
        };
    }
}
