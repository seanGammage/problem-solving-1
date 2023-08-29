package com.problem_solver.quiz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemSolvingTest {

    @Test
    public void testSumOfArrayElements() {
        int[] numbers = { 5, 10, 15, 20 };
        int actualSum = ProblemSolving.sumOfArrayElements(numbers);
        assertEquals(50, actualSum);
    }

    @Test
    public void testEvenNumbersBetween1And20() {
        String expectedOutput = "Even numbers between 1 and 20: 2 4 6 8 10 12 14 16 18 20 ";
        assertEquals(expectedOutput, ProblemSolving.evenNumbersBetween1And20());
    }

    // @Test
    // public void testIsPrime() {
    //     assertTrue(ProblemSolving.isPrime(7));
    //     assertFalse(ProblemSolving.isPrime(10));
    // }

    // @Test
    // public void testFactorial() {
    //     assertEquals(120, ProblemSolving.factorial(5));
    // }

    // @Test
    // public void testFibonacciSequence() {
    //     int[] expectedSequence = { 0, 1, 1, 2, 3 };
    //     assertArrayEquals(expectedSequence, ProblemSolving.fibonacciSequence(5));
    // }

    // TODO: Robert
    // @Test
    // public void testMaximumElement() {
    //     int[] data = { 12, 45, 9, 27, 6 };
    //     assertEquals(45, ProblemSolving.maximumElement(data));
    // }

    // @Test
    // public void testReverseArray() {
    //     int[] originalArray = { 1, 2, 3, 4, 5 };
    //     int[] expectedReversed = { 5, 4, 3, 2, 1 };
    //     assertArrayEquals(expectedReversed, ProblemSolving.reverseArray(originalArray));
    // }

    // @Test
    // public void testIsPalindrome() {
    //     int[] palindromeArray = { 1, 2, 3, 2, 1 };
    //     assertTrue(ProblemSolving.isPalindrome(palindromeArray));
    // }

    // TODO: Fardeens
    // @Test
    // public void testSmallestElement() {
    //     int[] values = { 8, 3, 11, 5, 7 };
    //     assertEquals(3, ProblemSolving.smallestElement(values));
    // }

    // TODO: Mustafa
    // @Test
    // public void testSumOfEvenAndProductOfOdd() {
    //     int[] nums = { 2, 5, 7, 10, 3 };
    //     assertEquals(12, ProblemSolving.sumOfEvenNumbers(nums));
    //     assertEquals(105, ProblemSolving.productOfOddNumbers(nums));
    // }
}
