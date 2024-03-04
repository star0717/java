public class Java20240304 {
    public static void main(String[] args) {
        //for 문 기본 문법 구조
        int a; // for 문의 반복 횟수를 지정하는 변수를 외부에서 선언
        for (a = 0; a < 3; a++){
            System.out.println(a+"");
        }
        System.out.println();

        for (int i = 0; i < 3; i++){ // for 문의 반복ㄷ
            System.out.println(i + "");
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(i + "");
        }
        System.out.println();
        for (int i = 0; i > 0; i--){
            System.out.println(i + "");
        }
        System.out.println();
        for (int i = 0; i < 10; i += 3){
            System.out.println(i + "");
        }
        System.out.println();
        for (int i = 0, j = 0; i < 10; i++, j++){
            System.out.println(i + j + "");
        }
    }
}
