package co.edu;

import co.edu.friend.Friend;

public class ModifierExample {

	class Friend2 extends Friend {

		public Friend2() {
			super(); // 생성자 호출
			this.getName(); // protected
			this.getPhone(); // default

		}

		public static void main(String[] args) {
			Friend friend = new Friend();
		}

	}
}
