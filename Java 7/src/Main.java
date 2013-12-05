
public class Main {

	public static void main(String[] args){
		Wolf chief = new Wolf("Chief", 17);
		Parrot squawky = new Parrot("Squawky", 3);
		Vegetarian tarquin = new Vegetarian("Tarquin", 22);
		Meat lunch = new Meat();
		Plant grass = new Plant();
		System.out.println(chief.getAge());
		System.out.println(squawky.getName());
		System.out.println(tarquin.getName());
		System.out.println(lunch.getNameOfFood());
		System.out.println(grass.getNameOfFood());
		chief.makeNoise();
		squawky.makeNoise();
		tarquin.makeNoise();
		try{
			squawky.eat(lunch);
			chief.eat(grass);
			tarquin.eat(lunch);
		}
		catch (Exception e){
			System.err.println(e);
		}
	}
}
