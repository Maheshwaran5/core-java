package simple;

public class Maruthi {

	String color;
	String type;
	int seat_capacity;
	
	
	public Maruthi (String c,String t,int cap)
	{
		color=c;
		String type = t;
		int seat_capacity= cap;
		
	}
	
	public void printDetails()
	{
		System.out.println("Car Details as"+color);
		System.out.println("Car Details as"+type);
		System.out.println("Car Details as"+seat_capacity);
		}
	public static void main(String[] args) {
		
		Maruthi car1=new Maruthi("Red", "Power",5);
		car1.printDetails();
		
		Maruthi car2=new Maruthi("Black", "Manual",4);
		car2.printDetails();
		
		
	}
	
}
