package exam1015;

public class PepperoniPizza extends Pizza{
	public String name = "페퍼로니 피자";	
	public String size;
	int[] prices = {15000, 20000, 30000};
	public String toppings = "pepperoni";
	
	public PepperoniPizza() { 
		size = "M";
	}
	public PepperoniPizza(String size) {
		this.size = size;
	}
	public void cook() {
		System.out.println(name + size + "을 추가합니다.");
		System.out.println(name + size + "을 조리합니다.");
		System.out.println(name + size + "이 완성되었습니다.");
	}
	
	public void serve() {
		int price = prices[1];
		if(size == "S") price = prices[0];
		else if(size == "L") price = prices[2];
		
		System.out.println(name + size + "입니다. 가격: " + price);
	}
	/*public void serve() {
		int price;
		switch(size) {
		case "S" : price = prices[0];
		case "M" : price = prices[1];
		default : price = prices[2];
			}
		System.out.println(name + size + "입니다. 가격 : " + price);
	}
	*/
}