package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		// MyUtil Ŭ������ printMsg() �޼ҵ带 ȣ���� ������.
			//MyUtil.printMsg( )���� ()�ȿ� �־�� �� �� 
			//					(printMsg �� String type ����)
			//<=> String msg= " " ���� "" ���� ���� �� �����Ƿ� 
			//���⿡ �� �� �ִ� �� �����ؼ� ���� ��!
		MyUtil.printMsg("I'm hungry~~");
		
		String str= "�ȳ�~!";
		MyUtil.printMsg(str);
	}
}
