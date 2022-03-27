/*
A positive integer is a palindrome if its value is the same after reversing the order of the
digits in the number. For example, 12321 is a palindrome, but 12563 is not. Write a method
that determines whether a number is a palindrome. Use this method in an application that
determines whether a number entered by the user is a palindrome or not and prints the
result to the console.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter the Number: ");
        int n = input.nextInt();
        int a = 0, b;
        int x = n;

        while (n != 0) {
            b = n % 10;
            a = a * 10 + b;
            n /= 10;
        }

        if (x == a) {
            System.out.println(x + " is Palindrome.");
        }
        else {
            System.out.println(x + " is not Palindrome.");
        }
    }
}
