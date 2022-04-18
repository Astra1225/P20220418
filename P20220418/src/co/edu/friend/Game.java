package co.edu.friend;

import java.util.Scanner;

public class Game {
	public static void main(String args) {
		
//	System.out.println("[*] [*] [*] [*] [*]");
//	System.out.println("[4] [*] [*] [*] [*]");
		
		int[] Array = new int[5];
		
		System.out.print("숫자맞추기(1~5):");
		for(int i =0; i < Array.length; i++) {
			int num = (int)(Math.random()*4)+1;
			Array[i] = num;
		for(int j = 0; j < i; j++) {
			if(Array[i] == Array[j]) {
				i--;
				break;
			}
		}
		}
		
		int[] problem = new int[5];
			
		
		for (int i = 0; i <5; i++) {
			problem[i] = i + 1;
		}
		for (int i =0; i <5; i++) {
			if( i == 3) {
				System.out.println("[" + problem[i] + "]");
			} else {
				System.out.print("[*]");
			}
		}
	}
}
