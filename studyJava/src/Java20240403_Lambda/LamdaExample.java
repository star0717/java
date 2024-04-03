package Java20240403_Lambda;

interface IntCalculator{
    int calculator(int a, int b);
}
public class LamdaExample {
    public static void main(String[] args) {
        // calculate 함수의 정의 = 두개의 매개변수를 더한다.
        IntCalculator adder = (a,b) -> a + b; // adder는 메서드 아님
        int result = adder.calculator(5,3);
        System.out.println(result);

        printResult(4,6,(x,y)->x*y*10);
        printResult(6,5,(x,y)->x*y/10);
    }

    public static void printResult(int x, int y, IntCalculator calculator) {
        System.out.println("Result : " + calculator.calculator(x,y));
    }
}
