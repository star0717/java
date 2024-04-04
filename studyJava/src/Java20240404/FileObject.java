package Java20240404;

import java.io.File;

public class FileObject {
    public static void main(String[] args) {
        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);

        // 절대경로
        File tempDir = new File("C:/Users/admin/Documents/GitHub/java/studyJava/temp");

        if (tempDir.exists()) {
            System.out.println("폴더가 이미 존재합니다.");
        }
        else {
            System.out.println("폴더를 새로 생성합니다.");
            tempDir.mkdir();
        }
    }
}
