/*
Write an application that prints the following diamond shape. You may use
output statements that print a single asterisk (*), a single space or a single newline
character. Maximize your use of iteration (with nested for statements), and
minimize the number of output statements.
*/

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args)
    {
 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt(); 
        System.out.print("Enter Symbol : ");
 
        char c = sc.next().charAt(0);
        int i=1;
        int j; 
        do 
        {
        j=1;
        do
        {
        System.out.print(" ");
 
        }while(++j<=n-i+1); 
        j=1;
        do
        {
        System.out.print(c);
 
        }while(++j<=i*2-1); 
        System.out.println();
        } while(++i<=n); 
        i=n-1; 
        do 
        {
        j=1;
        do
        {
        System.out.print(" ");
 
        }while(++j<=n-i+1); 
        j=1;
        do
        {
        System.out.print(c);
 
        }while(++j<=i*2-1); 
 
        System.out.println(); 
 
        } while(--i>0);
 
 
    }
}
