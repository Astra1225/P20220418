package co.edu.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
	   BoardService Service = new BoardServiceArray();
	   
	   Scanner sc = new Scanner(System.in);
	   
	   while(true) {
		   System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.조회");
		   int menu = sc.nextInt();
		   
		   if (menu == BoardService.ADD) {
			   System.out.println("이름>>");
			   String name = sc.next();
			   System.out.println("연락처>>");
			   String phone = sc.next();
			   
			   
		   }
	   }

}
}
