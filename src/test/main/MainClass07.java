package test.main;

import test.mypac.Bus;
import test.mypac.Car;
import test.mypac.HandPhone;
import test.mypac.SmartPhone;
import test.mypac.Taxi;
import test.mypac.Truck;

public class MainClass07 {
	public static void main(String[] args) {
		// HandPhone 객체를 생성해서 참조값을 변수에 담기
		HandPhone p1 = new HandPhone();
		// ClassCastException 발생
		//SmartPhone p2 = (SmartPhone) p1;
		
		System.out.println("----------");
		
		Car c1 = new Car();
		Taxi c2 = new Taxi();
		Bus c3 = new Bus();
		Truck c4 = new Truck();
				
		c1.drive();
		c2.taxi_inTaxiClass();
		c3.bus_inBusClass();
		c4.truck_inTruckClass();
		
		System.out.println("----------");
		
		c2.taxi_price(10000);
		c3.bus_price(1250);
		c4.truck_price(0);
		
		System.out.println("----------");
		
		Car c12 = new Taxi();
		Car c13 = new Bus();
		Car c14 = new Truck();
		
		Taxi c22 = (Taxi) c12;
		Bus c23 = (Bus) c13;
		Truck c24 = (Truck) c14;
		
		c22.taxi_drive();
		c23.bus_drive();
		c24.truck_drive();
		
		
	}
}
