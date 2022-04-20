package co.edu.Board;

import java.util.ArrayList;

import co.edu.friend.Friend;

public interface BoardService {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int Full_list = 5;
	public int EXIT = 6;
	
	//추가, 수정, 삭제, 조회
	
	public void addBoard(Board board);
	public void modBoard(Board board);
	public void remBoard(Board board);
	public Board findBoard(Board board);



}
