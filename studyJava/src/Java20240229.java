public class Java20240229 {
    public static void main(String[] args) {

        // if ~ else --------------------------------------------------------------

        // if 단독 사용
        boolean x = true;

        if (x) {
            System.out.println("테스트중!!!");
        }
        // not (!) 사용
        if (!x) {
            System.out.println("이건 안보일걸");
        }

        // if ~ else
        if(x) {
            System.out.println("x = true");
        }else {
            System.out.println("x = false");
        }

        // if ~ else 여러개 사용
        boolean a = false;
        boolean b = false;
        boolean c = true;

        if (a) {
            System.out.println("a = true");
        }else if (b) {
            System.out.println("a = false / b = true");
        }else if (c) {
            System.out.println("a,b = false / c = true");
        }else {
            System.out.println("a,b,c = false");
        } // else 가 필요하지 않더라도 로그를 넣어준다.

        // 학점 코드 (범위를 나타내는 조건식)
        // 조건식에 사용된 범위가 전체를 100% 커버해야한다.
        // 중복 해당되도록 조건을 만들어선 안된다.
        int score = 91;

        if (score >= 91) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 아래 코드와 같이 관계가 없는 조건을 if else로 설정아면 안됨
        int num = 4;

        if (num > 0){
            System.out.println("num = 양수");
        } else if (num % 2 == 0){
            System.out.println("num = 짝수");
        }

        // 독립적인 if문으로 만드는 것이 좋다.
        if (num > 0){
            System.out.println("num = 양수");
        }
        if (num % 2 == 0){
            System.out.println("num = 짝수");
        }

        // if 문 속에 if문
        if (true){
            if (true){
                if (true){
                    System.out.println("if문 속에 if문");
                }
            }
        } // 가능은 하지만 지향하지 않는다. (댑스가 늘어나면서 가독성이 떨어지기 때문)
        System.out.println();

        //-------------------------------------------------------------------------


        // Switch -----------------------------------------------------------------

        int number = 2;
        switch (number){
            case 1:
                System.out.println("A");
                break; // break = 제어키워드 -> 대부분 case와 함께 사용한다.
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }

        //-------------------------------------------------------------------------

    }

}
