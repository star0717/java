public class Java20240311 {
    static int a = 1;
    static int b = 2;
    public static void main(String[] args) {
        System.out.println(plusNums());
        System.out.println(plusNums(4,5));
        int[] intArray = {1,2,3,4,5};
        System.out.println(plusNums(intArray, intArray.length));
        System.out.println(plusNums(1,2,3,4,5,6));
    }
    // 메소드의 오버로딩
    public static int plusNums() {
        return a + b;
    }
    public static int plusNums(int x, int y) {
        // plusNums, int => method signature
        return x + y;
    }
    // 메소드의 오버로딩
    public static int plusNums(int[] intArray, int length) {
        int sum = 0;
        for (int i=0; i< intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }
    // =>메소드의 시그니처가 각각 다르므로 오류가 나지 않는다.
    // 인스턴스화 되지 않아도 static을 사용해서 이용 가능

    // 가변길이 배열 입력법이 필요한 이유
//    public static int plusNums(int a, int b, int c, int d, int e){
//        return a + b + c + d + e;
//    }
//    public static int plusNums(int a, int b, int c, int d, int e, int f){
//        return a + b + c + d + e + f;
//    }

    public static int plusNums(int...values){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }
}
