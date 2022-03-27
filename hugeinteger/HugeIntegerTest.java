package integer;

import java.util.ArrayList;

public class HugeIntegerTest {

    public static void main(String[] args) {

        // prompt the user for string of up to 40 values
        System.out.println("The first huge integer object......");
        System.out.print("Enter up to 40 integer values: ");

        int[] integerArray = HugeInteger.parse();

        HugeInteger huge1 = new HugeInteger(integerArray);

        System.out.println("\nThe second huge integer object......");
        System.out.print("Enter up to 40 integer values: ");
        integerArray = HugeInteger.parse();

        HugeInteger huge2 = new HugeInteger(integerArray);

        // arithmetic
        HugeInteger addition = HugeInteger.add(huge1, huge2);
        HugeInteger subtract = HugeInteger.subtract(huge1, huge2);
        HugeInteger multiplication = HugeInteger.multiply(huge1, huge2);
        HugeInteger divison = HugeInteger.divide(huge1, huge2);
        HugeInteger remain = HugeInteger.remainder(huge1, huge2);

        // array of arithmetic tests results
        HugeInteger[] arithmeticResults = {addition, subtract, multiplication, divison, remain};

        // boolean
        boolean[] equalTest = HugeInteger.isEqualTo(huge1, huge2);
        boolean[] isNotEqualTest = HugeInteger.isNotEqualTo(huge1, huge2);
        boolean[] isGreaterThanTest = HugeInteger.isGreaterThan(huge1, huge2);
        boolean[] isLessThanTest = HugeInteger.isLessThan(huge1, huge2);
        boolean[] isGreaterThanOrEqualToTest = HugeInteger.isGreaterThanOrEqualTo(huge1, huge2);
        boolean[] isLessThanOrEqualToTest = HugeInteger.isLessThanOrEqualTo(huge1, huge2);

        // array of boolean tests results
        ArrayList<boolean[]> booleanTestsResults = new ArrayList<boolean[]>();
        booleanTestsResults.add(equalTest);
        booleanTestsResults.add(isNotEqualTest);
        booleanTestsResults.add(isGreaterThanTest);
        booleanTestsResults.add(isLessThanTest);
        booleanTestsResults.add(isGreaterThanOrEqualToTest);
        booleanTestsResults.add(isLessThanOrEqualToTest);

        System.out.println(HugeInteger.toString(huge1, huge2, arithmeticResults, booleanTestsResults));


    }
}
