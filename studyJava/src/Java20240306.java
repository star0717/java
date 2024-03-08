import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Java20240306 {
    public static void main (String[] args){
        String str1 = "Hello Java!";
        String str2 = "반갑습니다!";

        // = 문자열 길이 출력
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();
        // 문자열 검색
        System.out.println(str1.charAt(1)); // e의 자릿수 출력
        System.out.println(str1.indexOf('a')); // 첫 a 위치 출력
        System.out.println(str1.lastIndexOf('a')); // 마지막에서부터 a 출력
        System.out.println(str1.indexOf('a', 8)); // a 를 8번째 문자열부터 검색 후 출력
        System.out.println(str1.indexOf("Java")); // 대소문자 구분함,  J의 위치를 출력

        // 문자열 변환 및
        double dValue = 2.3;
        System.out.println();
        String str3 = String.valueOf(dValue);
        // String str3  = 2.3; = 타입이 맞지 않아서 출력되지 않기 때문에 valueOf를 붙임
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);

        // 문자열 연결
        String str5 = str1.concat(str2);
        String str6 = str1.concat("키키");
        System.out.println(str5);
        System.out.println(str6);

        // 문자열 byte[]로 변환
        String str7 = "Hello Java222!";
        String str8 = "자바야 난 배가 고파";
        byte[] array1 = str7.getBytes();
        byte[] array2 = str8.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        // 문자열 char[]로 변환
        char[] array3 = str7.toCharArray();
        char[] array4 = str8.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

        // 문자열 수정
        String str9 = " Let's study Java! ";
        String str10 = " Let's study Java! ";
        String str11 = " let's study java! ";
        String[] str12 = "Name:Byeol/Female".split(":|/");
        System.out.println(str9.replace("study", "공부"));
        System.out.println(str9.replaceAll(" ", "")); // 문자열 공백 모두 제거
        System.out.println(str9.toLowerCase());
        System.out.println(str9.toUpperCase());
        System.out.println(str9.substring(0,5));
        System.out.println(str9.trim());
        System.out.println(str9.equals(str11));
        System.out.println(str9.equalsIgnoreCase(str10));
        System.out.println(Arrays.toString(str12));

        // 자바에서 입력값을 받는 방법
        //Scanner sc = new Scanner(System.in); // 1. 스캐너라는 자료형 변수 선언 (새로운 메모리 영역을 Heap에 생성)
        //System.out.print("0~6까지 숫자를 입력해주세요 : ");
        //int inputNumber = sc.nextInt(); // 2.nextInt : 사용자가 입력을 할 때까지 프로세스가 정지됨
        //if (inputNumber >= 0 && inputNumber <= 6){
        //   System.out.println(inputNumber);
        //} else {
        //    System.out.println("잘못 입력 하셨습니다.");
        //}

        //System.out.println(inputNumber);

        // 자바에서 문자열을 입력받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("What your Name?");
//        String  inputStr = sc.nextLine();
//        System.out.println(inputStr);


        //------------------------------------------------------------------------------

        // 예제 문제
        // 길이가 10인 배열에 1부터 10까지 값을 출력하시오.
        int[] testArray = new int[10]; // testArray의 길이는 10이고
        for (int i = 0; i < 10; i++){ // i는 0인데 i가 10보다 커지기 전까지 i++를 반복해줘
            testArray[i] = i + 1; // testArray의 시작점은 0 + 1이야 => i가 0이기 때문
        }
        System.out.println(testArray);

        // 위의 출력값을 거꾸로 출력시키시오.
        int[] testArray2 = new int[10];
        int len = testArray2.length;
        for (int i = 0; i < testArray2.length; i++){ //
            testArray2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(testArray2));

        // 아래 과일 배열에 "사과"가 몇 번 들어있는지 확인하시오
        String[] fruitList = {"pear","apple","banana","strawberry","apple","watermellon"};

        int count = 0;
        String isApple = "apple";
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == "apple"){
                count = count + 1;
            }
        }
        System.out.println(count);

//         4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력하시오.
//        char[] week = {'월','화','수','목','금','토','일'}; // 0,1,2,3,4,5,6
//        Scanner scan = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//
//        if (num >= 0 && num <= 6){
//           System.out.println(week[num]);
//           break;
//        } else {
//            System.out.println("잘못 입력 하셨습니다.");
//        }

        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // 00님 환영합니다를 출력 / 아닐 시 회원가입 문구 출력
        String[] members = {"Steve","Tom","Michael","Laura","Jessica","Annie"};
        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String name = scan.nextLine();

        boolean isMember = false; // 참, 거짓을 분별해주는 역할

        for (int i = 0; i < members.length; i++){
            if (members[i].equalsIgnoreCase(name)){
                isMember = true;
                System.out.println(members[i] + "님 환영합니다!");
            }
        } // => 인덱스값(6)보다 i(0)가 작을 경우 1씩 증가시키고
        // 만약 members , name이 같으면 isMember는 true로 변환한다
        // 6과 같아지기 전까지 반복한다.
        // i는 members의 인덱스 값 ex) 1 = Tom
        if(isMember == false){ // 만약 isMember 가 false 상태라면 에러메세지
            System.out.println("회원가입을 진행해주세요!");
        }

        // 선생님 예제코드
        // #1
        boolean found = false;
        for (int i = 0; i < members.length; i++){
            if (members[i].equalsIgnoreCase(name)){
                System.out.println(members[i] + "님 환영합니다");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("회원가입을 진행해주세요");
        }
        // #2
        for (int i = 0; i < members.length; i++) {
            if (members[i].equalsIgnoreCase(name)) {
                System.out.println(members[i] + "님 환영합니다");
                break;
            }
            if (i == members.length - 1){
                System.out.println("회원가입을 진행해주세요");
            }
        }
        // #3
        int k = 0;
        for (; k < members.length; k++) {
            if (members[k].equalsIgnoreCase(name)) {
                System.out.println(members[k] + "님 환영합니다");
                break;
            }
        }
        if (k == members.length ){
            System.out.println("회원가입을 진행해주세요");
        }

        int a;



    }
}

