
public abstract class Animal implements Comparable{
	protected String name;
	protected int age;
	
	public Animal(String nameEntered, int ageEntered){
		name = nameEntered;
		age = ageEntered;
	}
	
	public Animal(){
		this("newborn", 0);
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public abstract void makeNoise();
	public abstract void eat(Food eatenFood) throws Exception;
	public void eat(Food eatenFood, Integer number){
		while (number > 0){
			try{
				this.eat(eatenFood);
			}
			catch(Exception e){
				System.err.println(e);
			}
			number --;
		}
	}
}
