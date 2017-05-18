package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		p1.call(); // Phone 클래스에 정의된 기능 사용가능
		p1.mobileCall(); // HandPhone 클래스에 정의된 기능 사용가능
		p1.takePicture();
		
		System.out.println("-----");
		
		SmartPhone p2 = new SmartPhone();
		p2.call(); // Phone 클래스에 정의된 기능 사용가능
		p2.mobileCall(); // HandPhone 클래스에 정의된 기능 사용가능
		p2.takePicture();
		p2.doInternet(); // SmartPhone 클래스에 정의된 기능 사용가능
	}
}
