package simple;

public class Student {
	
	// static Variable
	
	
	String name;
	int std_id;
	static String clg_name="Mannar College";
	
	static int std_id1=26;
	public static void getClgName()
	{
		System.out.println(Student.clg_name);
		System.out.println(Student.std_id1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student.getClgName();
		
	}

}
