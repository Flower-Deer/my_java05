package 클래스만들기;

public class 전화기 {
	// 공통적인 성질: : 사이즈, 스피커
	// ==>멤버변수, 값을 넣지x 선언만! 자동초기화시켜줌
	public int size;
	public String speaker;
	// 자동 초기화 = 멤버변수, 뱌열
	
	// 동작(기능)을 정의 : 통화하다, 사진을 찍다
	public void 통화하다() {// 반드시 기능은 소괄호 넣어야함
	// 처리동작 순서대로 써준다
		System.out.println("전화기로 통화하다.");
	}
	public void 사진을찍다() {
		System.out.println("전화기로 셀카를 찍다.");
	}
}
