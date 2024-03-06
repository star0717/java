public class Java20240306 {
    public static void main (String[] args){
        String str1 = "Hello Java!";
        String str2 = "반갑습니다!";

        // = 문자열 길이 출력
        System.out.println(str1.length());
        System.out.println(str2.length());

        // 문자열 검색
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('a')); // 첫 a 위치 출력
        System.out.println(str1.lastIndexOf('a')); // 마지막에서부터 a 출력
        System.out.println(str1.indexOf('a', 8)); // a 를 8번째 문자열부터 검색 후 출력
    }
}
