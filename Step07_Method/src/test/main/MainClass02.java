package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���۵�");
		
		// MyUtil Ŭ������ getNum() �޼ҵ带 ȣ���� ������.
		MyUtil.getNum();
			//�����ϰ� run �ϸ�, return ���� �� ������(debugging ���� Ȯ��)
			//�� return �� 10 �� ��������??
			//MyUtil.getNum() �ڸ��� return ���� 10 �����ͼ� ��ü��
			//������ ��(return ��)�� ���� ������ 
			//=> ������(a) ����, �� �տ� type(int) ����
		int a= MyUtil.getNum();
			//return �� Ȯ�ι��? debugging
			// > MyUtil >debugging > F5 > F6 (x n��) 
			//=> �ڵ����� MainClass02 �� �Ѿ�� a ������ return �� �־��ִ� ���� �� �� �־�!
		
		// MyUtil Ŭ������ getMsg() �޼ҵ带 ȣ���ϰ�
		// ���ϵǴ� ���� msg ��� ���������� ������ ������.
		String msg= MyUtil.getMsg();
		
		// MyUtil Ŭ������ ���ǵ� getName() �޼ҵ带 ȣ���ϰ�
		// ���ϵǴ� ���� name ��� ���������� ������ ������.
		MyUtil u= new MyUtil();
		String name= u.getName();
	}
}
