package cote.exam10869;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] strs = input.split(" ");
		
		int num = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		
		System.out.println(num+num2);
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/num2);
		System.out.println(num%num2);
		
		scanner.close();
	}
}