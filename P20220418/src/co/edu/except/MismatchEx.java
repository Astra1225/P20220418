package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택>>");
			int menu = 0;

			try {
				Class.forName("java.lang.String"); // Exception
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}

			try {
				// "10" -> 10, "ten" -> 10 "" -> 10
				menu = Integer.parseInt(scn.next()); // scn.nextInt(); //RuntimeException
				return true;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위 넘어서 처리하려고 합니다.");

			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("숫자선택.");
				scn.nextLine();
			} catch (Exception e3) {
				System.out.println("알수 없는 예외 발생.");
				
			} finally {
				System.out.println("예외처리에서 반드시 한번은 실행.");

			}
			
			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu ==2) {
				
			}

		}
	}
}
