package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		// MyUtil 클래스의 printMsg() 메소드를 호출해 보세요.
			//MyUtil.printMsg( )에서 ()안에 넣어야 할 것 
			//					(printMsg 는 String type 받음)
			//<=> String msg= " " 에서 "" 안의 내용 과 같으므로 
			//여기에 들어갈 수 있는 애 생각해서 적음 돼!
		MyUtil.printMsg("I'm hungry~~");
		
		String str= "안녕~!";
		MyUtil.printMsg(str);
	}
}
