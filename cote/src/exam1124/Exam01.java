package exam1124;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exam01 {
	public static void main(String[] args) {
		int[] values = {1, 3, 5, 7, 9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("인덱스를 선택하세요.");
		try {
			int index = scanner.nextInt();
			System.out.println(values[index]);
		} /* catch (InputMismatchException e) {
			System.out.println(values[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(values[0]);
		} */
		catch(Exception e) {
			System.out.println(values[0]);
		}
		scanner.close();
	}
	
	public static int getvalue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인덱스를 선택하세요.");
		int index = 0;
		try {
			index = scanner.nextInt();
		} catch(InputMismatchException e) {}
		
		scanner.close();
		return index;
	}
}
