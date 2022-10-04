package 클래스사용하기;

import 클래스만들기.계산기2;

public class 내가게 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result = cal2.add(200, 100);
		double result2 = cal2.add(100, 22.2);
		double result3 = cal2.add(11.1, 22.2);
		String result4 = cal2.add("100", 200);
		int result5 = cal2.multi(3000, 4);
		int result6 = cal2.div(result5, 4);
		// 메서드 호출 >처리값을 main이 받아옴
		// 아래코드 받아온 값을 이용해야 하는 경우, return해야함.
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
		
	}

}
