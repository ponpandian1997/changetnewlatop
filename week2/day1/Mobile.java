package week2.day1;

public class Mobile {
	
	public String sendSMS(String sms) {
		System.out.println("sms is sending");
		System.out.println(sms);
		return sms;
	}
	protected boolean allowvoicecall(boolean var) {
		System.out.println("voice call is allowed");
		return var;
	}
	
	private void takevideo()
	{
		System.out.println("video is recording");
	}
	
	public static void main(String[] args) {
Mobile mob =new Mobile();
		
		mob.sendSMS("hello testleaf");
		mob.allowvoicecall(false);
		
		

	}

}
