/******************************************************************************
                            Simple Calculator

Problem Statement:

Write a Java program to implement a simple calculator. The program should
prompt the user to enter two integers and an operator (+, -, *, or /).
Based on the operator entered, perform the corresponding arithmetic
operation and display the result.

If the user enters an invalid operator, display "Invalid operation".

The program should also handle invalid (non-numeric) inputs gracefully by
displaying "Invalid input". Additionally, if the user attempts to divide
by zero, display "Cannot divide by zero".

Input:
- First integer
- Second integer
- An operator (+, -, *, /)

Output:
- Result of the operation
OR
- "Invalid operation"
OR
- "Invalid input"
OR
- "Cannot divide by zero"

Example 1:
Input:
4
5
+

Output:
9

Example 2:
Input:
10
3
*

Output:
30

Example 3:
Input:
15
0
/

Output:
Cannot divide by zero

Example 4:
Input:
8
4
%

Output:
Invalid operation

Example 5:
Input:
abc
5
+

Output:
Invalid input
******************************************************************************/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();

            String op = sc.nextLine();

            switch (op) {

                case "+":
                    System.out.println(a + b);
                    break;

                case "-":
                    System.out.println(a - b);
                    break;

                case "*":
                    System.out.println(a * b);
                    break;

                case "/":
                    if (b == 0)
                        System.out.println("Cannot divide by zero");
                    else
                        System.out.println(a / b);
                    break;

                default:
                    System.out.println("Invalid operation");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}


// without try-catch
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		String op=sc.nextLine();
		
		switch(op){
		    case "+":
		        System.out.println(a+b);
		        break;
		    case "-":
		        System.out.println(a-b);
		        break;
		    case "*":
		        System.out.println(a*b);
		        break;
		    case "/":
		        System.out.println(a/b);
		        break;
		    default:
		        System.out.println("Invalid operation");
		}
	}
}
