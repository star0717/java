import java.util.Scanner;

public class MethodPractice {
    public void multiplesOf3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = scan.nextInt();

        for (int i = 0; i > 0; i++){
            num = i;
            if (num % 3 == 0){
                System.out.println(num);
            }
        }
    }
}
