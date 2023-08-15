package com.problem_solver.quiz;


public class ProblemSolving {

    private ProblemSolving() {}

    // 1.Sum of Array Elements
    public static int sumOfArrayElements(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // for (int num : numbers) {
        //     sum += num;
        // }
        return sum;
    }

    // 2. Even Numbers between 1 and 20
    public static String evenNumbersBetween1And20() {
        StringBuilder result = new StringBuilder();

        for(int i = 2; i <= 20; i +=2) {
            result.append(i).append(" ");
        }
        return "Even numbers between 1 and 20: " + result.toString();
    }

    // 3. Prime Number Check

    // 4. Factorial Calculation

    // 5. Fibonacci Sequence

    // 6. Maximum Element in an Array

    // 7. Reversing an Array

    // 8. Palindrome Array Check

    // 9. Smallest Element in an Array

    // 10. Sum of Even and Product of Odd Numbers in an Array

}
