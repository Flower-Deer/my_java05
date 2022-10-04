 package 클래스만들기;

public class 벽돌틀 {
	// 하드웨어(물건) 개념
	// 속성(성질) == property, attribute
	// 기능(동작) == function, 함수
	// 틀을 만들기위해서는 물건들이 가지는 공통된 속성, 동작을 정의해야함.
	
	// 속성 --> x,y(멤버변수)
	public int x;
	public int y; // 멤버변수는 자동초기화(0)
	
	// 동작 --> 쌓다.(동사형태, 멤버메서드)
	// *public : 접근제어자. 아무패키지나 다 접근 가능!
	public void 쌓다() {
		//동작 정의. 여러 줄 가능!!!
		System.out.println("벽돌을 쌓다.");
	}



}
