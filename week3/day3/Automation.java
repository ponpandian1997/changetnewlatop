package week3.day3;

public class Automation extends MultipleLanguage implements LANGUAGE,TestTool {
	
	public void selinium() {
		System.out.println("selinium");
	}
	

	public void java() {
		System.out.println("java");
	}
	

	@Override
	public void ruby() {
		System.out.println("ruby");
	}

	public static void main(String[] args) {
		
		Automation auto =new Automation();
		auto.selinium();
		auto.java();
		auto.python();
		auto.ruby();
		
		
		
	}

	

}
