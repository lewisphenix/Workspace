
public abstract class Carnivore extends Animal{
	
	public Carnivore(String nameEntered, int ageEntered) {
		super(nameEntered, ageEntered);
	}
	
	public Carnivore(){
		super();
	}

	public abstract void makeNoise();
	
	public void eat(Food eatenFood) throws Exception{		
		if (eatenFood instanceof Plant){
			throw new Exception("Wrong food!!!");
		}
		
		else {
			System.out.println(this.getName() + " is eating " + eatenFood.getNameOfFood());
		}
	}
	
}
