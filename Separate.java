/*
Write an application that inputs one number consisting of five digits from the user, separates 
the number into its individual digits and prints the digits separated from one another by 
three spaces each. For example, if the user types in the number 42339, the program should 
print: 4 2 3 3 9
*/

import java.util.Scanner;
public class Seperate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 5 digit numb: ");
        int numb = input.nextInt();
        
        int a = numb;
        int b = a / 10000;
        int c = a / 1000 % 10;
        int d = a / 100 % 10;
        int e = a / 10 % 10;
        int f = a % 10;
        
        System.out.printf("%d   %d   %d   %d   %d%n", b, c, d, e, f);
    }
}
