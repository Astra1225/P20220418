package cd.edu.abstracts;

public abstract class Animal {
	//Animal() 생성자로 인스턴스 생성 X.
	
	public Animal() {
		
	}
	
	public abstract void eat(); // 강제로 eat() 구현하도록.
	
	public abstract void run();
	
	public void sleep() {
		System.out.println("둥물이 잠을 잡니다.");
	}
}
