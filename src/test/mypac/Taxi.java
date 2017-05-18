package test.mypac;

public class Taxi extends Car{
	public void taxi_inTaxiClass(){
		System.out.println("택시 비싸");
	}
	public void taxi_price(int taxi_price){
		System.out.println("택시 가격은 : "+taxi_price+"원");
	}
	public void taxi_drive(){
		System.out.println("택시타고 달려요~");
	}
}
