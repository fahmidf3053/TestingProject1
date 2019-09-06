package solve;

public class ComputorV1 {
	
	String input;
	
	public ComputorV1(String input){
		this.input=input;
	}

	public void findRoot() {
		try {
        	solve(parse(input));
        } catch (ParserException e) {
        	System.out.println(e.getMessage());
        }
	}	
    

	private static Equation parse(String input) {
		EquationParser parser;

		parser = new EquationParser();
		return (parser.parse(input));
	}

	private static void solve(Equation equation) {
		IEquationSolver solver;

		solver = new EquationSolver();
		solver.solve(equation);
	}

}
