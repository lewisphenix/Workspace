
public class Main {
	public static void main(String[] args){
		boolean parser, add, multiply;
		TestCalculator newTestCalculator = new TestCalculator();
		parser = newTestCalculator.testParser();
		add = newTestCalculator.testAdd();
		multiply = newTestCalculator.testMultiply();
		
		if (parser == true){ //Checks if all the tests pass
			if(add == true){
				if(multiply == true){
					System.out.println("Congratulations, your Calculator appears to be working.");
				}
			}
		}
	}
}
