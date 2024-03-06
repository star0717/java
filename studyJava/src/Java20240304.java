public class Java20240304 {
    public static void main(String[] args) {

        //for 문 기본 문법 구조
        int a; // for 문의 반복 횟수를 지정하는 변수를 외부에서 선언
        for (a = 0; a < 3; a++){
            System.out.println(a);
        }
        System.out.println();

        for (int i = 0; i < 3; i++){ // for 문의 반복 횟수를 지정하는 변수를 초기에서 선언
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i > 0; i--){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i += 3){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0, j = 0; i < 10; i++, j++){
            System.out.println(i + j);
        }

        int i = 0;
        for(; ; ){
            if (i < 5){
                System.out.println(i + " ");
                i++;
            }else {
                break;
            }
        }
        System.out.println();

        // 멀티 조건식
        for (int c=0, d=0; c < 5 || d < 5; c++, d++){
            System.out.println(c + "_" + d + " ");
        }

        // ---------------------------------------------------------------------------------------------
        //while 문

        int count = 0; // 초기식
        while (count < 5){ // 조건식
            System.out.println(count);
            count ++; // 증감식
        }

        //의도적인 무한루프에서 while문은 자주 쓰임
       /* while (true){
            // 무한루프
            // 유저가 버튼 클릭할 때 까지 대기
            // if (esc버튼 클릭){
                break;
            }
        } */
        System.out.println();

        // do ~ while 문

        int cnt = 0; // 초기식
        do { // 실행
            System.out.println(cnt);
            cnt ++;
        } while (cnt < 5); // ~하는 동안
        /*
            아래 while문과 비교하면 반복문의 조건이 false가 되는 경우,
            do ~ while문은 실행코드가 1회 실행되는 반면 while문은 실행되지 않음
        * */
        int cnt2 = 5;
        while (cnt2 < 5){
            System.out.println(cnt2);
            cnt2 ++;
        }
        // ---------------------------------------------------------------------------------------------

        // 이중루프, 이중반복문
        for (int o = 0; o < 3; o++){
            for (int j = 0; j < 5; j++){
                System.out.println("o = " + o + ", j + " + j + " ");
            }
        } // 외부 for문 하나 당 내부 for문 실행
        System.out.println();
        // ---------------------------------------------------------------------------------------------
        
        // 배열 (array)

        String[] colorList = {"red", "blue", "yellow"}; // 배열의 순서 = index
        System.out.println(colorList[0]); // 0부터 시작함

        for (int f = 0; f < 3; f ++){
            if (colorList[f] == "blue"){
                System.out.println("Hi I am blue :)!");
            }
        }
        // 기본 선언법
        int[] intArray1 = {1,2,3,4,5};
        System.out.println(intArray1[0]);

        int[] intArray2 = new int[5];

        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        System.out.println(intArray2[4]);

        int[] intArray3 = new int[5];
        // int[] intArray3 = 가변의 길이를 가진 배열을 저장함.
        for (int k = 0; k < intArray3.length; k ++ ){
            intArray3[k] = k+1;
            System.out.print(intArray3[k] + " ");
        }
        System.out.println();

        int[] intArray4 = new int[]{1,2,3,4,5};
        System.out.println(intArray4[0]);

        System.out.println();

        // 배열의 복사 (= 참조복사)
        String[] str1 = {"black","red","blue"};
        String[] str2 = str1;
        System.out.println("1 " + str2[0]);
        str2[0] = "white";
        System.out.println("2 " + str2[0]);
        System.out.println("3 " + str1[0]);

        // 기본 자료형의 복사 (= 값 복사)
        int y = 3;
        int x = y;
        System.out.println("1 "+ x);
        y = 6;
        System.out.println("2 "+ x);
        System.out.println("3 "+ y);


    }
}
