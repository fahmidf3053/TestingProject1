package solve;

public class LinearEquationSolver implements IEquationSolver {

	public void solve(Equation equation) {
		double a, b;

		a = equation.getCoefficientOf(1);
		b = equation.getCoefficientOf(0);
		if (a == 0) {
			if (b == 0)
				System.out.println("Every value for x is a solution");
			else
				System.out.println("There is no solution because the equation is inconsistent");
		}
		else {
			System.out.print("The solution is: ");
			System.out.println(((-b / a) + 0.0)); // avoid -0.0
		}
	}

}
