package co.edu.poly;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=0; i<8; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				car.frontLeft = new Tire("앞왼쪽 재생타이어로 교체합니다.", 3);
				break;
			case 2:
				car.frontRight = new Tire("앞오른쪽 중고타이어로 교체합니다.", 2);
				break;
			case 3:
				car.backLeft = new HankookTire("앞오른쪽 한국타이어로 교체합니다.", 12);
				break;
			case 4:
				car.backRight = new KumhoTire("앞오른쪽 금호타이어로 교체합니다.", 15);
				break;
			}
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------");
		}
		
	}

}
