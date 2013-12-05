
public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String nameEntered, int ageEntered){
		name = nameEntered;
		age = ageEntered;
	}
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public abstract void makeNoise();
	public abstract void eat(Food eatenFood) throws Exception;
}
