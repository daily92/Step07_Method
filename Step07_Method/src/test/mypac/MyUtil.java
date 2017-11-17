package test.mypac;
/*
 *  [ �޼ҵ� �����ϱ� ]
 *  
 *  1. ���������� ?
 *  2. static or non static ?
 *  3. return ������ type ?
 *  4. �޼ҵ� �� ?
 *  5. �޼ҵ忡 ���� �޴� ������ ������ ������ type ?
 */
public class MyUtil {
	//default ������ (�� �ᵵ �⺻���� ����!/���� �ٸ� ������ ���� ��Ȳ)
	//public MyUtil() {
	//	
	//}
	
	// �޼ҵ� �����ϱ�
		//  1. ���������� ? public
		//  2. static or non static ? 
		//			static (�� Ŭ������ �Բ� static ������ �ö�. ���� �ϳ�)
		//  3. return ������ type ? void (��ȯ���� ����)
		//  4. �޼ҵ� �� ? showVersion
		//  5. �޼ҵ忡 ���� �޴� ������ ������ ������ type ?  ()
	public static void showVersion() {
		System.out.println("showVersion() ȣ���!");
	}
	
	public void sendMsg() {
		System.out.println("sendMsg() ȣ���!");
	}
	
	public static int getNum() {
		System.out.println("getNum() ȣ���!");
		return 10;	//void �ƴ� �̻� return �� ���ָ� ���� ��
	}
	
	public static String getMsg() {
		System.out.println("getMsg() ȣ���!");
		return "Hello! papa~";
	}
	
	public String getName() {
		System.out.println("getName() ȣ���!");
		return "�����";
	}
	/*
	 *  ���� ������ : public
	 *  static
	 *  return ������ type : Car
	 *  �޼ҵ� �� : getCar
	 *  �޼ҵ� ���� : ����
	 */
	public static Car getCar() {
		 // Car ��ü�� �����ؼ� �������� ������ ���� ����
			//Car type �� void �ϱ� new �ؾ߸� ���� �� �־�
		 Car car=new Car();
		 // ������ ����� �������� ������ �ش�.
		 return car;
	}
	
	// ���ڷ� String type �� �޴� �޼ҵ� ����
	public static void printMsg(String msg) {
		System.out.println("printMsg() ȣ���!");
	}
	
		//�����ڸ� �������� �ϵ�, �޼ҵ嵵 �������� �� �� �ִ�!
	// ���ڷ� Car type �� �޴� �޼ҵ�
	public static void useCar(Car car) {
		car.drive();
	}
	// ���ڷ� String type �� Car type �� ���� �޴� �޼ҵ�
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}
