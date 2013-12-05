import java.util.ArrayList;

public class Demo {
	
	public static void main(String args[]){
		ArrayList<Animal> animalArray = new ArrayList<Animal>();
		animalArray.add(new Wolf("general", 6));
		animalArray.add(new Parrot("polly", 19));
		animalArray.add(new Vegetarian("neil", 4));
		animalArray.add(new Parrot("pecky", 7));
		animalArray.add(new Wolf("colonel", 22));
		animalArray.add(new Vegetarian("fred", 85));
		//Interface is a set of abstract methods. It is not a class but a class can implement it and inherit all the abstract methods.
	}
}
