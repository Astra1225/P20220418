package co.edu.Board;

import java.util.Scanner;

public class BoardServiceArray implements BoardService {
	Scanner sc = new Scanner(System.in);
	Board[] Boards = new Board[10];
	
	@Override
	public void addBoard(Board board) {
		System.out.println("이름을 입력:");
		String bNm = sc.nextLine();
		System.out.println("전화번호를 입력");
		String bPn = sc.nextLine();
		
		for(int i =0; i < Boards.length; i++) {
			if (Boards[i] == null) {
				Boards[i] = new Board();
				System.out.println("글번호 입력 완료");
			}
		}
		
	}
	@Override
	public void modBoard(Board board) {
		System.out.println("수정할 번호 입력");
		String Cfn = sc.nextLine();
		
		for (int i = 0; i < Boards.length; i++) {
			if (Boards[i].getRegister().equals(Cfn)) {
				System.out.println("글 번호 수정 완료");
				break;
			}
		}
	}
	@Override
	public void remBoard(Board board) {
		System.out.println("삭제할 글번호 입력");
		String dFr = sc.nextLine();
		for(int i =0; i < Boards.length; i++) {
			if (Boards[i].getRegister())
		}
	}
	@Override
	public Board findBoard(Board board) {
		// TODO Auto-generated method stub
		return null;
	}

}
