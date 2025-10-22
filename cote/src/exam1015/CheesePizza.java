package exam1015;

public class CheesePizza extends Pizza {
	public String name = "치즈 피자";
	public String size;
	int[] prices = {10000, 15000, 25000};
	
	public CheesePizza() { 
		size = "M";
	}
	public CheesePizza(String size) {
		this.size = size;
	}
	public void cook() {
		System.out.println(name + size + "을 조리합니다.");
		System.out.println(name + size + "이 완성되었습니다.");
	}
	
	public void serve() {
		int price = prices[1];
		if(size == "S") price = prices[0];
		else if(size == "L") price = prices[2];
		
		System.out.println(name + size + "입니다. 가격: " + price);
	}
	
}