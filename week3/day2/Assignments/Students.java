package week3.day2.Assignments;

public class Students {
	
	public void getstudentinfo(int a)
	{
		System.out.println("studentid " + a);
	}
	
	public void getstudentinfo(int a, String name)
	{
		System.out.println("student id " + a);
		System.out.println("student name" + name);
		}
	
	public void getstudentinfo(String email, long phonenumber)
	{
		System.out.println("student email" + email);
		System.out.println("student phonnumber " + phonenumber);
	}
	
	public static void main(String[] args) {
		Students stude = new Students();
		stude.getstudentinfo(415);
		stude.getstudentinfo(415, "ponpandi");
	    stude.getstudentinfo("pandi@gmail.com",88361638 );
		}

}
