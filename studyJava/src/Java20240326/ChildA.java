package Java20240326;

public class ChildA implements A,B{
// implements => interface 사용시 씀
    @Override
    public void abc() {
        System.out.println("Child of A");
    }

    @Override
    public void bcd() {
        System.out.println("Child of B");
    }
}
