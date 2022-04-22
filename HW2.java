// Emily Ye
// A class that includes various methods for manipulating Strings and arrays

import java.util.*;

public class HW2 {

    // returns average of all inputs in double array
    public static double average(double[] a) {
        if(a.length == 0)
            throw new NoSuchElementException();
        double sum = 0; // tracks sum of elements
        for(int i = 0; i < a.length; i++) { // loop through array and add each element to sum
            sum += a[i];
        }
        return sum/a.length;
    }

    // returns average of all values within the 2D array
    public static double average(double[][] a) {
        if(a.length==0)
            throw new NoSuchElementException();
        boolean empty = true; // if array is empty
        for(double[] b : a) { // loop through and check if there is anything in the array
            if(b!=null && b.length != 0)
                empty = false;
        }
        if(empty == true)
            throw new NoSuchElementException();
        double sum = 0; // tracks sum of elements
        int count = 0; // counts number of elements
        for(int i = 0; i < a.length; i++) {
            if(a[i] != null) {
                for(int j = 0; j < a[i].length; j++) { //loop through 2D array and add each element to sum, also track how many elements there are
                    sum += a[i][j];
                    count++;
                }
            }
        }
        return sum/count;

    }

    // returns the number of words in a String
    public static int countWords(String s) {
        int words = 0; // tracks number of words
        if(s.length() == 0)
            return 0;
        else if(s.length() > 1) {
            for(int i = 0; i < s.length() - 1; i++) { // loops through and if it finds a letter followed by a space, add 1 to words
                if(s.charAt(i+1) == ' ' && s.charAt(i) != ' ')
                    words++;
            }
        }
        if(s.charAt(s.length()-1) != ' ') //if there's a space at the end, also add 1 to words
            words++;
        return words;
    }

    // returns a string truncated at the end of desired length
    public static String truncate(String s, int n) {
        return "???";
    }

    // returns a string with given amount of extra spaces in between
    public static String padString(String s, int i) {
        return "???";
    }
    
    public static boolean isEnd(String s, int i) {
    	return s.charAt(i) != ' ' && (i == s.length() - 1 || s.charAt(i + 1) == ' ');
    }
}