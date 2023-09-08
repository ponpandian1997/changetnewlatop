package week3.day2;

public class Learnmethodoverloading {
	
	public void add(int x, int y) {
		System.out.println(x+y);	
	}
 public void add(int x, float y) {
	System.out.println(x+y);
		
	}
  public void add(int x,int y, int z) {
	System.out.println(x+y+z);
 }

  public void multi(int x, int y) {
	System.out.println(x*y);
 }
   public void multi(int x, double y) {
    	System.out.println(x*y);
   }
   public static void main(String[] args) {
		Learnmethodoverloading cal =new Learnmethodoverloading();
	cal.add(10, 20);
	cal.add(10, 1);	
	cal.add(10, 20, 30);	
    cal.multi(10, 20);
    cal.multi(10, 0.2);
	

	}

}
