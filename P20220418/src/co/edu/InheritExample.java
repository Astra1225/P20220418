package co.edu;

public class InheritExample {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.field1 = ""; //부모(Parent) 필드.
		c1.field1 = ""; //자식(Child) 필드.
		
		c1.method1();
		c1.method2();
		
		Child2 c2 = new Child2();
		c2.field1 = ""; //부모필드
		c2.field3 = ""; //자식필드
		
		c2.method1();
		c2.method3();
		
		//부모의 참조변수에 자식인스턴스를 할당.
		
		Parent p1 = new Parent();
		p1 = new Child1(); // int -> long, double(promotion)
		p1 = new Child2(); // //자동 형변환.
		
		p1.field1 = ""; // 부모가 필드, 메소드
		p1.method1(); //푸모가진 필드, 메소드.
		
		c2 = (Child2) p1; //강제형변환.
		c2.field1 = "";
		c2.field3 = "";
		
		c2.method1();
		c2.method3();
	}

}
