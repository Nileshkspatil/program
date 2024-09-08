package oop;

interface Vehical{
	
	public static final double price=60000;
	
	void engine();
	
	 default void dimesions() {
		System.out.println("4metr");
	}
	 
	 public static void  wheel() {
		 System.out.println("4 wheels");
	 }
}

public class Honda extends Bike implements Vehical {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
	public void stop() 
	{
		System.out.println("vehicle is stopped");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("two stroke petrol engine");
		
	}

}
