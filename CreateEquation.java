import java.util.Random;

public class CreateEquation {
	public int addendone;
	public int symbol;
	public int addendtwo;
	public int sum;
	static int rand() {
		Random s = new Random();
		return s.nextInt(100);
	}
	void generating() {
		addendone = rand();
		symbol = rand();
		symbol = symbol%2==0?1:-1;
		addendtwo = rand();
		sum = addendone + symbol * addendtwo;
	}
	void printfFormula() {
		System.out.print(addendone + (symbol==1?" + ":" - ") + addendtwo + " = ");
	}
	void printfSum() {
		System.out.print(sum);
	}
	
}
