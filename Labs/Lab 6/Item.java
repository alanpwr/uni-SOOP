package lab6;


public class Item {
	
	
	public ProductType type;
	public int quantity=1;
	public String comment = "" ;
	//COMMENT
	public Item () {
		type = ProductType.OTHER;
		quantity =0;
		comment = "Emty";
		
	}
	public Item(int quantity) {
		type = ProductType.OTHER;
		this.quantity = quantity;
		comment ="empty";
	}
    public Item (String comment, int quantity) {
	type = ProductType.OTHER;
	this.comment = comment;
	this.quantity = quantity;
    }
 

//COMMENT
	public Item (ProductType product , int quantity , String comment) {
	this.type = product;
	if(comment==null){
		
		comment=" ";
		
	}
	
	
	
	if(quantity<=0) {
		
	        
	}
	else {
		this.quantity=quantity;
		
	}
	this.comment= comment;
	}
	public Item(ProductType product , int quantity )
	{
		
		comment=" ";
		if (quantity <= 0)
		{
			
		}
		else
		{
			this.quantity = quantity;
		}
		type = product;
	}
		
	public Item (ProductType product)
	{
		type = product;
		comment=" ";
	}

	public void AddItems(int quantity)
	{
	
		if((!(quantity>0))){
			
			remove(quantity);
			
		}
		
		
	
		this.quantity += quantity;
	}

	public boolean remove(int number)
	{
		if (quantity > number)
		{
			quantity = quantity-number;
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getTotalPrice()
	{
		double TotalPrice = quantity*type.getPrice();
		return TotalPrice;
	}

	public double getTotalWeight()
	{
		double TotalWeight = quantity*type.getWeight();
		return TotalWeight;
	}

	public String toString()
	{
		
		String item = type + " " + Integer.toString(quantity) + " " + comment;
		return item;
	}

	public boolean equals(Item other)
	{
		
		if(other==null)
		return false ;
		
		if(type==other.type)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	public ProductType getType() {
		// TODO Auto-generated method stub
		return type;
	}



}
