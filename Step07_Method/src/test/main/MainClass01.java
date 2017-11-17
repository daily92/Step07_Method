package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		// MyUtil 클래스에 정의한 showVersion() 메소드를 호출해 보세요.
			//showVersion 이 static 이니까 클래스명 . 으로 호출
		MyUtil.showVersion();
		
		// MyUtil 클래스에 정의한 sendMsg() 메소드를 호출해 보세요.
			//sendMsg 가 non static 이니까 
			//객체 생성(클래스명 객체명= new 클래스명();)해서 
			//객체명.메소드명(); 으로 호출
			//heap 영역에 참조값(ex.id=18) 이고 method 가 sendMsg(){} 인 
			//객체 생성 후, stack 영역에 u 라는 변수에 이 객체의 참조값(18)담음
		MyUtil u= new MyUtil();
		u.sendMsg();
			
			//객체 하나당 독립적으로 존재! 
			//(위와 같이 new MyUtil() 한다해서 같은 참조값 갖는 거 아니야~~)
			//(new 할 때마다 독립적으로 생성됨)
			//heap 영역에 참조값(ex.id=19) 이고 method 가 sendMsg(){} 인 
			//객체 생성 후, stack 영역에 u2 라는 변수에 이 객체의 참조값(19)담음
		MyUtil u2= new MyUtil();
		u2.sendMsg();
		
		//한 번 쓰고 안 쓸 거면 일케 써두 돼 (변수에 안 담고)
		new MyUtil().sendMsg();
		
		//변수에 담은 것은 언제든 다시 여러 번 쓸 수 있어
		u.sendMsg();
		u2.sendMsg();
	}
}
