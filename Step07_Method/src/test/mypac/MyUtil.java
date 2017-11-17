package test.mypac;
/*
 *  [ 메소드 정의하기 ]
 *  
 *  1. 접근지정자 ?
 *  2. static or non static ?
 *  3. return 데이터 type ?
 *  4. 메소드 명 ?
 *  5. 메소드에 전달 받는 인자의 개수와 데이터 type ?
 */
public class MyUtil {
	//default 생성자 (안 써도 기본으로 있음!/현재 다른 생성자 없는 상황)
	//public MyUtil() {
	//	
	//}
	
	// 메소드 정의하기
		//  1. 접근지정자 ? public
		//  2. static or non static ? 
		//			static (이 클래스와 함께 static 영역에 올라가. 오직 하나)
		//  3. return 데이터 type ? void (반환값이 없다)
		//  4. 메소드 명 ? showVersion
		//  5. 메소드에 전달 받는 인자의 개수와 데이터 type ?  ()
	public static void showVersion() {
		System.out.println("showVersion() 호출됨!");
	}
	
	public void sendMsg() {
		System.out.println("sendMsg() 호출됨!");
	}
	
	public static int getNum() {
		System.out.println("getNum() 호출됨!");
		return 10;	//void 아닌 이상 return 안 써주면 오류 떠
	}
	
	public static String getMsg() {
		System.out.println("getMsg() 호출됨!");
		return "Hello! papa~";
	}
	
	public String getName() {
		System.out.println("getName() 호출됨!");
		return "흰둥이";
	}
	/*
	 *  접근 지정자 : public
	 *  static
	 *  return 데이터 type : Car
	 *  메소드 명 : getCar
	 *  메소드 인자 : 없음
	 */
	public static Car getCar() {
		 // Car 객체를 생성해서 참조값을 변수에 담은 다음
			//Car type 은 void 니까 new 해야만 얻을 수 있어
		 Car car=new Car();
		 // 변수에 저장된 참조값을 리턴해 준다.
		 return car;
	}
	
	// 인자로 String type 을 받는 메소드 정의
	public static void printMsg(String msg) {
		System.out.println("printMsg() 호출됨!");
	}
	
		//생성자를 다중정의 하듯, 메소드도 다중정의 할 수 있다!
	// 인자로 Car type 을 받는 메소드
	public static void useCar(Car car) {
		car.drive();
	}
	// 인자로 String type 과 Car type 을 전달 받는 메소드
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}
