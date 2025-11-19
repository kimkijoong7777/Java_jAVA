package exam1105;

import java.util.Scanner;

import exam1015.Menu;
import exam1015.OrderItem;

public class OrderExample {
	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("아메리카노", 4000);
		menus[1] = new Menu("딸기라떼", 6000);
		menus[2] = new Menu("아이스크림", 10000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		if(menuIndex >= 0 && menuIndex < menus.length && quantity > 0 ) {
			OrderItem o = new OrderItem(menus[menuIndex], quantity);
			System.out.println(o.getPrice());
		}
	}
}
