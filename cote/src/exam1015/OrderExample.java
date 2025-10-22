package exam1015;
import java.util.Scanner;
public class OrderExample {
	public static void main(String[] args) {
		/*Menu americano = new Menu("아메리카노", 4000);
		Menu ddalgilatte = new Menu("딸기라떼", 6000);
		Menu icecream = new Menu("아이스크림", 10000); 
		
		OrderItem o1 = new OrderItem(americano, 4);
		int price = o1.getPrice();
		System.out.println(price);
		
		OrderItem o2 = new OrderItem(ddalgilatte, 124);
		int price = o2.getPrice();
		System.out.println(price);
		*/
		
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