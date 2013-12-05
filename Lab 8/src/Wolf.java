
public class Wolf extends Carnivore{
	
	public Wolf(String nameEntered, int ageEntered){
		super(nameEntered, ageEntered);
	}
	
	public Wolf(){
		super();
	}
	
	public void makeNoise(){
		System.out.println("Howl!!!");
	}
}
