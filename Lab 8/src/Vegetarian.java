
public class Vegetarian extends Herbivore{
	
	public Vegetarian(String nameEntered, int ageEntered){
		super(nameEntered, ageEntered);
	}
	
	public void makeNoise(){
		System.out.println("How could you eat those poor baby animals?");
	}
}
