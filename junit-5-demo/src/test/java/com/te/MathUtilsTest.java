package com.te;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;
	int counter = 0;

//	@BeforeAll
//	void beforeAll() {
//		System.out.println("Before all lets have a cup of coffee with fresh air");
//	}
//
//	@AfterAll
//	void afterAll() {
//		System.out.println("After all we are friends right?");
//	}
//
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
		System.out.println("Starting the testing process");
	}
//
//	@AfterEach
//	void myCleanupCode() {
//		System.out.println("Cleaning up all the connections");
//	}

//	@Test
//	@DisplayName("Testing add method")
//	void testAdd() {
//		assertEquals(3, mathUtils.add(1, 2), "This method should return a sum of two numbers");
//		assertEquals(1, mathUtils.add(-1, 2), "This method should return a sum of two numbers");
//		assertEquals(2, mathUtils.add(0, 2), "This method should return a sum of two numbers");
//		
//		assertAll(() -> assertEquals(3, mathUtils.add(1, 2), "This method should return a sum of two numbers"),
//				() -> assertEquals(1, mathUtils.add(-1, 2), "This method should return a sum of two numbers"),
//				() -> assertEquals(2, mathUtils.add(0, 2), "This method should return a sum of two numbers"));
//}
	@Nested
	@Tag("Math")
	class addTest {

		@Test
		@DisplayName("Testing positive numbers")
		void testPositiveNum() {

			int expected = 3;
			int actual = mathUtils.add(1, 1);
			assertEquals(expected, actual, () -> "This method should return a sum of two numbers, my expectation was :"
					+ expected + "But I got: " + actual);
		}

		@Test
		@DisplayName("Testing negetive numbers")
		void testNegetiveNum() {
			assertEquals(1, mathUtils.add(2, -1), "This method should return a sum of two numbers");
		}

	}

	@Test
	@Tag("Math")
	@DisplayName("Testing the sub method")
	void testSubstract() {
		assertEquals(3, mathUtils.substract(5, 2), "This method should minus the number");
	}

	@Test
	@Tag("Math")
	void testMultiply() {
		assertEquals(20, mathUtils.multiply(10, 2), "This method is suppose to throw an arithmetic exception");
	}

	@Test
	@Tag("Math")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(15, 0),
				"This method is suppose to throw an arithmetic exception");
	}

	@Test
	@Tag("Circle")
	void testCircleArea() {
		assertEquals(314.1592653589793, mathUtils.circleArea(10),
				"This should return the area of a circle with radius 10");
	}

}
