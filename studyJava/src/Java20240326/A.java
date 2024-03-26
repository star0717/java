package Java20240326;

public interface A {
    int a = 10;
    // 인터페이스는 반드시(미완성)추상메서드로 이루어져 있음
    // 인터페으스는 기본적으로 양방통신을 목적으로 만들어졌기 때문에 public사용
    void abc(); // => interface 기본 생김새
    // public abstract 자동생성
    // 인터페이스 자체가 추상클래스를 의미하기 때문에 abstract를 선언하지 않아도 됨
}
