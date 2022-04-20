package co.edu.except;

import java.util.Scanner;

public class MultiLineExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			String str = "";
			while(true) {
				str += scn.nextLine();
				if(str.equals("")) {
					break;
				}
			}
		
			System.out.println(str.toString());
		}

	}


