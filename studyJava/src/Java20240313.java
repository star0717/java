import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Human{
    String name;
    int age;
    void eat () {}
    void sleep () {}
}

class Student extends Human{
    int studentID;
    void goToSchool () {};
}

class Worker extends Human{
    int workerID;
    void goToWork () {};
}

// ---------------------------------------

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Java20240313 {
    public static void main(String[]args){
//        Human h = new Human();
//        h.name = "byeol";
//        h.age = 26;
//        h.eat();
//        h.sleep();
//
//        Student s = new Student();
//        s.name = "yoonbyeol";
//        s.age = 24;
//        s.studentID = 0717;
//        s.eat();
//        s.sleep();
//        s.goToSchool();
//
//        Worker w = new Worker();
//        w.name = "seok";
//        w.age = 28;
//        w.workerID = 1203;
//        w.eat();
//        w.sleep();
//        w.goToWork();
//
//        // 아래 배열중에 짝수만 출력
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] % 2 == 0){
//                System.out.println(arr[i]);
//            }
//        }
//
//        // 아래 문자열의 글자수를 카운트
//        // 스페이스는 카운트하지 마시오
//        String string = "The best of both worlds";
//        String deleteSpace = string.replace(" ","");
////      String result = "";
//        System.out.println(deleteSpace.length());

//        char[] charArr = string.toCharArray();

//        System.out.println(Arrays.toString(charArr));

//        for (char i = 0; i < string.length(); i++){
//            char[] charArr = string.toCharArray();
//            Arrays.toString(charArr);
//         if (charArr[i] != ' '){
//            result += string.charAt(i);
//         }
//        }
//        System.out.println(result.length());

//        int [] arr2 = new int [] {1, 2, 3, 4, 5};
//
////        int n = 3;
//
//        System.out.println("Original array: ");
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        } // Original array: 1 2 3 4 5
//
//        System.out.println();
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        ArrayList<Integer> intList3 = new ArrayList<Integer>();
//
//        for(int i = 0; i < n; i++){ // 세번 반복
//            int j, first; // 변수 선언
//
//            first = arr2[0];  // 포인트 1
//
//            for(j = 0; j < arr2.length-1; j++){
//                arr2[j] = arr2[j+1]; // 2번째는 1번째 3번째는 2번째 .......
//            }
//            arr2[j] = first;  // 포인트 2
//        }
//        System.out.println();
////        System.out.println(arr2.length-1);
//
//        for(int i = 0; i< arr2.length; i++){
//            System.out.print(arr2[i] + " ");
//        }


        int [] arr2 = new int [] {1, 2, 3, 4, 5};

//        int n = 3;

        System.out.println("Original array: ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        } // Original array: 1 2 3 4 5

        System.out.println();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){ // n 번 반복
            int j, last; // 변수 선언

            last = arr2[arr2.length-1];  // 포인트 1

            for(j = arr2.length-1; j > 0; j--){
                arr2[j] = arr2[j-1]; // 2번째는 1번째 3번째는 2번째 .......
            }
            arr2[j] = last;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }


    }

    // --------------------------------------

    A a1 = new A();
    A a2 = new B();
    A a3 = new C();
    A a4 = new D();

    //B b1 = new A();
    B b2 = new B();
    B b3 = new C();
    B b4 = new D();

    //C c1 = new A();
//    C c2 = new B();
    C c3 = new C();
//    C c4 = new D();

//    D d1 = new A();
//    D d2 = new B();
//    D d3 = new C();
    D d4 = new D();
    // fix
}
