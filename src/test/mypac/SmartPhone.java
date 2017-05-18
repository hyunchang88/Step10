package test.mypac;

public class SmartPhone extends HandPhone {
	// 이미 HandPhone 라는 클래스에서 Object, Phone 클래스를 상속받았으니
	// HandPhone 클래스만 상속 받으면 전부다 상속 받은것과 마찬가지 효과
	
	// 부모 클래스에 정의된 메소드 재정의 (오버라이딩)
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
	
	public void doInternet(){
		System.out.println("인터넷을 해요~~");
	}
}
