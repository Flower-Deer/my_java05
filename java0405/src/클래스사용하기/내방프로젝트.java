package 클래스사용하기;

import 클래스만들기.강아지;
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] args) {
		//전화기 한대 넣어보세요.
		전화기 p1 = new 전화기();
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "애플사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		
		p1.통화하다();
		p1.사진을찍다();
		
		//전화기1대추가 + 강아지추가
		전화기 p2 = new 전화기();
		p2.size = 20;
		p2.speaker = "삼성사";
		p2.사진을찍다();
		p2.통화하다();
		
		강아지 h1 = new 강아지();
		h1.size = 50;
		h1.field = "포메";
		h1.꼬리를흔들다();
		h1.짖다();
		
	}

}
