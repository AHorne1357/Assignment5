//Austin Horne

import java.util.Arrays;
import java.util.Random;

public class IntArray {

    //Fields
    private int length;
    private int[] myArray;

    //Constructors
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[l];
    }

    //Methods
    public void clear() {
        this.length = 0;
        this.myArray = null;
    }

    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(6) + 1; // Random number between 1 and 6
        }
    }

    public int get(int element) {
        if (element >= 0 && element < length) {
            return myArray[element];
        }
        return -1; // Index out of bounds indicator
    }

    public boolean isEmpty() {
        return length == 0 || myArray == null;
    }

    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue;
        }
    }

    public int size() {
        return length;
    }

    public void sort() {
        if (myArray != null) {
            Arrays.sort(myArray);
        }
    }

    @Override
    public String toString() {
        if (myArray == null || length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("Element ").append(i).append(": ").append(myArray[i]);
            if (i < length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}