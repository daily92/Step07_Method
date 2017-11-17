package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작됨");
		
		// MyUtil 클래스의 getNum() 메소드를 호출해 보세요.
		MyUtil.getNum();
			//일케하고 run 하면, return 값은 안 가져와(debugging 으로 확인)
			//왜 return 값 10 안 가져오지??
			//MyUtil.getNum() 자리가 return 값인 10 가져와서 대체됨
			//가져온 것(return 값)을 쓰고 싶으면 
			//=> 변수명(a) 적고, 그 앞에 type(int) 적고
		int a= MyUtil.getNum();
			//return 값 확인방법? debugging
			// > MyUtil >debugging > F5 > F6 (x n번) 
			//=> 자동으로 MainClass02 로 넘어가서 a 변수에 return 값 넣어주는 과정 볼 수 있어!
		
		// MyUtil 클래스의 getMsg() 메소드를 호출하고
		// 리턴되는 값을 msg 라는 지역변수에 저장해 보세요.
		String msg= MyUtil.getMsg();
		
		// MyUtil 클래스에 정의된 getName() 메소드를 호출하고
		// 리턴되는 값을 name 라는 지역변수에 저장해 보세요.
		MyUtil u= new MyUtil();
		String name= u.getName();
	}
}
