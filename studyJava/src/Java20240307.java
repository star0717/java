import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java20240307 {
    public static void main (String[] args){
        // 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오

        int[] intList1 = {1,2,3,4,5,6,7,8,9,10};

        Scanner scan = new Scanner(System.in);
        System.out.print("0부터 10까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();

        for (int i = 0; i < intList1.length; i++){ // 0이 10보다 작을 경우 까지만 반복 부탁해
            if (intList1[i] > num){ // intList[i] = 0 / num = 사용자가 입력한 수
                // 사용자가 입력한 수 보다 배열에 있는 더 높은 수만
                System.out.print(intList1[i]+ " "); // 출력해줘
            }
        }

        // 새로운 배열에 담기
        int[] intList2 = new int[intList1.length]; // 가지고 있는 인덱스는 총 0-9로 열개
        int count = 0;
        for (int i = 0; i < intList1.length; i++){
            if (intList1[i] > num){
                intList2[count] = intList1[i]; // 1을 입력시 count는 동일하게 1
                count = count + 1; // 출력할 땐 그 값의 1을 더해서 (문제가 더 큰 수를 출력 해야하기 때문)
            }
        }

        // 새로운 배열에 담기 : ArrayList 사용하기
        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        // 데이터 타입은 지정하되 갯수는 상관하지 않는다
        // Integer = 클래스 데이터 타입 ex) doble = Doble 대문자, 꺽쇠 사용
        for (int i = 0; i < intList1.length; i++){
            if (intList1[i] > num) {
                intList3.add(intList1[i]); // 비어있는 intList3에 남은 갯수만큼 추가해서 출력해줘
            }
            // 출력은 하지만 남은 칸은 0으로 채워진다
            // 인덱스는 총 열개로 고정값이기 때문에 변하지 않으므로.
        }

        System.out.println(Arrays.toString(intList2));
        System.out.println(intList3.toString());

        // 7. 아래 배열의 총합과 평균을 구하시오

        int[] numberList = {12,34,56,32,84,99,73,69};

        int sum = 0;
        for (int sum){

        }
    };
}
