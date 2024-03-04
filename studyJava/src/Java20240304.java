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

    }
}
