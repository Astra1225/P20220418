package co.edu.collection;

import co.edu.friend.Friend;
import java.util.Scanner;

// 컬렉션 ArrayList
public class FriendServiceArray implements FriendService {
	Scanner sc = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		System.out.print("이름을 입력:");
		String fNm = sc.nextLine();
		System.out.print("전화번호를 입력:");
		String fPn = sc.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = new Friend();
				System.out.println("친구 추가 완료");
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
		System.out.print("수정할 이름을 입력:");
		String cFn = sc.nextLine();
		System.out.print("수정할 전화번호를 입력:");
		String fPn = sc.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(cFn)) {
				friends[i].setPhone(fPn);
				System.out.println("친구 변경 완료");
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		System.out.print("삭제할 친구를 입력:");
		String dFr = sc.nextLine();
		System.out.print("삭제할 전화번호를 입력:");
		String dPh = sc.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(dFr)) {
				friends[i] = null;
				System.out.println("친구 변경 완료");
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		System.out.print("찾을 친구를 입력:");
		String fFr = sc.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(fFr)) {

			System.out.println(friends[i].toString());
            break;
			}
		}
	return null;
}
}
