import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first int: ");
        int numb1 = input.nextInt();
        
        System.out.print("Enter second int: ");
        int numb2 = input.nextInt();
        
        int sum = numb1 + numb2;
        
        System.out.printf("The sum of 2 numbers is: %d", sum);
    }
}
