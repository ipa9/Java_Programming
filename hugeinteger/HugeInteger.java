/*
Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. 
Method parse should receive a String, extract each digit using method charAt and place the 
integer equivalent of each digit into the integer array. For comparing HugeInteger objects, 
provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, 
isGreaterThanOrEqualTo and isLessThanOrEqualTo. Each of these is a predicate method 
that returns true if the relationship holds between the two HugeInteger objects and returns 
false if the relationship does not hold. Provide a predicate method isZero. If you feel 
ambitious, also provide methods multiply, divide and remainder. [Note: Primitive boolean 
values can be output as the word “true” or the word “false” with format specifier %b.]
*/

package integer;

import java.util.ArrayList;
import java.util.Scanner;

public class HugeInteger {

    private static int MAX_ARRAY_SIZE = 40;
    private int[] integerArray = new int[MAX_ARRAY_SIZE];

    // create Scanner to obtain input from command window
    private static Scanner input = new Scanner(System.in);


    // main constructor
    public HugeInteger(int[] integerArray) {

        for(int i = 0; i < this.integerArray.length; i++) {

            this.integerArray[i] = 0;

        }

        this.integerArray = integerArray;
    }


    // ---- ---    -------------  getter and setter methods ---------------------
     public int[] getIntegerArray() {
        return integerArray;
    }


    public void setIntegerArray(int[] integerArray) {
        this.integerArray = integerArray;
    }

    // ---- ---    ------------- end of getter and setter methods ---------------------

    // ------------------ required methods --------------------
    public static int[] parse() {

        // String for reading in and spliting up values
        String readInValues = " ";

        // read the in the string
        readInValues = input.nextLine();

        // array for holding the newly converted integers
        int[] integerArray = new  int[40];

        for(int s = 0; s < readInValues.length(); s++){

            integerArray[s] = Character.getNumericValue(readInValues.charAt(s));
        }

        return integerArray;
    }

    public static HugeInteger subtract(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        int[] result = new int[MAX_ARRAY_SIZE];

        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {
            result[i] = array1[i] - array2[i];
        }


        HugeInteger subtractionResult = new HugeInteger(result);

        return subtractionResult;
    }

    public static HugeInteger add(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        int[] result = new int[MAX_ARRAY_SIZE];

        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {
            result[i] = array1[i] + array2[i];
        }


        HugeInteger additionResult = new HugeInteger(result);

        return additionResult;
    }


    // multiply, divide and remainder
    public static HugeInteger multiply(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        int[] result = new int[MAX_ARRAY_SIZE];

        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {
            result[i] = array1[i] * array2[i];
        }


        HugeInteger multiplicationResult = new HugeInteger(result);

        return multiplicationResult;
    }

    public static HugeInteger divide(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        int[] result = new int[MAX_ARRAY_SIZE];

        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array2[i] > 0) {
                result[i] = array1[i] / array2[i];
            }

        }


        HugeInteger divisionResult = new HugeInteger(result);

        return divisionResult;
    }

    public static HugeInteger remainder(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        int[] result = new int[MAX_ARRAY_SIZE];

        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array2[i] > 0) {
                result[i] = array1[i] % array2[i];
            }
        }


        HugeInteger modulusResult = new HugeInteger(result);

        return modulusResult;
    }

    // isEqualTo,
    public static boolean[] isEqualTo(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        boolean[] isEqualToResult = new boolean[MAX_ARRAY_SIZE];


        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array1[i] == array2[i]){
                isEqualToResult[i] = true;
            }
            else {
                isEqualToResult[i] = false;
            }

        }

        return isEqualToResult;
    }

    // isNotEqualTo,
    public static boolean[] isNotEqualTo(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        boolean[] isNotEqualToResult = new boolean[MAX_ARRAY_SIZE];


        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array1[i] != array2[i]){
                isNotEqualToResult[i] = true;
            }
            else {
                isNotEqualToResult[i] = false;
            }

        }

        return isNotEqualToResult;
    }

    // isGreaterThan,
    public static boolean[] isGreaterThan(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        boolean[] isGreaterThanResult = new boolean[MAX_ARRAY_SIZE];


        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array1[i] > array2[i]){
                isGreaterThanResult[i] = true;
            }
            else {
                isGreaterThanResult[i] = false;
            }

        }

        return isGreaterThanResult;
    }

    // isLessThan,
    public static boolean[] isLessThan(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        boolean[] isLessThanResult = new boolean[MAX_ARRAY_SIZE];


        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array1[i] < array2[i]){
                isLessThanResult[i] = true;
            }
            else {
                isLessThanResult[i] = false;
            }

        }

        return isLessThanResult;
    }

    // isGreaterThanOrEqualTo,
    public static boolean[] isGreaterThanOrEqualTo(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        boolean[] isGreaterThanOrEqualToResult = new boolean[MAX_ARRAY_SIZE];


        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array1[i] >= array2[i]){
                isGreaterThanOrEqualToResult[i] = true;
            }
            else {
                isGreaterThanOrEqualToResult[i] = false;
            }

        }

        return isGreaterThanOrEqualToResult;
    }

    // isLessThanOrEqualTo.
    public static boolean[] isLessThanOrEqualTo(HugeInteger huge1, HugeInteger huge2) {

        int[] array1 = huge1.getIntegerArray();
        int[] array2 = huge2.getIntegerArray();

        boolean[] isLessThanOrEqualToResult = new boolean[MAX_ARRAY_SIZE];


        for(int i = 0; i < MAX_ARRAY_SIZE; i++) {

            if(array1[i] <= array2[i]){
                isLessThanOrEqualToResult[i] = true;
            }
            else {
                isLessThanOrEqualToResult[i] = false;
            }

        }

        return isLessThanOrEqualToResult;
    }
    // -----------------end of required methods ---------------

    // ------------------------ display method -------------------------------------


    public static String toString(HugeInteger huge1, HugeInteger huge2, HugeInteger[] arithmeticResults, ArrayList<boolean[]> booleanTestsResults) {

        String sumsHeading1 = "| HugeInteger 1 ";
        String sumsHeading2 = "| HugeInteger 2 ";
        String sumsHeading3 = "| Addition ";
        String sumsHeading4 = "| Subtraction ";
        String sumsHeading5 = "| Multiplication ";
        String sumsHeading6 = "| Division ";
        String sumsHeading7 = "| Modulus |";


        String sumsHeadingMain = sumsHeading1 + sumsHeading2 + sumsHeading3 + sumsHeading4 + sumsHeading5 + sumsHeading6 + sumsHeading7;

        String booleanHeading1 = "| HugeInteger 1 ";
        String booleanHeading2 = "| HugeInteger 2 ";
        String booleanHeading3 = "| isEqualTo ";
        String booleanHeading4 = "| isNotEqualTo ";
        String booleanHeading5 = "| isGreaterThan ";
        String booleanHeading6 = "| isLessThan ";
        String booleanHeading7 = "| isGreaterThanOrEqualTo ";
        String booleanHeading8 = "| isLessThanOrEqualTo |";

        String booleanHeadingMain = booleanHeading1 + booleanHeading2
                                                    + booleanHeading3 + booleanHeading4 + booleanHeading5
                                                    + booleanHeading6 + booleanHeading7 + booleanHeading8;

         String sumsColumns = "\n|---------------|---------------|----------|-------------|"
                 + "----------------|----------|---------|";

         String booleanColumns = "\n|---------------|---------------|-----------|--------------|"
                 + "---------------|------------|------------------------|---------------------|";

         int[] array1 = huge1.getIntegerArray();
         int[] array2 = huge2.getIntegerArray();

         HugeInteger addition = arithmeticResults[0];
         int[] addResults = addition.getIntegerArray();

         HugeInteger subtraction = arithmeticResults[1];
         int[] minusResults = subtraction.getIntegerArray();

         HugeInteger multiplication = arithmeticResults[2];
         int[] multiplyResults = multiplication.getIntegerArray();

         HugeInteger divison = arithmeticResults[3];
         int[] divideResults = divison.getIntegerArray();

         HugeInteger modulus = arithmeticResults[4];
         int[] modulusResults = modulus.getIntegerArray();

         boolean[] equalTest = booleanTestsResults.get(0);
         boolean[] isNotEqualTest = booleanTestsResults.get(1);
         boolean[] isGreaterThanTest = booleanTestsResults.get(2);
         boolean[] isLessThanTest = booleanTestsResults.get(3);
         boolean[] isGreaterThanOrEqualToTest = booleanTestsResults.get(4);
         boolean[] isLessThanOrEqualToTest = booleanTestsResults.get(5);

         int f = 0;
         int b = 0;

         String rows = "";
         String booleanRows = "";

         for(int j = 0; j < MAX_ARRAY_SIZE; j++) {

             // column 1 HugeInteger 1
             rows  = rows + "\n|";

             for(int h = 0; h < (sumsHeading1.length()/2)-1; h++) {
                 rows = rows + " ";
             }

             rows  = rows + array1[j];

             for(int h = 0; h < (sumsHeading1.length()/2)-1; h++) {
                 rows = rows + " ";
             }

             rows  = rows + "|";
             // end of column 1

             // column 2 HugeInteger 1
             for(int h = 0; h < (sumsHeading2.length()/2)-1; h++) {
                 rows = rows + " ";
             }

             rows  = rows + array2[j];

             for(int h = 0; h < (sumsHeading2.length()/2)-1; h++) {
                 rows = rows + " ";
             }

             rows  = rows + "|";
             // end of column 2

             // column 3 Addition

             if(addResults[j] >= 10) {
                 f = 0;
                 b = 2;
             }
             else if(addResults[j] < 10) {
                 f = 0;
                 b = 1;
             }
             for(int h = 0; h < (sumsHeading3.length()/2)-f; h++) {
                 rows = rows + " ";
             }

             rows  = rows + addResults[j];

             for(int h = 0; h < (sumsHeading3.length()/2)-b; h++) {
                 rows = rows + " ";
             }

             rows  = rows + "|";
             // end of column 3

             // column 4 Subtraction
             if(minusResults[j] < 0) {
                 f = 0;
                 b = 3;
             }
             else if(minusResults[j] >= 0) {
                 f = 0;
                 b = 2;
            }

             for(int h = 0; h < (sumsHeading4.length()/2)-f; h++) {
                 rows = rows + " ";
             }

             rows  = rows + minusResults[j];

             for(int h = 0; h < (sumsHeading4.length()/2)-b; h++) {
                 rows = rows + " ";
             }

             rows  = rows + "|";
             // end of column 4


             // column 5 Multiplication
             if(multiplyResults[j] >= 10) {
                 f = 0;
                 b = 2;
             }
             else if(multiplyResults[j] < 10) {
                 f = 0;
                 b = 1;
             }
             for(int h = 0; h < (sumsHeading5.length()/2)-f; h++) {
                 rows = rows + " ";
             }

             rows  = rows + multiplyResults[j];

             for(int h = 0; h < (sumsHeading5.length()/2)-b; h++) {
                 rows = rows + " ";
             }

            rows  = rows + "|";
            // end of column 5

            // column 6 Division
            for(int h = 0; h < (sumsHeading6.length()/2)-1; h++) {
                rows = rows + " ";
            }

            rows  = rows + divideResults[j];

            for(int h = 0; h < (sumsHeading6.length()/2)-0; h++) {
                rows = rows + " ";
            }

            rows  = rows + "|";
            // end of column 6

            // column 7 Modulus
            for(int h = 0; h < (sumsHeading7.length()/2)-1; h++) {
                rows = rows + " ";
            }

            rows  = rows + modulusResults[j];

            for(int h = 0; h < (sumsHeading7.length()/2)-1; h++) {
                rows = rows + " ";
            }

            rows  = rows + "|";
            // end of column 7
        }

         // boolean results
         for(int j = 0; j < MAX_ARRAY_SIZE; j++) {

             // column 1 HugeInteger 1
             booleanRows  = booleanRows + "\n|";

             for(int h = 0; h < (booleanHeading1.length()/2)-1; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + array1[j];

             for(int h = 0; h < (booleanHeading1.length()/2)-1; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + "|";
             // end of column 1

             // column 2 HugeInteger 1
             for(int h = 0; h < (booleanHeading2.length()/2)-1; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + array2[j];

             for(int h = 0; h < (booleanHeading2.length()/2)-1; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + "|";
             // end of column 2

             // column 3 boolean[] equalTest = booleanTestsResults.get(0);

             if(equalTest[j] == true) {
                 f = 3;
                 b = 2;
             }
             else if(equalTest[j] == false) {
                 f = 3;
                 b = 3;
             }
             for(int h = 0; h < (booleanHeading3.length()/2)-f; h++) {
                 booleanRows= booleanRows + " ";
             }

             booleanRows  = booleanRows + equalTest[j];

             for(int h = 0; h < (booleanHeading3.length()/2)-b; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + "|";
             // end of column 3

             // column 4  boolean[] isNotEqualTest = booleanTestsResults.get(1);
             if(isNotEqualTest[j] == true) {
                 f = 3;
                 b = 1;
             }
             else if(isNotEqualTest[j] == false) {
                 f = 3;
                 b = 2;
             }

             for(int h = 0; h < (booleanHeading4.length()/2)-f; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + isNotEqualTest[j];

             for(int h = 0; h < (booleanHeading4.length()/2)-b; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + "|";
             // end of column 4

             // column 5 boolean[] isGreaterThanTest = booleanTestsResults.get(2);
             if(isGreaterThanTest[j] == true) {
                 f = 3;
                 b = 2;
             }
             else if(isGreaterThanTest[j] == false) {
                 f = 3;
                 b = 3;
             }
             for(int h = 0; h < (booleanHeading5.length()/2)-f; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + isGreaterThanTest[j];

             for(int h = 0; h < (booleanHeading5.length()/2)-b; h++) {
                 booleanRows = booleanRows + " ";
             }

             booleanRows  = booleanRows + "|";
            // end of column 5

            // column 6 boolean[] isLessThanTest = booleanTestsResults.get(3);
             if(isGreaterThanTest[j] == true) {
                 f = 3;
                 b = 1;
             }
             else if(isGreaterThanTest[j] == false) {
                 f = 3;
                 b = 2;
             }
            for(int h = 0; h < (booleanHeading6.length()/2)-f; h++) {
                booleanRows = booleanRows + " ";
            }

            booleanRows  = booleanRows + isGreaterThanTest[j];

            for(int h = 0; h < (booleanHeading6.length()/2)-b; h++) {
                booleanRows = booleanRows + " ";
            }

            booleanRows  = booleanRows + "|";
            // end of column 6

            // column 7 boolean[] isGreaterThanOrEqualToTest = booleanTestsResults.get(4);
            if(isGreaterThanOrEqualToTest[j] == true) {
                f = 3;
                b = 1;
            }
            else if(isGreaterThanOrEqualToTest[j] == false) {
                f = 3;
                b = 2;
            }
            for(int h = 0; h < (booleanHeading7.length()/2)-f; h++) {
                booleanRows = booleanRows + " ";
            }

            booleanRows  = booleanRows + isGreaterThanOrEqualToTest[j];

            for(int h = 0; h < (booleanHeading7.length()/2)-b; h++) {
                booleanRows = booleanRows + " ";
            }

            booleanRows  = booleanRows + "|";
            // end of column 7

            // column 8
            // boolean[] isLessThanOrEqualToTest = booleanTestsResults.get(5);
            if(isLessThanOrEqualToTest[j] == true) {
                f = 3;
                b = 2;
            }
            else if(isLessThanOrEqualToTest[j] == false) {
                f = 3;
                b = 3;
            }
            for(int h = 0; h < (booleanHeading8.length()/2)-f; h++) {
                booleanRows = booleanRows + " ";
            }

            booleanRows  = booleanRows + isLessThanOrEqualToTest[j];

            for(int h = 0; h < (booleanHeading8.length()/2)-b; h++) {
                booleanRows = booleanRows + " ";
            }

            booleanRows  = booleanRows + "|";
            // end of column 8
        }

        return sumsHeadingMain + sumsColumns + rows + "\n\n"+ booleanHeadingMain + booleanColumns + booleanRows;
    }

}
