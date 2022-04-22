// Emily Ye
// A class that includes various methods for manipulating Strings and arrays

import java.util.*;

public class HW2 {

    // returns average of all inputs in double array
    public static double average(double[] a) {
        if(a.length == 0)
            throw new NoSuchElementException();
        double sum = 0; // tracks sum of elements
        for(double d : a) { // loop through array and add each element to sum
            sum += d;
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
        if(empty)
            throw new NoSuchElementException();
        double sum = 0; // tracks sum of elements
        int count = 0; // counts number of elements
        for(double[] d : a) {
            if(d != null) {
                for(double o : d) { //loop through 2D array and add each element to sum, also track how many elements there are
                    sum += o;
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
        for(int i = 0; i < s.length(); i++) { // loops through and if it finds a letter followed by a space, add 1 to words
            if(isEnd(s, i))
                words++;
        }
        return words;
    }

    // returns a string truncated at the end of desired length
    public static String truncate(String s, int n) {
        if(s.length() <= n)
            return s;
        StringBuilder build = new StringBuilder();
        if(countWords(s) == 0) {
            for (int i = 0; i < n; i++) {
                build.append(s.charAt(i));
            }
            return build.toString();
        }
        int index = 0; // index that s should be truncated at
        boolean firstWord = true; //track whether we are iterating through the first word
        for(int i = 0; i < s.length(); i++) {
            if((isEnd(s, i)) && (i < n || firstWord)) {
                index = i;
                firstWord = false;
            }
        }
        for(int i = 0; i <= index; i++)
            build.append(s.charAt(i));
        return build.toString();
    }

    // returns a string with given amount of extra spaces in between
    public static String padString(String s, int n) {
        int words = countWords(s); // num words in s
        int spaces = (n - s.length()) / (words - 1);
        int remainder = (n - s.length()) % (words - 1);
        
    }

    // helper method
    // checks if the index i in String s is the last letter of a word
    public static boolean isEnd(String s, int i) {
        return s.charAt(i) != ' ' && (i == s.length() - 1 || s.charAt(i + 1) == ' ');
    }

    // prints the string to the screen so that each line is exactly a specified number of characters wide
    public static void prettyPrint(String s, int n) {

    }
}