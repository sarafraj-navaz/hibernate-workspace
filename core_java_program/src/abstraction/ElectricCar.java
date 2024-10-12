package abstraction;

public abstract class ElectricCar extends Vehicle{

	public abstract void charge();
	
	public void playMusic()
	{
		System.out.println("Play the music in electric Car");
	}
}
