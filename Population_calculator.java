/*
Search the Internet to determine and pick any country current population and the annual 
population growth rate. Write an application that inputs these values, then displays the 
estimated population after one, two, three, four and five years.
*/
import java.util.Scanner;
public class App2 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter Current World Population: ");
        int a = input.nextInt();
        System.out.print ("Enter Annual Population Growth Rate: ");
        int b = input.nextInt();
        int c = (b / 100) * a;
        int d = a + c;
        
        int oneYear = d;
        int twoYears = d + (c * 2);
        int threeYears = d + (c * 3);
        int fourYears = d + (c * 4);
        int fiveYears = d + (c * 5);

        System.out.printf("After one year: %d", oneYear);
        System.out.printf("After two years: %d", twoYears);
        System.out.printf("After three years: %d", threeYears);
        System.out.printf("After four years: %d", threeYears);
        System.out.printf("After five years: %d", fiveYears);
    }
}
