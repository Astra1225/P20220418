package co.edu.inherit;

public class Bus extends Car {
	
	//필드.
	
	String busNo;
	
	//생성자.
	public Bus() {
		super();	//부모자식의 관계 super=> 부모.
		System.out.println("Bus() 생성자 호출.");
	}
	
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	
	public void drive(int a) {
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model= " +super.model + "]";
//		return super.toString();
	}
	
	

}
