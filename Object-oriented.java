package opp;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculation b1=new calculation();
		b1.setNumber(10,6,8);
		b1.print("area");
		b1.print("perimeter");
	}

}




package opp;

public class calculation {
private static double baselength;
private static double heightlength;
private static double sidelength;
private static double sum;
private static double sum1;

public void setNumber(float n1 , float n2 ,float n3) {
	
	baselength=n1;
	 heightlength=n2;
	 sidelength=n3;
}

private  double area() {
	
	sum = (( 0.5 * baselength) + heightlength);
	return  sum;
	
}

private  double perimeter() {
	
	sum1 =( baselength + sidelength*2);
	return sum1;	
}

public void print(String s) {
	
	if(s== "area") {
		System.out.println("The area of triangle=" + area());	
	}
	
	if(s== "perimeter") {
		System.out.println("The area of perimeter="+perimeter());	
	}
	
}
}
