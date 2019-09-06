package solve;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class EquationTest {
	
	private static Equation equation;
	private static List<Variable> variables;
	
	@Test
	public void testConstructor() {
		Equation equation = new Equation();;

		equation = new Equation();
		Assert.assertTrue(equation.getVariables() != null);
	}

	@Test
	public void testToString0() {
		equation = new Equation();
		Assert.assertEquals(equation.toString(), "0 = 0");
	}
	
	@Test
	public void testToString1() {
		equation.add(new Variable(0, 2));
		Assert.assertEquals(equation.toString(), "2 * X^0 = 0");
		
		
	}
	
	@Test
	public void testToString2() {
		equation.add(new Variable(0, 2));
		Assert.assertEquals(equation.toString(), "4 * X^0 = 0");
	}
	
	@Test
	public void testToString3() {
		equation.add(new Variable(1, 5));
		equation.add(new Variable(1, -1));
		equation.add(new Variable(2, -9.3));
		Assert.assertEquals(equation.toString(), "-9.3 * X^2 + 4 * X^1 + 4 * X^0 = 0");
	}
	
	@Test
	public void testToString4() {
		equation.add(new Variable(2, 9.3));
		Assert.assertEquals(equation.toString(), "4 * X^1 + 4 * X^0 = 0");
	}
	
	@Test
	public void testToString5() {
		equation.add(new Variable(1, -4));
		Assert.assertEquals(equation.toString(), "4 * X^0 = 0");
	}
	
	@Test
	public void testToString6() {
		equation.add(new Variable(0, -4));
		Assert.assertEquals(equation.toString(), "0 = 0");	
	}
	
	
	@Test
	public void testToString7() {
		equation.add(new Variable(0, -2));
		Assert.assertEquals(equation.toString(), "-2 * X^0 = 0");
	}
	

	@Test
	public void testGetVariables0() {
		equation = new Equation();
		variables = equation.getVariables();
		Assert.assertTrue(variables.size() == 0);				
	}
	
	@Test
	public void testGetVariables1() {
		equation.add(new Variable(1, 2));
		Assert.assertTrue(variables.size() == 1);
	}
	
	@Test
	public void testGetVariables2() {
		equation.add(new Variable(1, 0));
		Assert.assertTrue(variables.size() == 1);
	}
	
	@Test
	public void testGetVariables3() {
		equation.add(new Variable(2, 0));
		Assert.assertTrue(variables.size() == 1);
	}
	@Test
	public void testGetVariables4() {
		equation.add(new Variable(2, 1));
		Assert.assertTrue(variables.size() == 2);
	}
	@Test
	public void testGetVariables5() {
		equation.add(new Variable(3, 1));
		Assert.assertTrue(variables.size() == 3);
	}
	

	@Test
	public void testAdd0() {
		equation = new Equation();
		Assert.assertTrue(equation.getVariables().size() == 0);	
	}
	
	@Test
	public void testAdd1() {
		equation.add(new Variable(1, 2));
		variables = equation.getVariables();
		Assert.assertTrue(variables.get(0).getDegree() == 1 && variables.get(0).getCoefficient() == 2);
		Assert.assertTrue(variables.size() == 1);
	}
	
	@Test
	public void testAdd2() {
		equation.add(new Variable(1, -1));
		Assert.assertTrue(variables.get(0).getDegree() == 1 && variables.get(0).getCoefficient() == 1);
		Assert.assertTrue(variables.size() == 1);
	}
	
	@Test
	public void testAdd3() {
		equation.add(new Variable(2, 0));
		Assert.assertTrue(variables.size() == 1);
	}

	@Test
	public void testGetDegree0() {
		equation = new Equation();
		Assert.assertTrue(equation.getDegree() == 0);
	}
	
	
	@Test
	public void testGetDegree1() {
		equation.add(new Variable(1, 2));
		Assert.assertTrue(equation.getDegree() == 1);
	}
	
	@Test
	public void testGetDegree2() {
		equation.add(new Variable(1, 1));
		Assert.assertTrue(equation.getDegree() == 1);
	}

	@Test
	public void testGetDegree3() {
		equation.add(new Variable(2, 1));
		Assert.assertTrue(equation.getDegree() == 2);
	}


	@Test
	public void testGetDegree4() {
		equation.add(new Variable(3, 1));
		Assert.assertTrue(equation.getDegree() == 3);
	}
	
	@Test
	public void testGetDegree5() {
		equation.add(new Variable(3, -1));
		Assert.assertTrue(equation.getDegree() == 2);	
	}
	
	@Test
	public void testGetDegree6() {
		equation.add(new Variable(3, 1));
		Assert.assertTrue(equation.getDegree() == 3);
	}

	
	@Test
	public void testgetCoefficientOf() {
		equation = new Equation();
		equation.add(new Variable(0, -2));
		Assert.assertTrue(equation.getCoefficientOf(0) == -2);
	
	}
	
	@Test
	public void testgetCoefficientO1f() {
		equation.add(new Variable(1, 0));
		Assert.assertTrue(equation.getCoefficientOf(1) == 0);
	}
	
	@Test
	public void testgetCoefficientOf2() {
		equation.add(new Variable(2, 2));
		Assert.assertTrue(equation.getCoefficientOf(2) == 2);
	}
	
	@Test
	public void testgetCoefficientOf3() {
		equation.add(new Variable(3, 2.3));
		Assert.assertTrue(equation.getCoefficientOf(3) == 2.3);
	}

}
