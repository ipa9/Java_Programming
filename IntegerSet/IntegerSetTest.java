package sets;

import java.util.Scanner;

public class IntegerSetTest {

    public static void main(String[] args) {

        //create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // input both sets
        System.out.println("Create two sets of integers in the range 0 — 100.");
        // the first set of elements
        System.out.print("Input the the values for the first set (each value separated by a space):");
        String text1 = keyboard.nextLine();      // get the entire line after the prompt
        String[] elements1 = text1.split(" ");    // split by spaces
        int set1[] = new int[elements1.length];
        for(int n = 0; n < elements1.length; n++) {
            set1[n] = Integer.parseInt(elements1[n]);
        }

        // the first set of elements
        System.out.print("Input the the values for the second set (each value separated by a space):");
        String text2 = keyboard.nextLine();      // get the entire line after the prompt
        String[] elements2 = text2.split(" ");    // split by spaces
        int set2[] = new int[elements2.length];
        for(int n = 0; n < elements2.length; n++) {
            set2[n] = Integer.parseInt(elements2[n]);
        }

        IntegerSet integerSet1 = new IntegerSet(set1);
        IntegerSet integerSet2 = new IntegerSet(set2);

        // Union
        IntegerSet union = IntegerSet.union(integerSet1, integerSet2);

        // intersection
        IntegerSet intersection = IntegerSet.intersection(integerSet1, integerSet2);

        // --- test inputs ------
        IntegerSet.displayInput(set1, 1);
        IntegerSet.displayInput(set2, 2);

        // toString
        System.out.println("\nThe elements of integerSet1 are " + integerSet1.toString());
        System.out.println("The elements of integerSet2 are " + integerSet2.toString() + "\n");

        // delete element
        System.out.println("Deleting element '91' from integerSet2......");
        integerSet2.deleteElement(91);

        // toString
        System.out.println("\nThe elements of integerSet1 are " + integerSet1.toString());
        System.out.println("The elements of integerSet2 are " + integerSet2.toString() + "\n");

        // Are both sets equal
        boolean areEqual = IntegerSet.isEqualTo(integerSet1, integerSet2);
        if(areEqual == true) {
            System.out.println("integerSet1 and integerSet2 are equal.");
        }
        else {
            System.out.println("integerSet1 and integerSet2 are not equal.");
        }


        // display union set
        System.out.println("\nThe elements of the union Set are " + union.toString());

        // display intersection set
        System.out.println("The elements of the intersection Set are " + intersection.toString());
    }


}
