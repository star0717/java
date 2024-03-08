
import java.util.Arrays;
import java.util.Scanner;
public class Preparation {
    public static void main(String[] args) {

        // 20240229 자습

        // 문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.

        int a = 51;

        int b = 50;

        if ( a >= 50 ) {
            System.out.println( b + "이상의 수 입니다.");
        } else if ( a < 50 ) {
            System.out.println( b + "미만의 수 입니다." );
        } else {
          System.out.println("나만 보려고 남겨놓은 else log~");
        }

        // 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
        System.out.println("3의 배수를 입력해보세용");
        int c = 16;

        int d = 3;

        if (c % 3 == 0){
            System.out.println("입력하신 숫자는 "+d+"의 배수가 맞습니당~.");
        } else if (c % 3 != 0) {
            System.out.println("다시 입력해보세용~");
        } else {
            System.out.println("log!!");
        }

        /* 문제3. 코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다.
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다.
        이를 판단하는 프로그램을 작성해보자.
        점수가 0미만 100초과이면 경고문구 출력! */

        int grade = 100;
        int score = 1;


        if (grade == 4){
            if (score >= 70 ) {
                System.out.println("합격입니다~");
            }else if (score < 70 && score >= 0){
                System.out.println("에궁..다시 해보세용");
            }else if (score < 0 || score > 100 ){
                System.out.println("잘못된 점수값!!");
            }else {
                System.out.println("error");
            }
        }else if (grade <= 3){
            if (score >= 60 ) {
                System.out.println("합격입니다~");
            }else if (score < 60 && score >= 0){
                System.out.println("에궁..다시 해보세용");
            }else if (score < 0 || score > 100 ){
                System.out.println("잘못된 점수값!!");
            }else {
                System.out.println("error");
            }
        }

        if (grade > 4 || grade < 1){
            System.out.println("error!!");
        }

        //---------------------------------------------------------

        // 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오


        // 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력하시오.

        for (int intNum = 0; intNum < 10; intNum++){
            System.out.print(intNum);
        }

        System.out.println();

//        int[] array = new int[]{3,4,5,6,7};
//        for (int j = 0; j < array.length; j++){
//            System.out.println(array[j]);
//        }

//        System.out.println(array.length);

        int[] testArray = new int[10]; // testArray의 길이는 10이고

        int q = 100;
        for (int i = 0; i < testArray.length; i++){ // i는 0인데 i가 10보다 커지기 전까지 i++를 반복해줘
            testArray[i] = i+1; // testArray의 시작점은 0 + 1이야 => i가 0이기 때문
        } // 1~10

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(testArray));


        // i열 1~5 , j열 1~5 = i+j

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("[" + i + "+" + j + "]");
            }
        }

    }



}
