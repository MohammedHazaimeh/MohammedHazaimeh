package procedural;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(arearCircle(1));
		   
		   perimeterCircle();
		   
		   areaSquare(5);
		   
		   System.out.println(perimeterSquare());
			}
			
			
			
			
			public static double arearCircle( double radius ) {
				
				double  sumArea= (radius*radius) * 3.14 ;
					return  sumArea;	
			}
			
			
			public static void perimeterCircle() {
			
				double radius = 1;
				double  sumPerimeter;
				
				  sumPerimeter = 2 * 3.14 * radius  ;
				  System.out.println(sumPerimeter);
				
			}
			
			public static void areaSquare(double sidelength) {

				double  sumArea =sidelength * sidelength ;
				
				System.out.println(sumArea);	
			}
			
			public static double  perimeterSquare() {

				double sidelength= 5;
				double  sumArea =4 * sidelength ;
				
				      return sumArea;
			}
			
			


	

}
