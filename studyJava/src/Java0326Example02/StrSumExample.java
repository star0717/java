package Java0326Example02;

import java.util.Arrays;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        char[] strArray = str.toCharArray();
        System.out.println(Arrays.toString(strArray));
        int[] newArray = new int[strArray.length];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = Integer.parseInt(String.valueOf(strArray[i]));
        }
        for (int i =0; i < newArray.length; i++){
            System.out.println("newArr["+i+"]"+newArray[i]);
        }


        for(int i = 0; i < newArray.length; i++){
            int sum = 0;

        }

    }
}
