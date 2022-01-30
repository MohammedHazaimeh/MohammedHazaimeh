package oop2;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.name="mohammed";
		student1.setAverage(95);
        student1.setId(20120085);
        
        System.out.println(student1.name + " "+student1.getId()  + " " +student1.getAverage() );
	}

}


package oop2;

public class Student {
	
	String name =" ";
	private int Id= 0;
	private int average=0;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	

}
