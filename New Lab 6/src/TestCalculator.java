
public class TestCalculator {
	Calculator testCalculator = new Calculator();
	protected int count;
	protected int addCount;
	protected int multiplyCount;
	
	public boolean testParser(){
		if (testCalculator.x("12 + 5") == 17){ //Tests if it can add correctly
			count ++;
			System.out.println("[OK] Parser adds correctly.");
		}
		else{
			System.out.println("[Fail] Basic parsing fails to add.");
		}
		
		if (testCalculator.x("12 x 5") == 60){ //Tests if it can multiply correctly
			count ++;
			System.out.println("[OK] Parser multiplies correctly");
		}
		else{
			System.out.println("[Fail] Basic parsing fails to multiply.");
		}
		
		if (testCalculator.x("12 [ 3") == null){ //Tests if it returns null
			count ++;
			System.out.println("[OK] Parser returns null for operators which are not supported.");
		}
		else{
			System.out.println("[Fail] Parser does not return null for operators which are not supported.");
		}
		if (count == 3){ //If all 3 are correct it returns true
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean testAdd(){
		testCalculator.x = 1.00;
		if (testCalculator.x(Double.valueOf(0.00)) == 1.00){ //Tests if the calculator can add
			
			addCount ++;
			System.out.println("[Pass] Calculator can add positive numbers");
		}
		else{
			System.out.println("[Fail] Calculator adds incorrectly");
		}
		
		if (testCalculator.x(Double.valueOf(-1.00)) == 0.00){ //Tests if it can handle negative addition
			addCount++;
			System.out.println("[Pass] Calculator can add a negative number");
		}
		else{
			System.out.println("[Fail] Calculator adds with negative numbers incorrectly");
		}
		
		if (addCount == 2){ //Returns true if both tests pass
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean testMultiply(){
		testCalculator.x = 2.00;
		
		if (testCalculator.x(2.00) == 4){ //Tests if the calculator can multiply
			multiplyCount ++;
			System.out.println("[Pass] Calculator can multiply positive numbers");
		}
		else{
			System.out.println("[Fail] Calculator multiplies incorrectly");
		}
		
		testCalculator.x = -2.00;
		
		if (testCalculator.x(-2.00) == 4.00){ //Tests if it can handle negative multiplication
			multiplyCount ++;
			System.out.println("[Pass] Calculator can multiply by a negative number");
		}
		else {
			System.out.println("[Fail] Calculator multiplies by negative incorrectly");
		}
		
		if (multiplyCount == 2){ //Returns true if both tests pass
			return true;
		}
		else{
			return false;
		}
	}
}
