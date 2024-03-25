package week1.day1;

public class Mobile {

	
	public void makeCall()
	{
		String mobileModel = "Iphone";
		
		float mobileWeight = 245.56f;
		
		System.out.println("Making a call from " + mobileModel + " weight:" + mobileWeight );
	}
	
	public void sendMsg()
	{
		boolean isFullCharged = true;
		
		int mobileCost = 9867;
		
		System.out.println("Sending a message " + "Charge:" + isFullCharged + " Cost of - " + mobileCost );
	}
	
	
	public static void main(String[] args) {
		
		Mobile mymobile = new Mobile();
		
		mymobile.makeCall();
		
		mymobile.sendMsg();
		
		System.out.println("This is my mobile");
		
		
		
	}
}
