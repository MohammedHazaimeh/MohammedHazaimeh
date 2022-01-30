package oop3;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SoftDrinks drink1 = new SoftDrinks("Sevenup",350, "glass");
		 System.out.println(drink1.name +"  " + drink1.size +"  "+ drink1.bottle);
		 
		 
		 
		 SoftDrinks drink2 = new SoftDrinks("Pepsi",350);
		 System.out.println(drink2.name +"  " + drink2.size +"  "); 
	}

}



package oop3;

public class SoftDrinks {
	
	 String name=" ";
	 int size = 0;
     String bottle=" ";
     
     
	public SoftDrinks(String name, int size, String bottle) {
		
		this.name = name;
		this.size = size;
		this.bottle = bottle;
	}


	public SoftDrinks(String name, int size) {
		
		this.name = name;
		this.size = size;
	}
	
	
	
	
     
     
     
     
}
