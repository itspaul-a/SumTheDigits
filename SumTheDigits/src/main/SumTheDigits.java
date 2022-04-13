// Paul Aguiar
// Assignment #4
// 2-16-22


package main;

import java.util.Scanner;

public class SumTheDigits {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long value = scan.nextLong();
        System.out.println("The sum of all digits is: " + sumDigits(value));
    }

    public static int sumDigits(long n) {
        int num = (int)Math.abs(n);
        int sum = 0;
        
        while(num != 0){
            sum += (num % 10);
            num = num / 10;
        }

        return sum;

	}

}
