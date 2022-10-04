package 클래스사용하기;

import 클래스만들기.계좌정보;

public class 계좌만들기 {

	public static void main(String[] args) {
		계좌정보 my = new 계좌정보();
		my.계좌이름 = "입출금통장";
		my.금액 = 2000;
		my.이름 = "정유진";
		
		my.입금하다();
		my.출금하다();
	
		계좌정보 dad = new 계좌정보();
		dad.계좌이름 = "주택청약";
		dad.금액 = 20000;
		dad.이름 = "정의영";
		
		dad.입금하다();
		dad.출금하다();
	}

}
