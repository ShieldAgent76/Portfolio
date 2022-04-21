/*
   TCSS 143
   Author:    Raghavi Sakpal
   Description: Set Demo
*/
import java.util.*;

public class SetDemo {
   public static void main(String[] args) {
      // Declare a Set
      Set<String> progLang = new HashSet<String>();
      
      // Add elements to the Set
      progLang.add("Java");
      progLang.add("Python");
      progLang.add("JavaScript");
      progLang.add("C");
      progLang.add("C++");
      progLang.add("Ada");
      progLang.add("Cobol");
      
      System.out.println("Total number of element in my set:" + progLang.size());
      System.out.println(progLang);
      
      // Method Call
      Set<String> newProgLang = evenLength(progLang);
      System.out.println(newProgLang);
      
      // Method Call
      removeEvenLength(progLang);
      System.out.println(progLang);
      
   }
   
   /*
      Method: Remove string of even length
      Parameter: Set
      Return: None
   */
   public static void removeEvenLength(Set<String> progLangSet) {
      /* NOTE: Throws Concurrent Modification Exception
      // For-each loop to iterate over the Set
      for(String str: progLangSet)  {
         // check the length of the string is even
         if(str.length() % 2 == 0)
            progLangSet.remove(str);
      }
      */
      
      Iterator<String> itr = progLangSet.iterator();
      // Loop through the content of the set
      while(itr.hasNext()) {
         // Read the next element as String
         String str = itr.next();
         
         // check the length of the string is even
         if(str.length() % 2 == 0)
            //progLangSet.remove(str);  Throws exception
            itr.remove();
      }
   }
      
     /*
      Method: Create a new set of strings of even length
      Parameter: Set
      Return: None
   */
   public static Set<String> evenLength(Set<String> progLangSet) {
      Set<String> newSet = new TreeSet<String>();
      
      Iterator<String> itr = progLangSet.iterator();
      // Loop through the content of the set
      while(itr.hasNext()) {
         // Read the next element as String
         String str = itr.next();
         
         // check the length of the string is even
         if(str.length() % 2 == 0)
            newSet.add(str);
      }
      
      return newSet;

   }
}