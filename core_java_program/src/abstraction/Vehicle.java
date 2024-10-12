package abstraction;

public abstract class Vehicle {
	
	public abstract void start();
	
	public abstract void drive();
	
	public void stop()
	{
		System.out.println("Stop the vehicle");
	}
	public void playMusic()
	{
		System.out.println("play the vehicle");
	}
}
