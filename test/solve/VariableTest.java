package solve;
import org.junit.Assert;
import org.junit.Test;

public class VariableTest {

	@Test
	public void testConstructor() {
		Variable v;

		v = new Variable(2, 10);
		Assert.assertEquals(v.getDegree(), 2);
		Assert.assertEquals(v.getCoefficient(), 10, 0);
	}

	@Test
	public void testEquals0() {
		Variable v1, v2;

		v1 = new Variable(2, -123);
		v2 = new Variable(2, 1123);
		Assert.assertEquals(v1.equals(v2), true);
	}
	
	@Test
	public void testEquals1() {
		Variable v1, v2;

		v1 = new Variable(2, -123);
		v2 = new Variable(2, 1123);
		v2.setDegree(1);
		Assert.assertEquals(v1.equals(v2), false);
	}
	
	@Test
	public void testEquals2() {
		Variable v1, v2;

		v1 = new Variable(2, -123);
		v2 = new Variable(2, 1123);
		v2.setDegree(1);
		Assert.assertEquals(v1.equals("test"), false);
	}
	
	@Test
	public void testEquals3() {
		Variable v1, v2;
		v1 = new Variable(2, -123);
		v2 = new Variable(2, 1123);
		v2.setDegree(1);
		Assert.assertEquals(v1.equals(null), false);
	}
	
	@Test
	public void testToString0() {
		Variable v1;
		
		v1 = new Variable(2, 1);
		Assert.assertEquals(v1.toString(), "+ 1 * X^2");
	}
	
	@Test
	public void testToString1() {
		Variable v1;
		
		v1 = new Variable(0, 0);
		Assert.assertEquals(v1.toString(), "+ 0 * X^0");
	}
	
	@Test
	public void testToString2() {
		Variable v1;
		v1 = new Variable(0, 2.3);
		Assert.assertEquals(v1.toString(), "+ 2.3 * X^0");

	}
	
	
	@Test
	public void testToString3() {
		Variable v1;
	
		v1 = new Variable(2, -1.1);
		Assert.assertEquals(v1.toString(), "- 1.1 * X^2");
	}

	@Test
	public void testSetDegree0() {
		Variable v;

		v = new Variable(2, 10);
		v.setDegree(0);
		Assert.assertEquals(v.getDegree(), 0);
	}
	
	@Test
	public void testSetDegree1() {
		Variable v;

		v = new Variable(2, 10);
		v.setDegree(0);
		v.setDegree(1);
		Assert.assertEquals(v.getDegree(), 1);
	}

	@Test
	public void testSetCoefficient0() {
		Variable v;

		v = new Variable(2, 10);
		v.setCoefficient(0);
		Assert.assertEquals(v.getCoefficient(), 0, 0);
	}
	
	@Test
	public void testSetCoefficient1() {
		Variable v;

		v = new Variable(2, 10);
		v.setCoefficient(0);
		v.setCoefficient(1);
		Assert.assertEquals(v.getCoefficient(), 1, 0);
	}

	@Test
	public void testAdd0() {
		Variable v1, v2;

		v1 = new Variable(2, 10);
		v2 = new Variable(2, -10);
		v1.add(v2);
		Assert.assertEquals(v1.getCoefficient(), 0, 0);
	}
	
	@Test
	public void testAdd1() {
		Variable v1, v2;

		v1 = new Variable(2, 10);
		v2 = new Variable(2, -10);
		v1.add(v2);
		v1.add(-20);
		Assert.assertEquals(v1.getCoefficient(), -20, 0);
	}
	
	@Test
	public void testAdd2() {
		Variable v1, v2;

		v1 = new Variable(2, 10);
		v2 = new Variable(2, -10);
		v1.add(v2);
		v1.add(-20);
		v1.add(45);
		Assert.assertEquals(v1.getCoefficient(), 25, 0);
	}
}
