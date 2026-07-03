/******************************************************************************
                            Armstrong Number

Problem Statement:

Write a Java program to check whether a given integer is an Armstrong number
or not.

An Armstrong number is a number that is equal to the sum of its own digits,
where each digit is raised to the power of the total number of digits.

Input:
An integer N.

Output:
Print true if the given number is an Armstrong number.
Otherwise, print false.

Example 1:
Input:
153

Output:
true

Explanation:
Number of digits = 3
1³ + 5³ + 3³ = 1 + 125 + 27 = 153
Hence, the output is true.

Example 2:
Input:
9474

Output:
true

Explanation:
Number of digits = 4
9⁴ + 4⁴ + 7⁴ + 4⁴
= 6561 + 256 + 2401 + 256
= 9474
Hence, the output is true.

Example 3:
Input:
123

Output:
false

Explanation:
1³ + 2³ + 3³ = 36 ≠ 123
Hence, the output is false.

Sample Test Cases:

Test Case 1
Input:
153
Output:
true

Test Case 2
Input:
9474
Output:
true

Test Case 3
Input:
370
Output:
true

Test Case 4
Input:
407
Output:
true

Test Case 5
Input:
1634
Output:
true

Test Case 6
Input:
123
Output:
false

Test Case 7
Input:
100
Output:
false

Test Case 8
Input:
10
Output:
false

******************************************************************************/


//Using Pow function 
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int power = 0;

        while (temp > 0) {
            power++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, power);
            temp /= 10;
        }

        if (sum == num)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

//without using pow function
import java.util.*;

public class Main {

    public static boolean Armstrong(int num) {

        int temp = num;
        int power = 0;

        while (temp > 0) {
            power++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        while (temp > 0) {

            int digit = temp % 10;

            int value = 1;

            for (int i = 1; i <= power; i++) {
                value *= digit;
            }

            sum += value;

            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Armstrong(n));
    }
}


// using object creation
import java.util.*;

public class Main {

    public boolean Armstrong(int num) {
        int temp = num;
        int power = 0;

        while (temp > 0) {
            power++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, power);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Main obj = new Main();

        boolean res = obj.Armstrong(n);

        System.out.println(res);
    }
}



