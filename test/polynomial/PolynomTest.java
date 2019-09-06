package polynomial;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import solve.Equation;

public class PolynomTest {

	@Test
	public void testContructor0() {
		Polynom polynom = new Polynom();
		Assert.assertTrue(polynom.getCoeffs() != null);
	}
	
	@Test
	public void testContructor1() {
		int[] intCoefficients = {1, 15, 4, 0, 3};
		double[] doubleCoefficients = {1, 15, 4, 0, 3};
		Polynom polynom = new Polynom(intCoefficients);
		Assert.assertArrayEquals(doubleCoefficients, polynom.getCoeffs(),0.0);
	}
	
	@Test
	public void testContructor2() {
		double[] doubleCoefficients = {1, 15, 4, 0, 3};
		Polynom polynom = new Polynom(doubleCoefficients);
		Assert.assertArrayEquals(doubleCoefficients, polynom.getCoeffs(),0.0);
	}
	
	@Test
	public void testContructor3() {
		Polynom polynom = new Polynom(3,4);
		Assert.assertTrue(polynom.getCoeffs() != null);
	}
	
	@Test
	public void testContructor4() {
		Polynom polynom = new Polynom(3.0,4);
		Assert.assertTrue(polynom.getCoeffs() != null);
	}
	
	@Test
	public void testContructor5() {
		String s5 = " -18*x^2 + 14*x + 5 ";
		double[] doubleCoeff= {5,14,-18};
        
        
        Polynom polynum = new Polynom(s5);
        Assert.assertArrayEquals(doubleCoeff, polynum.getCoeffs(), 0);
        
	}
	
	@Test
	public void testContructor6() {
		String s6 = " +7.5 + 5.0·x + 40·x^2 + 3x^4";
		double[] doubleCoeff= {7.5,5,40,0,3};
		
		Polynom polynum = new Polynom(s6);
        Assert.assertArrayEquals(doubleCoeff, polynum.getCoeffs(), 0);
	}
	
	@Test
	public void testContructor7() {
		String s7 = "10x^10";
		double[] doubleCoeff= {0,0,0,0,0,0,0,0,0,0,10};
		
		Polynom polynum = new Polynom(s7);
        Assert.assertArrayEquals(doubleCoeff, polynum.getCoeffs(), 0);
	}
	

	@Test
	public void testContructor8() {
		Polynom polynom = new Polynom(0,0);
		Assert.assertTrue(polynom.getCoeffs() != null);
	}
	
	@Test
	public void testEquals0() {
		Polynom p1 = new Polynom("x^2-2*x+3");
		Polynom p2 = new Polynom("x^2-2*x+3");
		
		boolean result = p1.equals(p2);
		
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void testEquals1() {
		Polynom p1 = new Polynom();
		Polynom p2 = new Polynom();
		
		boolean result = p1.equals(p2);
		
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void testEquals2() {
		Polynom p1 = new Polynom("x^2-2*x+3");
		Polynom p2 = new Polynom("-x^2-2*x+3");
		
		boolean result = p1.equals(p2);
		
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void testEquals3() {
		Polynom p1 = new Polynom();
		Polynom p2 = new Polynom("x^3+2*x^2");
		
		boolean result = p1.equals(p2);
		
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void testEquals4() {
		Polynom p1 = new Polynom("3*x^0");
		
		boolean result = p1.equals(3.0);
		
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void testEquals5() {
		Polynom p1 = new Polynom("3*x^0");
		
		boolean result = p1.equals(3);
		
		Assert.assertEquals(true,result);
	}
	
	public void testEquals6() {
		Polynom p1 = new Polynom("a^2-2*x+3");
		Polynom p2 = new Polynom("-x^2-2*x+3");
		
		boolean result = p1.equals(p2);
		
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void testEquals7() {
		Polynom p1 = new Polynom("3a*x^0");
		
		boolean result = p1.equals(3);
		
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void testIsConst0() {
		Polynom p1 = new Polynom("3*x^0");
		
		boolean result = p1.isConst();
		
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void testIsConst1() {
		Polynom p1 = new Polynom("3*x^2");
		
		boolean result = p1.isConst();
		
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void testAdd0() {
		Polynom p1 = new Polynom("x^2-2*x+3");
		Polynom p2 = new Polynom("-x^2-2*x+3");
		
		Polynom result = p1.add(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {6,-4};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testAdd1() {
		Polynom p1 = new Polynom("x^2-2*x+3");
		Polynom p2 = new Polynom("x^2-2*x+3");

		Polynom result = p1.add(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {6,-4,2};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testAdd2() {
		Polynom p1 = new Polynom("x^3-2*x+3");
		Polynom p2 = new Polynom("x^2-2*x+3");

		Polynom result = p1.add(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {6,-4,1,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testAdd3() {
		Polynom p1 = new Polynom("ax^2-2*x+3");
		Polynom p2 = new Polynom("x^2-2*x+3");

		Polynom result = p1.add(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {6,-4,2};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testSub0() {
		Polynom p1 = new Polynom("x^2-2*x+3");
		Polynom p2 = new Polynom("x^2-2*x+3");
		
		Polynom result = p1.subtract(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testSub1() {
		Polynom p1 = new Polynom("x^2-2*x+3");
		Polynom p2 = new Polynom("-x^2-2*x+3");
		
		Polynom result = p1.subtract(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0,0,2};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testSub2() {
		Polynom p1 = new Polynom("x^3-2*x^2+10");
		Polynom p2 = new Polynom("-x^2-2*x+3");
		
		Polynom result = p1.subtract(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {7,2,-1,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testMul0() {
		Polynom p1 = new Polynom("x+2");
		Polynom p2 = new Polynom("x-2");
		
		Polynom result = p1.multiply(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {-4,0,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testMul1() {
		Polynom p1 = new Polynom("x+3");
		Polynom p2 = new Polynom("x-2");
		
		Polynom result = p1.multiply(p2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {-6,1,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testMul2() {
		Polynom p1 = new Polynom("x^4-3*x^2+15*x+3");
		
		Polynom result = p1.multiply(10);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {30,150,-30,0,10};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testMul3() {
		Polynom p1 = new Polynom("x^4-3*x^2+15*x+3");
		
		Polynom result = p1.multiply(-3);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {-9,-45,9,0,-3};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testMul4() {
		Polynom p1 = new Polynom("x^4+3*x^2+15*x+3");
		
		Polynom result = p1.multiply(-1);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {-3,-15,-3,0,-1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
	}
	
	@Test
	public void testPower0() {
		Polynom p1= new Polynom("x+2");
		
		Polynom result = p1.power(2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {4,4,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);	
	}
	
	@Test
	public void testPower1() {
		Polynom p1= new Polynom("x^2+3");
		
		Polynom result = p1.power(2);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {9,0,6,0,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);	
	}
	
	@Test
	public void testPower2() {
		Polynom p1= new Polynom("x+2");
		
		Polynom result = p1.power(3);
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {8,12,6,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);	
	}
	
	@Test
	public void testDiff0() {
		Polynom p1 = new Polynom("3*x^3+2*x^2+3*x+6");
		
		Polynom result = p1.differentiate();
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {3,4,9};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testDiff1() {
		Polynom p1 = new Polynom("6");
		
		Polynom result = p1.differentiate();
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testDiff2() {
		Polynom p1 = new Polynom("0");
		
		Polynom result = p1.differentiate();
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testDiff3() {
		Polynom p1 = new Polynom("-3*x");
		
		Polynom result = p1.differentiate();
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {-3};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testNthDiff0() {
		Polynom p1 = new Polynom("3*x^4");
		
		Polynom result = p1.differentiate(3);
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0,72};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testNthDiff1() {
		Polynom p1 = new Polynom("a*x^4");
		
		Polynom result = p1.differentiate(3);
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0,72};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testAntiDiff0() {
		Polynom p1 = new Polynom("x+2");
		
		Polynom result = p1.antiderivative();
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {0,2,.5};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testAntiDiff1() {
		Polynom p1 = new Polynom("sinx");
		
		Polynom result = p1.antiderivative();
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testGCD0() {
		Polynom p1 = new Polynom("x^2 + 7*x + 6");
		Polynom p2 = new Polynom("x^2 - 5*x - 6");
		
		Polynom result = p1.gcd(p2);
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {1,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testGCD1() {
		Polynom p1 = new Polynom("x+2");
		Polynom p2 = new Polynom();
		
		Polynom result = p1.gcd(p2);
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testGCD2() {
		Polynom p1 = new Polynom("x+2");
		Polynom p2 = new Polynom("x+2");
		
		Polynom result = p1.gcd(p2);
		
		double[] coeffResult = result.getCoeffs();
		double[] coeffExpected = {2,1};
		Assert.assertArrayEquals(coeffExpected, coeffResult, 0);
		
	}
	
	@Test
	public void testSolve0() {
		Polynom polynom = new Polynom("x^2-6*x+9");
		
		double[] rootResult = polynom.solve();
		double[] rootExpected = {3};
		
		Assert.assertArrayEquals(rootExpected, rootResult,0);
	}
	
	
	@Test
	public void testSolve1() {
		Polynom polynom = new Polynom("x^2 + 7*x + 6");
		
		double[] rootResult = polynom.solve();
		double[] rootExpected = {-1,-6};
		
		Assert.assertArrayEquals(rootExpected, rootResult,0);
	}
	
	@Test
	public void testSolve2() {
		Polynom polynom = new Polynom("x^2 + 2");
		
		double[] rootResult = polynom.solve();
		Assert.assertNull("Complex root can not be calculated",rootResult);
	}
	
	@Test
	public void testToString0() {
		Polynom p1 = new Polynom();
		
		String result = p1.toString();
		String expected = "1.0";
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testToString1() {
		Polynom p1 = new Polynom("x^2+2");
		
		String result = p1.toString();
		String expected = "2.0 + 1.0·x^2";
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testToString2() {
		Polynom p1 = new Polynom("x^6 - 21x^5 + 175x^4 - 735x^3 + 1624x^2 - 1764x + 720");
		
		String result = p1.toString();
		String expected = "720.0 - 1764.0·x + 1624.0·x^2 - 735.0·x^3 + 175.0·x^4 - 21.0·x^5 + 1.0·x^6";
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void testToString3() {
		Polynom p1 = new Polynom(0,0);
		
		String result = p1.toString();
		String expected = "0.0";
		
		Assert.assertEquals(expected, result);
		
	}
	
	
	@Test
	public void testIntegrate0() {
		Polynom p1 = new Polynom();
		
		double result = p1.integrate(10, 100);
		
		Assert.assertEquals(90,result,0);
	}
	
	
	@Test
	public void testIntegrate1() {
		Polynom p1 = new Polynom("x^2+3x+1");
		
		double result = p1.integrate(10, 100);
		
		Assert.assertEquals(347940.0,result,0);
	}
	
	
	@Test
	public void testIntegrate2() {
		Polynom p1 = new Polynom(0,0);
		
		double result = p1.integrate(10, 100);
		
		Assert.assertEquals(0,result,0);
	}

}
