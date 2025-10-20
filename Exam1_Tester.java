import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.*;
import java.util.*;

/*

You can compile and run your code with the following commands (make sure the unit testing jar is in your current directory)

javac -classpath ".:junit-platform-console-standalone-1.7.0-M1.jar" *.java
java -classpath ".:junit-platform-console-standalone-1.7.0-M1.jar" org.junit.runner.JUnitCore Exam1_Tester

to submit to the submitserver, tar your files with:

tar -cvf exam1.tar Fruit.java Pear.java Berry.java

and submit exam1.tar to the link for "live coding exam 1" on the submitserver.

*/

public class Exam1_Tester {

  @Test
  public void test1() {
    Pear bartlett = new Pear(254, "long"); // grams and shape
    assertEquals("254 long", bartlett.toString());
  }
  
  @Test
  public void test2() {
    Berry raspberry = new Berry(23, true); // grams and has seeds
    assertEquals("23 true", raspberry.toString());
  }

  @Test
  public void test3() {
    Fruit.count = 4;
    Pear bartlett = new Pear(254, "long");
    Berry raspberry = new Berry(23, true); 
    Pear bartlett2 = new Pear(254, "long");
    assertEquals(7, Fruit.count);
  }

  @Test
  public void test4() {
    Pear bartlett = new Pear(254, "long");
    bartlett.cook(3); //void return type
    assertEquals(1273, bartlett.getGrams());
  }

  @Test
  public void test5() {
    Berry blueberry = new Berry(25, false); 
    blueberry.cook(2); //void return type
    assertEquals(52, blueberry.getGrams());
  }

  @Test
  public void test6() {
    Pear bartlett = new Pear(254, "long");
    bartlett.slice(); //void return type
    assertEquals(127, bartlett.getGrams());

    Berry blueberry = new Berry(25, false); 
    blueberry.slice(); //void return type
    assertEquals(12, blueberry.getGrams());
  }

  @Test
  public void test8() {
    Pear bartlett = new Pear(254, "circle");
    Berry blueberry = new Berry(25, false); 
    assertEquals(1, bartlett.compareTo(blueberry)); //compares based on salaries
    assertEquals(-1, blueberry.compareTo(bartlett));
    assertEquals(0, blueberry.compareTo(blueberry));

    ArrayList<Fruit> list = new ArrayList<Fruit>();
    list.add(bartlett);
    list.add(blueberry);
    Collections.sort(list); // sorts based on salaries
  }

  @Test
  public void test9() {
    ArrayList<Fruit> stand = new ArrayList<Fruit>();
    stand.add(new Pear(254, "circle"));
    stand.add(new Berry(25, false));
    String printout = Arrays.toString(stand.toArray());
    assertEquals("[254 circle, 25 false]", printout);
    for(int i = 0; i < stand.size(); i++){
      Fruit fruit = stand.get(i);
      fruit.cook(3);
    }
  }

  @Test
  public void test10() {
    assertEquals(true, checkInFile("Fruit.java", "public abstract class Fruit"));
    assertEquals(true, checkInFile("Fruit.java", "protected") || checkInFile("Fruit.java", "private"));
  }

/*
    HELPER METHODS FROM LAB 2 TESTER
*/

  private boolean checkInFile(String filename, String phrase){
    try {
      File file = new File("./" + filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()){
        String line = scanner.nextLine();
        line = line.replaceAll("\\s+","") ;
        phrase = phrase.replaceAll("\\s+","") ;
        if (line.contains(phrase))
          return true;
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }

}
