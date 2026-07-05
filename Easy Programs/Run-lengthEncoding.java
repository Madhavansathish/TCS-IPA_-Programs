/* Write a Java program to perform Run-Length Encoding (RLE) on a given string.

Run-Length Encoding is a simple string compression technique in which
consecutive occurrences of the same character are replaced by the character
followed by the number of times it appears consecutively.

For example:
Input  : aabbbcc
Output : a2b3c2

Input  : abbccc
Output : a1b2c3
*/

// using charArray
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder res=new StringBuilder();
		char[] arr=str.toCharArray();
		
	
		for(int i=0;i<arr.length;i++){
		    int count=1;
		    
		    while(i<arr.length-1 && arr[i]==arr[i+1]){
		        count++;
		        i++;
		    }
		    res.append(arr[i]).append(count);
		}
		System.out.println(res);
	}
}

// using charAt function
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(str.charAt(i)).append(count);
            count = 1;
        }

        System.out.println(result);
    }
}
