package opp;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Square q1 = new Square();
		q1.setNumber(2,2);
		q1.getNumber();
		
          System.out.println();
		
         Circle c1 = new Circle();
  		c1.setNumber(2);
  		c1.getNumber();
         System.out.println();
	}

}




package opp;

public class Circle {
	double sumArea;
	   double sumPerimeter;
	   double radius;
	   
	   public void setNumber(double n1 ) {
			
			radius=n1;
			 
		}

		  double areaCircle() {
			
			  sumArea= (radius*radius) * 3.14 ;
			return  sumArea;	
			
		}

		  double perimeterCircle() {
			
			  sumPerimeter = 2 * 3.14 * radius  ;
			return  sumPerimeter;	
			
		}

		public void getNumber() {
				System.out.println("The area of Circle=" + areaCircle());	
				
				System.out.println("The perimeter of Circle="+perimeterCircle());	
			}


		}




package opp;

public class Square {
	 double sidelength;
	 double sidelength2;
	double sumArea;
	double sumperimeter;

	
	public void setNumber( double n1 ,double n2) {
		
		 sidelength =n1;
		sidelength2=n2;
	}


	  double area2() {
		
		  sumArea =sidelength * sidelength2 ;
		return  sumArea;	
		
	}

	  double perimeter2 () {
		
		sumperimeter =sidelength *  sidelength * sidelength * sidelength ;
		return  sumperimeter;	
	}

	public void getNumber() {
		
		
			System.out.println("The area of square=" + area2());	
		
		
		
			System.out.println("The perimeter of square="+perimeter2());	
		
		
	}



	
}
