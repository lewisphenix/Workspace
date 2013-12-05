
public abstract class Herbivore extends Animal{
	
	public Herbivore(String nameEntered, int ageEntered){
		super(nameEntered, ageEntered);
	}
	
	public abstract void makeNoise();
	
	public void eat(Food eatenFood) throws Exception{
		if (eatenFood instanceof Meat){
			throw new Exception("Wrong Food!!!");
		}
		System.out.println(this.getName() + " is eating " + eatenFood.getNameOfFood());
	}
}
