package sets;

public class IntegerSet {

    private final int MAX_SIZE = 101;
    private boolean set[] = new boolean[MAX_SIZE];

    // no-argument constructor initializes the array to the "empty set"
    public IntegerSet() {
        // initializes the array to all false values
        for(int i = 0; i < set.length; i++) {
            set[i] = false;
        }
    }// end no-argument constructor

    // constructor creates new array from integers
    public IntegerSet(int array[]) {
        // initializes the array to all false values
        for(int i = 0; i < array.length; i++) {
            // Method insertElement inserts a new integer k into a set (by setting a[k] to true).
            insertElement(array[i]);
        }
    }

    public void insertElement(int insertInt) {
        // determine if entry is valid
        if(validEntry(insertInt)) {

            set[insertInt] = true;
        }

    }

    // determine if entry is valid
    public boolean validEntry(int newInt) {
        return ((newInt >= 0) && (newInt <= 100));
    }

    //
    public boolean getElement(int e) {

        return set[e];

    }
    @Override
    public String toString() {
        StringBuffer output = new StringBuffer();
        for(int s = 0; s < set.length; s++) {
            if(set[s] == true) {
                output = output.append(s);
                output = output.append(" ");
            }
        }
        return "{ " + output + "}";
    }


 // The static method union
    /*
     * creates a set that's the set-theoretic union of two existing sets
     * (i.e., an element of the new set's array is set to true if that element is true in
     * either or both of the existing sets — otherwise, the new set’s element is set to false).
     *
     */
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet();
        // The union of two sets is a new set that contains all of the elements that are in at least one of the two sets.
        for(int s = 0; s < 101; s++) {
            if((set1.getElement(s) == true) || (set2.getElement(s) == true)){
                unionSet.insertElement(s);
            }
        }
        return unionSet;
    }

    // The static method intersection
    /*
     * creates a set which is the set-theoretic intersection of two existing sets
     * (i.e., an element of the new set's array is set to false if that element is false in
     * either or both of the existing sets — otherwise, the new set’s element is set to true).
     *
     */
    public static IntegerSet intersection (IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet();
        // The intersection of two sets is a new set that contains all of the elements that are in both sets.
        for(int s = 0; s < 101; s++) {
            if((set1.getElement(s) == true) && (set2.getElement(s) == true)){
                intersectionSet.insertElement(s);
            }
        }
        return intersectionSet;
    }

    public static void displayInput(int[] set, int n) {
        int max = (set.length - 1);
        int i = 0;
        System.out.print("The elements of set[" + n + "] are {");
        for(int s : set) {
            if(i == max ) {
                System.out.print(s + "}\n");
            }
            else {
                System.out.print(s + ", ");
            }
            i++;
        }
    }

    // Method isEqualTo determines whether two sets are equal.
    public static boolean isEqualTo(IntegerSet set1, IntegerSet set2) {
        for(int s = 0; s < 101; s++) {
            if((set1.getElement(s) == true) && (set2.getElement(s) == false)){
                return false;
            }
        }
        return true;
    }

    // deleteElement
    public void deleteElement(int deleteInt) {

        set[deleteInt] = false;
    }

}
