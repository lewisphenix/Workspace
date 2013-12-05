
public abstract class Omnivore extends Animal{
	
	public Omnivore(String nameEntered, int ageEntered){
		super(nameEntered, ageEntered);
	}
	
	public abstract void makeNoise();
	
	public void eat(Food eatenFood){
		System.out.println(this.getName() + " is eating " + eatenFood.getNameOfFood());
	}
}
