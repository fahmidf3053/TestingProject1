package solve;

public class Utility {

	public static double sqrt(double x) {
		double epsilon;
		double guess;

		guess = x;
		epsilon = 1e-15;
		while (Math.abs(guess - x / guess) > epsilon * guess)
			guess = (x / guess + guess) / 2.0;
		return (guess);
	}

}
