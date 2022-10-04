package 클래스사용하기;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public void open() {
	//public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 31, 201, 39);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(51, 255, 0));
		t1.setForeground(new Color(0, 0, 255));
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(235, 31, 239, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(12, 104, 201, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBackground(new Color(51, 255, 0));
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(235, 104, 239, 39);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(51, 255, 0));
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(235, 181, 239, 187);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(12, 255, 201, 39);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
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
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생함.!!!");
				}
			}
		});
		btnNewButton.setFont(new Font("양재소슬체S", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setBounds(122, 380, 206, 61);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
		
		
	}

}
