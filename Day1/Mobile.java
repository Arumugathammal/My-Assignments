package week1.Day1;

public class Mobile {
	
	public void makeCall()
	{
		String mobileModel= "Nokia";
		int mobilePrice= 5000;
		
		System.out.println(mobileModel);	
		System.out.println(mobilePrice);	
		
		boolean batteryCharge= true;
		int mobileWeight= 10;
		
		System.out.println(batteryCharge);	
		System.out.println(mobileWeight);
	}
	
	public static void main(String[] args) {
	Mobile mobileData = new Mobile();
	mobileData.makeCall();

	}
	

}
