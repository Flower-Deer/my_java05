package 클래스사용하기;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 내방다루기 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
		// java 프로그램 밖에있는 자원들(네트워크, DB, 파일, etc)을 연결할 때
		// 프로그램이 실행되지 못하는 위험한 상황을 인식
		// 반드시 위험상황시 어떻게 처리할지 명시(catch)
		try {
			// file.txt와 자바프로그램간 스트림(강물,통로)을 만들어라!
			FileWriter file = new FileWriter(s1 + ".txt");
			// 스트림을 통해서 데이터를 보내라.
			file.write(s1 + "\n");
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			// 스트림이 닫힐 때 다 보냈다고 인식함.
			file.close();
		} catch (Exception e) {
			System.out.println("파일에 저장 중 에러발생함.!!!");
		}
		
	}

}
