package lab6;

public enum 	ProductType {
                
	
	BREAD (3.5 , 100), MILK(2.2 , 1.5), TEA(15.0 , 200), BUTTER(7.5 , 550), OTHER(0.0 , 0.0);

	

	private double unitPrice;
	private double unitWeight;
    
	public static ProductType fromString(String s) {
		s=s.toLowerCase().trim();
		switch(s) {
	
		case "bread": return BREAD;
		case "milk": return MILK;
		case "tea": return TEA;
		case "butter": return BUTTER;
		default: return OTHER;
		}
	}
	private ProductType(double Weight, double price) {
		unitPrice=price;
		unitWeight=Weight;
		
	}

	public double getPrice() {
		return unitPrice;
	}
	public double getWeight() {
		return unitWeight;
	}
	
	public String show() {
		String s=this+ " ["+unitWeight+"]";
		return s.toLowerCase();
	}
	public static void testMe() {
		ProductType p1=ProductType.BREAD;
		System.out.println(p1);
		p1=ProductType.fromString("tea");
		System.out.println(p1);
		for (ProductType p: ProductType.values()) {
			System.out.println(p.show());
		}
	}

	
	
	
	
	
	
}
