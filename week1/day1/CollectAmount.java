package week1.day1;

public class CollectAmount {
	
	int CollectedAmount=1000;
	
	public int CollectAmountAndGiveItToMe() {
		System.out.println("Daddy have collected rupees"+ CollectedAmount +"Send it To You");
		return CollectedAmount;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount myson= new CollectAmount();
	int	amount = myson.CollectAmountAndGiveItToMe();
	
	System.out.println("Got The Amount My Son" + amount);

	}

}
