package week3.day3;

public class SAMSUNG extends AndroidTV implements Android{
	
	
	public void Watchvideo() {
		System.out.println("watching video");
		
	}
	public static void main(String[] args) {
	
    SAMSUNG object =new SAMSUNG();
	object.Watchvideo();
	object.openapp();
    

}
}