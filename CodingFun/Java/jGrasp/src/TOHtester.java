/*
   TCSS 143 
   Author:  Raghavi Sakpal
   Description: Tester program to test the Tower of Hanoi problem 
*/

public class TOHtester {
   public static void main(String[] args) {
      // Test 1: Create an instance of the Hanoi problem for n = 1 
      Hanoi h1 = new Hanoi(1);
      
      // Make a recursive call 
      System.out.println("TEST 1: where n = 1");
      System.out.println("Initial State:"); 
      h1.printStatus();  // Display Initial State
      h1.recursiveTOH();
      System.out.println("Final State:"); 
      h1.printStatus();  // Display Final State
      
      // Test 2: Create an instance of the Hanoi problem for n = 4 
      Hanoi h2 = new Hanoi(4);
      
      // Make a recursive call  
      System.out.println("TEST 2: where n = 4");
      System.out.println("Initial State:");
      h2.printStatus();  // Display Initial State
      h2.recursiveTOH();
      System.out.println("Final State:"); 
      h2.printStatus();  // Display Final State
      
      // Test 3: Create an instance of the Hanoi problem for n = 7 
      Hanoi h3 = new Hanoi(7);
      
      // Make a recursive call  
      System.out.println("TEST 3: where n = 7");
      System.out.println("Initial State:");
      h3.printStatus();  // Display Initial State
      h3.recursiveTOH();
      System.out.println("Final State:"); 
      h3.printStatus();  // Display Final State
   }
}