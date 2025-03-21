package day17;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File02 {

	public static void main(String[] args) throws IOException {
		// FileWriter를 통해 파일 쓰기
		
		// 파일이름(경로+파일명+확장자)
		FileWriter fw = new FileWriter("D:\\web_java_chc\\memo\\writer.txt");
		for(int i=1; i<=10; i++) {
			String data = i+".test !!\r\n";
			//파일에 쓰기.
			fw.write(data);
			fw.write("my I/O Test File \r\n");
			
		}
		fw.close();
		
		// 추가 모드 : 기존 파일에 데이터를 쓰려고 할 때
		FileWriter fw2 = new FileWriter
				("D:\\web_java_chc\\memo\\writer.txt", true);
		
		for(int i=11; i<=20; i++) {
			String data = i+".test !!\r\n";
			fw2.write(data);
			fw2.write("my I/O Test File \r\n");
		}
		fw2.close();
		
		// PrintWriter
		PrintWriter pw = new PrintWriter("writer2.txt");
		for(int i=1; i<=10; i++) {
			String data = i+". PrintWriter Test. \r\n";
			pw.write(data);
		}
		pw.close();
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("writer2.txt", true));
		for(int i = 11; i<=20; i++) {
			String data = i+" append mode. \r\n";
			pw2.write(data);
		}
		pw2.close();
		
		//바이트 기반 스트림
		FileOutputStream output = new FileOutputStream("out.txt");
		for(int i=1; i<=10; i++) {
			String data = i+". 바이트 기반 스트림 테스트 \r\n";
			output.write(data.getBytes());
		}
		output.close();
		
		
		
		
		
		
		
		
		
		
	}

}
