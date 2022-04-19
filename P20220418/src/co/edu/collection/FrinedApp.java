package co.edu.collection;

import java.util.Scanner;

//친구목록저장하기 위한 App.
//추가, 수정, 삭제, 조회
//1)배열 2)컬렉션 <= 인터페이스 구현.
public class FrinedApp {
	public static void main(String[] args) {
		FriendService Service = new FriendServiceArray();
//		FriendService Service = new FriendServiceList();
		//추가, 수정, 삭제, 조회 -> 컨트롤 역할
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 친구등록 2. 친구변경 3. 친구삭제 4. 친구찾기");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("친구등록>>");
				Service.addFriend(null);
			}
			else if(menu == 2) {
				System.out.println("친구변경");
				Service.modFriend(null);
			}
			else if(menu == 3) {
				System.out.println("친구삭제");
				Service.remFriend(null);
			}
			else if(menu == 4) {
			Service.findFriend(null);

		} else {
			break;
		}
			 System.out.println("프로그램을 종료합니다.");
	}
	

}
	

}

