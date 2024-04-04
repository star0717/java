package Java20240404;

import java.io.*;

public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        // File Data
        // 1.파일 대상 설정
        File inFile = new File(FileObject.CURRENT + "/file1.txt");
        if (!inFile.exists()) {
            inFile.createNewFile();
        }
        // 2.대상에 연결되는 stream 생성
        InputStream is = new java.io.FileInputStream(inFile);
        // 3.데이터 읽기
        int data;
        while ((data = is.read()) != -1) {
            System.out.println("읽은 데이터 : " + (char) data + " 남은 바이트 " + is.available());
        }
        // 4.stream 종료
        is.close();
    }
}
