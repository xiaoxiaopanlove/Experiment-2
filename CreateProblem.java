import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateProblem extends CreateEquation {
	public static final int N = 50;
	public static final int s =5;
	public Boolean F = true;
	public int num;
	List<CreateProblem> list = new ArrayList<>();
	CreateProblem  generateCreateProblem(){
		CreateProblem equation = new CreateProblem();
		equation.generating();
		return equation;
	}
	Boolean judgeOnly(int s, CreateProblem w) {
		for(int j = 0; j < s; j++) {
			CreateProblem cp = list.get(j);
			if(w.addendone == cp.addendone && w.addendtwo == cp.addendtwo && w.symbol == cp.symbol) {
				return false;
			}
		}
		return true;
	}
	void generateProblemSet() {
		CreateProblem createEquation = null;
		for(int i = 0; i <= N; i++) {
			createEquation = generateCreateProblem();
			if(judgeOnly(i,createEquation))
				list.add(createEquation);
			else
				i--;
		}
	}
	void scanff() {
		Scanner san = new Scanner(System.in);
		num = san.nextInt();
	}
	Boolean judge() {
		return sum==num?true:false;
	}
}
