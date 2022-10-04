package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\java-workspace\\java04\\자두일기.png"));
		lblNewLabel.setBounds(148, 29, 180, 232);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(36, 271, 139, 45);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(206, 271, 207, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 :");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(36, 343, 139, 51);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(206, 349, 207, 45);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				if (s1.equals("root") && s2.equals("1234")) {
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인 실패입니다.");
				}
				t1.setText("");
				t2.setText("");
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\java-workspace\\java04\\L.png"));
		b1.setBounds(36, 450, 188, 203);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\java-workspace\\java04\\reset.png"));
		b2.setBounds(250, 450, 188, 203);
		f.getContentPane().add(b2);
		f.setVisible(true);
		
		
		
	}
}
