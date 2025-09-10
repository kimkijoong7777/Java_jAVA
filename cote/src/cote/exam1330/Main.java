package cote.exam1330;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] strs = input.split(" ");
		
		int num = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		
		if(num > num2) {
			System.out.println(">");
		}
		else if(num < num2) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}		
		scanner.close();
	}
}