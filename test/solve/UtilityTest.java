package solve;
import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {

	@Test
	public void sqrtTest0() {
		Utility utility= new Utility();
		double result;
		result= utility.sqrt(9.0);
		assertEquals(3.0, result, 0.0);
	}
	
	@Test
	public void sqrtTest1() {
		Utility utility= new Utility();
		double result = utility.sqrt(4.0);
		assertEquals(2.0, result, 0.0);
	}
	
	@Test
	public void sqrtTes2() {
		Utility utility= new Utility();
		double result = utility.sqrt(8.0);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(2.82843, result,0.0);
	}
	
	@Test
	public void sqrtTes3() {
		Utility utility= new Utility();
		double result = utility.sqrt(56.785);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(7.53558, result,0.0);
	}
	
	
	@Test
	public void sqrtTes4() {
		Utility utility= new Utility();
		double result = utility.sqrt(1000.56329);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(31.63168, result,0.0);
	}
	
	@Test
	public void sqrtTest5() {
		Utility utility= new Utility();
		double result = utility.sqrt(100);
		assertEquals(10, result,0.0);
	}
	
	@Test
	public void sqrtTest6() {
		Utility utility= new Utility();
		double result = utility.sqrt(100.5689);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(10.0284, result,0.0);
	}
	
	@Test
	public void sqrtTest7() {
		Utility utility= new Utility();
		double result = utility.sqrt(568963.256);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(754.29653, result,0.0);
	}
	
	@Test
	public void sqrtTest8() {
		Utility utility= new Utility();
		double result = utility.sqrt(121);
		assertEquals(11, result,0.0);
	}
	
	@Test
	public void sqrtTest9() {
		Utility utility= new Utility();
		double result = utility.sqrt(576);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(24, result,0.0);
	}
	
	@Test
	public void sqrtTest10() {
		Utility utility= new Utility();
		double result = utility.sqrt(500);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(22.36068, result,0.0);
	}
	
	@Test
	public void sqrtTest11() {
		Utility utility= new Utility();
		double result = utility.sqrt(700);
		DecimalFormat df = new DecimalFormat("#.#####");
		result= Double.parseDouble(df.format(result));
		assertEquals(26.45751, result,0.0);
	}
	
	
	
	@Test
	public void sqrtTest12() {
		Utility utility= new Utility();
		double result = utility.sqrt(0);
		assertEquals(0, result,0.0);
	}
	
	@Test
	public void sqrtTest13() {
		Utility utility= new Utility();
		double result = utility.sqrt(-1);
		Assert.assertNotNull("Negative Number not Managed",result);
	}

}
