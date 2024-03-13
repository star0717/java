import App.Students;

public class Java20240308 {
    public static void main(String[] args) {
        Students tom = new Students("Tom", 18, "Daejeon", "123456");
        Students steve = new Students("Steve", 25, "Seoul", "246810");
        // System.out.println(byeol.name); // Field 활용 *private 걸어놔서 에러남 public만 출력

        Students paul = new Students();
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");

        tom.displayAll(); // Method 활용
        steve.displayAll();
        paul.displayAll();

        System.out.println(tom.getPersonalNum());

        // 메서드 호출
        int[] numberList = {12,34,56,32,84,99,73,69};
        int[] numberList2 = {1,2,3,4,5,6,7,8,9};
        getSumAvg(numberList);
        getSumAvg(numberList2);

       

    }

    static void getSumAvg(int[] numberList){
        // 배열의 총합 및 평균값 출력 메서드
        int sum = 0;
        for (int i = 0; i < numberList.length; i++){
            sum = sum + numberList[i];
        } // numberList[i]는 계속 증가됨 0 + 12 => 12 + 34 => 46 + 56...+69까지 도달하면 반복문 멈춤
        int average = sum / numberList.length; // sum은 0에서 위의 총 합산인 459로 나누어져있는 상태
        System.out.println(sum + " " + average);
    }
    // static 클래스 안에서는 무조건 staric메서드 사용
    // public 을 붙여주면 어디서든 사용 가능
    // 메서드 안에 있는 변수 => 지역변수 (local variable)
}
