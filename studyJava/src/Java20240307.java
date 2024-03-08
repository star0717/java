import java.util.*;

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

        for (int i = 0; i < numberList.length; i++){
            sum = sum + numberList[i];
        } // numberList[i]는 계속 증가됨 0 + 12 => 12 + 34 => 46 + 56...+69까지 도달하면 반복문 멈춤

        int average = sum / numberList.length; // sum은 0에서 위의 총 합산인 459로 나누어져있는 상태

        System.out.println(sum + " " + average);

        // 8. 사용자로부터 문자열을 입력 받아서 입력 받은 문자열을 거꾸로 출력
        Scanner sc1 = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String inputStr = sc1.nextLine();

        char[] charList1 = inputStr.toCharArray();
        char[] charList2 = new char [charList1.length];
        int index = charList2.length - 1;
        for (int i=0; i< charList1.length; i++) {
            charList2[index] = charList1[i];
            index = index - 1;
        }
        for (int i=0; i< charList2.length; i++) {
            System.out.print(charList2[i]);
        }
        System.out.println();


        // 난수생성법 , Random 숫자 만드는 법

        Random rd = new Random();
        int randNum = rd.nextInt();
        System.out.println(randNum);
        // intiger의 전체 범위에서 출력 (음수,양수 둘 다 가능)

        Random rd2 = new Random();
        int randNum2 = rd2.nextInt(10); // 0부터 압력한 (정수값 -1) 범위에서 랜덤
        // 1부터 출력하려면 rd.nextInt(10)+1;
        System.out.println(randNum2);

        // 9. 1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오
        // 단 중복 불가

        Random randClass = new Random();
        int[] lottoList = new int[6];

        // #1
//         for (int i = 0; i < lottoList.length; i++){
//             int temp = randClass.nextInt(45)+1; //temp
//             for (int j=0; j<i; j++){
//                 if(lottoList[j] == temp){
//                     temp = randClass.nextInt(45)+1;
//                     j = -1;
//                 }
//             }
//             lottoList[i] = temp;
//         }
//         System.out.print(Arrays.toString(lottoList));

        // #2
        for (int i = 0; i < lottoList.length; i++){
            lottoList[i] = randClass.nextInt(45)+1; // i는 1부터 45의 랜덤 수
            for (int j=0; j<i; j++){ // j는 0 j가 i값보다 작을 시 1씩 증가 => 총 여섯번 작동
                if(lottoList[j] == lottoList[i]){ // j와 i의 값이 동일할 시
                    i = i - 1; // i는 다시 1 감소 => 한번 더 실행
                }
            }
        }
        Arrays.sort(lottoList); // 오름차 순으로 정렬
        System.out.print(Arrays.toString(lottoList)); // 출력


        // Class

        class Students{
          String name = "tom";
          String gender;
          int grade;
        }

        Students byeol = new Students(); // 생성자
        byeol.name = "byeol";

    };
}
