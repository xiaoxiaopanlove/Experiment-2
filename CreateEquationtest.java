
public class CreateEquationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成算式集合
		System.out.println("生成算式集合");
		for( int i = 1; i <= 50; i++) {
			CreateEquation equation = new CreateEquation();
			equation.generating();
			equation.printfFormula();
			equation.printfSum();
			if(i%5 == 0) 
				System.out.println("");
			else
				System.out.print("   ");
		}
		System.out.println("-----------------------------------------------------------------------");
		//生成习题集合
		System.out.println("生成50道加减法混合习题集合");
		CreateProblem test = new CreateProblem();
		CreateProblem we = null;
		test.generateProblemSet();
		for(int i = 1; i <= CreateProblem.N; i++) {
			System.out.print(" 第" + i + "题:");
			we = test.list.get(i-1);
			we.printfFormula();
			if(i%CreateProblem.s == 0) {
				System.out.println("\n");
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("50道加法习题生成");
		for( int i = 1; i <= 50; i++) {
			test = test.generateCreateProblem();
			if(test.symbol == 1) {
				test.printfFormula();
				if(i % 5 ==0)
					System.out.println("\n");
				else
					System.out.print("   ");
			}
			else
				i--;
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("50道减法习题生成");
		for( int i = 1; i <= 50; i++) {
			test = test.generateCreateProblem();
			if(test.symbol == -1) {
				test.printfFormula();
				if(i % 5 ==0)
					System.out.println("\n");
				else
					System.out.print("   ");
			}
			else
				i--;
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("5道习题生成并进行判断");
		test = new CreateProblem();
		we = null;
		test.generateProblemSet();
		for(int i = 1; i <= 5; i++) {
			System.out.println(" 第" + i + "题:");
			we = test.list.get(i-1);
			we.printfFormula();
			System.out.println("\n请输入答案");
			we.scanff() ;
			if(we.judge() == true) {
				System.out.println("答案正确");
			}
			else {
				System.out.println("答案错误,正确答案为: " + we.sum);
			}
		}
	}
}
