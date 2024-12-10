/**
* Class: CMSC201
* Instructor: Dr. Grinberg
* Description: This is the test for PrimeNumberMethod, and I split the test into three different tests. PrimeNumberMethod passes the first test and fails the other two. 
* Due: 12/16/2024
* I pledge that I have completed the programming assignment independently.
  I have not copied the code from a student or any source.
  I have not given my code to any student.
  Print your Name here: Kiara Chambers
*/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeNumberMethodTest {
	
	/**Tests isPrime method*/
	/**This test checks the first couple prime numbers to check if PrimeNumberMethod determines that they are prime.*/
	@Test
	public void testIsPrimeWithPrimeNumbers() {
		assertTrue(PrimeNumberMethod.isPrime(2));
		assertTrue(PrimeNumberMethod.isPrime(3));
		assertTrue(PrimeNumberMethod.isPrime(5));
		assertTrue(PrimeNumberMethod.isPrime(7));
		assertTrue(PrimeNumberMethod.isPrime(13));
	}
	
	/**This test checks a few not prime numbers to check if PrimeNumberMethod determines that they are prime. 
	 * This test passes.*/
	@Test
	public void testIsPrimeWithNotPrimeNumbersAboveTwo() {
		assertFalse(PrimeNumberMethod.isPrime(4));
		assertFalse(PrimeNumberMethod.isPrime(6));
		assertFalse(PrimeNumberMethod.isPrime(8));
		assertFalse(PrimeNumberMethod.isPrime(9));
	}
	/**This test checks the number 1, which should not be prime. 
	 * This test fails with the original PrimeNumberMethod class, showing that something is wrong.
	 * This is because the isPrime method doesn't correctly deal with numbers like 1 that are less than 2.*/
	@Test
	public void testIsPrimeWithOne() {
		assertFalse(PrimeNumberMethod.isPrime(1));
	}
	
	/**This test checks 0 and to see if PrimeNumberMethod correctly determines that it is not prime.
	 * Because PrimeNumberMethod doesn't account for numbers below 2, the method fails this test.*/
	@Test
	public void testIsPrimeWithZero() {
		assertFalse(PrimeNumberMethod.isPrime(0));
	}
	
	/**This test checks negative numbers to see if PrimeNumberMethod correctly determines that they are not prime.
	 * Because PrimeNumberMethod doesn't account for numbers below 2, the method fails this test.*/
	@Test
	public void testIsPrimeWithNegativeNumbers() {
		assertFalse(PrimeNumberMethod.isPrime(-1));
		assertFalse(PrimeNumberMethod.isPrime(-9));
	}

}
