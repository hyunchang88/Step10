package test.main;

import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		// Phone 객체를 생성해서 참조값을 Phone type 변수에 담기
		Phone a = new Phone();
		// a 에 들어 있는 참조값을 Object type 변수에 담기
		Object b = a;
		
		// a 는 Phone type 이기 때문에 call() 메소드 호출가능
		a.call();
		// b 는 Obhect type 이기 때문에 call() 메소드 호출불가능 
		//b.call();
	}
}
