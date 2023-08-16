package lab6;

public class Testing {

	public static void main(String[] args) {
		
		Item[] itemArray = new Item[3];
		
		
		itemArray[0] = new Item(ProductType.BREAD, 500,"somethink" );
		itemArray[1] = new Item(ProductType.fromString("Tea"),50 ,"Black Tea") ;
		itemArray[2] = new Item(ProductType.MILK );
		
		Item Bread1 = new Item(ProductType.BREAD , 50);
		Item Bread2 = new Item(ProductType.BREAD , 300);
		Item Tea1 = new Item(ProductType.TEA , 20);
	    Item Butter1=new Item(ProductType.BUTTER);
		Item Milk1 = new Item(ProductType.MILK , 20);
	    Item Bread3=new Item(ProductType.BREAD,30);
	
	    ProductType.testMe();
        System.out.println("*(1) "+itemArray[0]); 
        System.out.println("*(2) "+itemArray[1]);  
        System.out.println("*(3) "+itemArray[2]);  
        System.out.println("#Price And Total Weight");
        System.out.println("Price (1) :"+itemArray[0].getTotalPrice());     
        System.out.println("Weight (1) :"+itemArray[0].getTotalWeight());
        System.out.println("Price (2):"+itemArray[1].getTotalPrice()); 
        System.out.println("Weight (2) :"+itemArray[1].getTotalWeight());
        System.out.println("Price (3):"+itemArray[2].getTotalPrice()); 
        System.out.println("Weight (3) :"+itemArray[2].getTotalWeight());
	    itemArray[0].AddItems(-600);    
        itemArray[0].AddItems(-600);
        itemArray[0].AddItems(100);
     	itemArray[1].remove(20);
        itemArray[2].AddItems(10);	
        System.out.println("**(1) "+itemArray[0]); 
        System.out.println("**(2) "+itemArray[1] );
        System.out.println("**(3) "+itemArray[2]);
        
        
        
        
        System.out.println("Price (1) :"+itemArray[0].getTotalPrice());     
        System.out.println("Weight (1) :"+itemArray[0].getTotalWeight());
        System.out.println("Price (2):"+itemArray[1].getTotalPrice()); 
        System.out.println("Weight (2) :"+itemArray[1].getTotalWeight());
        System.out.println("Price (3):"+itemArray[2].getTotalPrice()); 
        System.out.println("Weight (3) :"+itemArray[2].getTotalWeight());
        
        
        
        
        System.out.println("##Equality Testing ");
	    System.out.println("*Equality :"+Bread1.equals(Bread2));
	    System.out.println("*Equality  :"+Bread1.equals(Tea1));
	    System.out.println("Equality :"+Bread1.equals(null));
	    
	    
	    System.out.println();
	    System.out.println("###Lab7###");
	    
	    
	     Bag bag1=new Bag(60);
	     Bag bag2=new Bag(100);
	     
	    System.out.println("*Bag capacity :"+bag1.capacity);
	    System.out.println("*Bag capacity :"+bag2.capacity);
	    bag1.putIn(Tea1);//Tea 1 =20
	    bag1.putIn(Milk1);
	   
	    

	    
	    
	}

	

}
