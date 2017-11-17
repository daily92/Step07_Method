package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		// MyUtil Ŭ������ ������ showVersion() �޼ҵ带 ȣ���� ������.
			//showVersion �� static �̴ϱ� Ŭ������ . ���� ȣ��
		MyUtil.showVersion();
		
		// MyUtil Ŭ������ ������ sendMsg() �޼ҵ带 ȣ���� ������.
			//sendMsg �� non static �̴ϱ� 
			//��ü ����(Ŭ������ ��ü��= new Ŭ������();)�ؼ� 
			//��ü��.�޼ҵ��(); ���� ȣ��
			//heap ������ ������(ex.id=18) �̰� method �� sendMsg(){} �� 
			//��ü ���� ��, stack ������ u ��� ������ �� ��ü�� ������(18)����
		MyUtil u= new MyUtil();
		u.sendMsg();
			
			//��ü �ϳ��� ���������� ����! 
			//(���� ���� new MyUtil() �Ѵ��ؼ� ���� ������ ���� �� �ƴϾ�~~)
			//(new �� ������ ���������� ������)
			//heap ������ ������(ex.id=19) �̰� method �� sendMsg(){} �� 
			//��ü ���� ��, stack ������ u2 ��� ������ �� ��ü�� ������(19)����
		MyUtil u2= new MyUtil();
		u2.sendMsg();
		
		//�� �� ���� �� �� �Ÿ� ���� ��� �� (������ �� ���)
		new MyUtil().sendMsg();
		
		//������ ���� ���� ������ �ٽ� ���� �� �� �� �־�
		u.sendMsg();
		u2.sendMsg();
	}
}
