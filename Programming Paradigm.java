package procedural;
import java.util.Scanner;
public class Elections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner (System.in);
   
   System.out.print("input the age:");
   int age = input.nextInt();
   
   System.out.println(elections(age));
	}
	
	public static int  elections(int age) {
		
		if(age<18)
			System.out.println("can't vote");
		
		else
			System.out.println("can vote");
		return age;
		
		
		
		
	}
	
}
