
public class Parrot extends Omnivore{
	
	public Parrot(String nameEntered, int ageEntered){
		super(nameEntered, ageEntered);
	}
	
	public Parrot(int i){
		super("Polly", i);
	}
	
	public void makeNoise(){
		System.out.println("Squawk!!!");
	}
}
