// Emily Ye
// 
import java.util.*;

public class HW2 {
  
  // returns average of all inputs in double array
  public static double average(double[] a) {
    if(a.length == 0)
      throw new NoSuchElementException();
    double sum = 0; // tracks sum of elements
    for(int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum/a.length;
  }
  
  // returns average of all values within the 2D array
  public static double average(double[][] a) {
    if(a.length==0)
      throw new NoSuchElementException();
    boolean empty = true; // if array is empty
    for(double[] b : a) {
      if(b!=null && b.length != 0)
        empty = false;
    }
    if(empty == true)
      throw new NoSuchElementException();
    double sum = 0; // tracks sum of elements
    int count = 0; // counts number of elements
    for(int i = 0; i < a.length; i++) {
      if(a[i] != null) {
        for(int j = 0; j < a[i].length; j++) {
          sum += a[i][j];
          count++;
        }
      }
    }
    return sum/count;
    
  }
  
  // returns the number of words in a String
  public static int countWords(String s) {
    if(s.length() == 0)
      return 0;
    int words = 0;
    if(s.length() > 1) {
      for(int i = 0; i < s.length() - 1; i++) {
        if(s.charAt(i+1) == ' ' && s.charAt(i) != ' ')
          words++;
      }
    }
    if(s.charAt(s.length()-1) != ' ')
      words++;
    return words;
  }
  
  // returns a string truncated at the end of desired length
  /*public static String truncate(String s, int n) {
    if(n >= s.length())
      return s;
    if(n == 0 && countWords(s) > 0)
      n = 1;
    if(countWords(s) == 0)
      return "";
    StringBuilder b = new StringBuilder();
    // create temporary truncation
    for(int i = 0; i < n; i++) {
      b.append(s.charAt(i));
    }
    // if we truncated the first word, return the entire first word
    if(countWords(b.toString()) <= 1 && countWords(s) > 0) {
      if(countWords(s)>1 || s.charAt(s.length()-1) == ' ') {
        int i = 1;
        StringBuilder b2 = new StringBuilder();
        while(!(s.charAt(i-1) != ' ' && s.charAt(i) == ' ')){
          b2.append(s.charAt(i-1));
          i++;
        }
        b2.append(s.charAt(i-1));
        return b2.toString();
      }
      return s;
    }
    for(int i = n; i > 0 || ; i--) {
      if(s.charAt(i-1) != ' ' && s.charAt(i) == ' ')
    }
    return "???";
  }*/
  
  // returns a string with given amount of extra spaces in between  
  /*public static String padString(String s, int i) {
    if(countWords(s) < 2)
      return s;
    // counts how many extra spaces needed
    int spaces = i - s.length();
    // if no extra spaces needed, return original string
    if(spaces < 1)
      return s;
    //track number of words
    int wordNum = 0;
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < s.length()-1; i++) {
      builder.append(s.charAt(i));
      if(s.charAt(i) != " " && s.charAt(i+1) == " ")
        wordNum++;
        if(wordNum
        
    }
  }*/
}