// Emily Ye
// Test the HW2 file

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class HW2Tester {

   @Test
   public void testAverage1D() {
     // 1) tests 0 elements
     boolean thrown = false;
     try {
       HW2.average(new double[]{});
     } catch (NoSuchElementException e) {
       thrown = true;
     }
     assertTrue(thrown);
     // 2) tests 1 element
     assertEquals(1.5, HW2.average(new double[]{1.5}), .0000001);
     // 3) tests 1 element of 0
     assertEquals(0, HW2.average(new double[]{0}), .0000001);
     // 4) tests many elements
     assertEquals(1.25, HW2.average(new double[]{1.1, 1.2, 1.3, 1.4}), .0000001);
     // 5) tests many elements that are all 0
     assertEquals(0, HW2.average(new double[]{0, 0, 0, 0, 0}), .0000001);
     // 6) tests negative numbers
     assertEquals(0, HW2.average(new double[]{5, 15, -18, 0, -2}), .0000001);
   }
   
   @Test
   public void testAverage2D() {
     // 1) tests empty matrix
     boolean thrown = false;
     try {
       HW2.average(new double[0][0]);
     } catch (NoSuchElementException e) {
       thrown = true;
     }
     assertTrue(thrown);
     // tests empty 5x1 matrix
     thrown = false;
     try {
       HW2.average(new double[5][0]);
     } catch (NoSuchElementException e) {
       thrown = true;
     }
     assertTrue(thrown);
     // tests matrix with 5 rows with 0 elements in each
     thrown = false;
     try {
       HW2.average(new double[5][]);
     } catch (NoSuchElementException e) {
       thrown = true;
     }
     assertTrue(thrown);
     // tests matrix with some empty rows and some not empty rows
     assertEquals(3.5, HW2.average(new double[][]{{},{2, 3},{},{4, 5},{}}), .0000001);
     // tests 5x5 matrix of zeroes
     assertEquals(0.0, HW2.average(new double[5][5]), .0000001);
     // tests 1 element
     assertEquals(1.5, HW2.average(new double[][]{{1.5}}), .0000001);
     // tests 1 element in each row
     assertEquals(40.5, HW2.average(new double[][]{{40},{41},{39},{42}}), .0000001);
     // tests many rows and many columns
     assertEquals(1.2, HW2.average(new double[][]{{1.1, 1.2}, {1.3}}), .0000001);
   }
   
   @Test
   public void testCountWords() {
     // empty string
     assertEquals(0, HW2.countWords(""));
     // one letter
     assertEquals(1, HW2.countWords("a"));
     // one letter with many spaces on either side
     assertEquals(1, HW2.countWords("    a   "));
     // one word
     assertEquals(1, HW2.countWords("  hello"));
     // just spaces
     assertEquals(0, HW2.countWords("    "));
     // test many words
     assertEquals(10, HW2.countWords("pussy hat slay queen boots the house down ! !"));
     // many words with spaces
     assertEquals(10, HW2.countWords(" pussy hat slay queen boots the house down ! ! "));
     // DOTS
     assertEquals(5, HW2.countWords(". . . . ."));
     // checking numbers
     assertEquals(5, HW2.countWords("chicken3 fart b3 p00pin h4rd"));
   }
   
   /*@Test
   public void testTruncate() {
     // should return one word
     // asks for desired length 0
     assertEquals("      Hi", HW2.truncate("      Hi      ", 0));
     // desired length ends perfectly after first word
     assertEquals(" A", HW2.truncate(" A ", 2));
     // desired length ends perfectly after first word multiple words
     assertEquals("i", HW2.truncate("i love muffins", 2));
     // truncates first word with 0
     assertEquals("banana", HW2.truncate("banana ", 0));
     // truncates first word in middle
     assertEquals("banana", HW2.truncate("banana ", 4));
     
     // 
     
   }*/
 }