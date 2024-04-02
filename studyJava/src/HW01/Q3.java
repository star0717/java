package HW01;

    /*  1) 아래의 필드를 가지는 Student 클래스를 선언하시오
            String name // 학생이름
            int ban // 반
            int no // 번호
            int kor // 국어점수
            int eng // 영어점수
            int math // 수학점수
        2) main 메서드의 실행결과가 표시된대로 출력되도록 toString을 오버라이딩하시오
        3) 평균값을 계산하는 getAvg 메서드를 만드시오

        결과 예시
        1반 3번 동수 : 평균 90점
        2반 10번 창수 : 평균 78점
        3반 27번 영철 : 평균 86점
    */

    /*  1) 아래의 필드를 가지는 Student 클래스를 선언하시오
            String name // 학생이름
            int ban // 반
            int no // 번호
            int kor // 국어점수
            int eng // 영어점수
            int math // 수학점수
        2) main 메서드의 실행결과가 표시된대로 출력되도록 toString을 오버라이딩하시오
        3) 평균값을 계산하는 getAvg 메서드를 만드시오

        결과 예시
        1반 3번 동수 : 평균 90점
        2반 10번 창수 : 평균 78점
        3반 27번 영철 : 평균 86점
    */

public abstract class Q3 {
    public abstract float getAvg();
    public static void main(String[] args) {
        Students a = new Students("동수", 1, 3, 90, 80, 100);
        Students b = new Students("창수", 2, 10, 80, 70, 85);
        Students c = new Students("영철", 3, 27, 95, 75, 90);
        System.out.println(a.toString() + " : 평균 " + a.getAvg() + "점"); //1반 3번 동수 : 평균 90점
        System.out.println(b.toString() + " : 평균 " + b.getAvg() + "점"); //2반 10번 창수 : 평균 78점
        System.out.println(c.toString() + " : 평균 " + c.getAvg() + "점"); //3반 27번 영철 : 평균 86점
    }


}

