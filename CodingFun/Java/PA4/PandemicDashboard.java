/*
Martin Lillo
TCSS 143
PandemicDashboard Class
*/
import java.io.*;
import java.util.*;

public class PandemicDashboard {
   
   // read from file, create instance of CovidCase, add to list
   public static List<CovidCase> caseList(String full_data) {
      
      // method fields 
      Scanner scanFile;  
      
      LinkedList<CovidCase> cases = new LinkedList<CovidCase>();
      
      // reading from the file and executing it
      try {
         scanFile = new Scanner(new File(full_data));
         
         while (scanFile.hasNext()) {
            
            String token = scanFile.nextLine();
            String[] covidArray = token.split(",");
            if (covidArray[0].equals("11/19/2020") && !(covidArray[1].equals("World"))) {
            
               String date = covidArray[0];
               String location = covidArray[1];
               long totalCases = Long.parseLong(covidArray[4]);
               long totalDeaths = 0;
               if (!covidArray[5].equals("")) {
                  totalDeaths = Long.parseLong(covidArray[5]);
               }
               double mortality = ((double)totalCases/totalDeaths);
               CovidCase report = new CovidCase(location, totalCases, totalDeaths, mortality);
               cases.add(report);
            }
            System.out.println("File read successful. The program is a go.");
         }
      }
      catch (FileNotFoundException ex) {
         System.out.println("Error. File not found");
         System.exit(0);
      }
      return cases;
   }
   
   // format case list to print appropriately
   public static void displayCases(List<CovidCase> caseList, int inputChoice) {
     if (inputChoice == 1 || inputChoice == 2 || inputChoice == 3) {                                          
         String n1 = "COUNTRY";
         String n2 = "TOTAL CASES";
         String n3 = "TOTAL DEATHS";
         System.out.printf("%-36s%-21s%-12s%n", n1, n2, n3);                                             
         System.out.println("______________________________________________________________________");   
         if (inputChoice == 1){
           	for (int i = 0; i <= caseList.size()-2; i++) {
           		for (int j = 1; j <= caseList.size()-1; j++) {
           			caseList.get(i).compareTo(caseList.get(j));
           		}
           	}
         } 
         else if (inputChoice == 2) {
            Collections.sort(caseList, new DeathsComparator());  
         } 
         else {
            Collections.sort(caseList, new CasesComparator());   
         }
         for (int i = 0; i <= caseList.size() - 1; i++) {
            long cases = caseList.get(i).getCases();                 
            long deaths = caseList.get(i).getDeaths();              
            String country = caseList.get(i).getCountry();           
            System.out.printf("%-36s%-21d%-12d%n", country, cases, deaths);   
         }
      }
      
      if (inputChoice == 4 || inputChoice == 5) {
         if (inputChoice == 4) {
            System.out.println("Countries with Minimum Deaths: ");
            ArrayList<CovidCase> min = getMinDeaths(caseList);	  
            for(int i = 0; i <= min.size() - 1; i++){
               System.out.println("Country: " + min.get(i).getCountry());
               System.out.println("Total Cases: " + min.get(i).getCases());
               System.out.println("Total Deaths: " + min.get(i).getDeaths()); 
            }
            System.out.println("Countries with Maximum Deaths: ");
            ArrayList<CovidCase> max = getMaxDeaths(caseList);
            for (int i = 0; i <= max.size() - 1; i++) {
               System.out.println("Country: " + max.get(i).getCountry());
               System.out.println("Total Cases: " + max.get(i).getCases());
               System.out.println("Total Deaths: " + max.get(i).getDeaths());
            }
         }
         if (inputChoice == 5) {
            System.out.println("Countries with Minimum Cases: ");
            ArrayList<CovidCase> min = getMinCases(caseList);	  
            for(int i = 0; i <= min.size() - 1; i++){
               System.out.println("Country: " + min.get(i).getCountry());
               System.out.println("Total Cases: " + min.get(i).getCases());
               System.out.println("Total Deaths: " + min.get(i).getDeaths());
            }
            System.out.println("Countries with Maximum Cases: ");
            ArrayList<CovidCase> max = getMaxCases(caseList);
            for (int i = 0; i <= max.size() - 1; i++) {
               System.out.println("Country: " + max.get(i).getCountry());
               System.out.println("Total Cases: " + max.get(i).getCases());
               System.out.println("Total Deaths: " + max.get(i).getDeaths());
            }
         }
      }
        
      if (inputChoice == 6) {
         System.out.println("Enter a country name");
         Scanner name = new Scanner(System.in);
         String search = name.nextLine();
         for(int i = 0; i <= caseList.size()-2; i++) {
     		   for(int j = 1; j <= caseList.size()-1; j++) {
     		   	caseList.get(i).compareTo(caseList.get(j));
     		   }
     	   }
         int index = binarySearch(caseList, search);  
         String country = caseList.get(index).getCountry();
         long cases = caseList.get(index).getCases();
         long deaths = caseList.get(index).getDeaths();
         double rate = caseList.get(index).getRatio();
         System.out.print(country + "\n" + "Covid Case Data" + "\n" + "Country: " + country + "\n" + "Total Cases: " + cases + "\n" + "Total Deaths: " + deaths + "\n\n" + "Morality Rate: ");
         String mortality = String.format("%3.2f", rate);
         System.out.print(mortality + "%" + "\n");         
      }
      if (inputChoice == 7) {         
         Collections.sort(caseList, new MortalityComparator());                                            
         String n1 = "COUNTRY";
         String n2 = "TOTAL CASES";
         String n3 = "TOTAL DEATHS";
         String n4 = "MORTALITY";
         System.out.printf("%-21s%-21s%-21s%-10s%n", n1, n2, n3,n4);                                       
         System.out.println("________________________________________________________________________");   
         for(int i = 0; i < 10; i++){                                   
            long cases = caseList.get(i).getCases();                     
            long deaths = caseList.get(i).getDeaths();                 
            String country = caseList.get(i).getCountry();              
            double mortality = caseList.get(i).getRatio();   
            System.out.printf("%-21s%-21d%-21d%-5.2f", country, cases, deaths, mortality);   
            System.out.print("%" + "\n");
         }         
      }
   }
   
   // dashboard panel method
   public static void displayDashboard() {
            
      System.out.println("Covid Pandemic Dashboard");
      System.out.println("------------------------");
      System.out.println();
      System.out.println("What do you want to do?");
      System.out.println("-----------------------");
      System.out.println("1) Display the country's covid cases"); // print the country's cases
      System.out.println("2) Display Total Deaths"); // add up all deaths for each countries and print from highest to lowest
      System.out.println("3) Display Total Cases"); // add up all cases for each countries and print from highest to lowest
      System.out.println("4) Display Min and Max of Total Deaths"); // display min and max death of each country
      System.out.println("5) Display Min and Max of Total Cases"); // display min and max cases of each country
      System.out.println("6) Search for a Country's Mortality Rate (Death/Case)"); // display a country's mortality rate
      System.out.println("7) Display Top 10 Country's Mortality Rate"); // display 10 countries mortality rate from highest to lowest
      System.out.println("8) Exit Program"); // exit program
   }
   
   // main method
   public static void main(String[] args) {
      /*
      Scanner input = new Scanner(System.in);
      
      
      displayDashboard();
      int choice = input.nextInt();
      if (choice >= 1 || choice <= 8) {
         caseList("full_data.csv");
         displayCases(cases, choice); // somehow the displayCases is not accepting the cases list
      }
      else {  
         System.out.println("Error. Invalid input");
      }
      // switch loop to choose between different displays of formated data
      
      do {
                  
         int choice = input.nextInt();
         switch (choice) {
            case 1:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 2:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 3:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 4:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 5:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 6:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 7:
               caseList("full_data.csv");
               displayCases(cases, choice);
               displayDashboard();
               break;
            case 8:
               System.out.println("Thank you very much! Have a nice day!");
               System.out.println("Stay Healthy and Be Safe!");
               System.exit(0);
            default:
               System.out.println("Error. Invalid choice");
               displayDashboard();
               break;
         }
      } while (true);
      */
   }

   // min deaths method
   public static ArrayList<CovidCase> getMinDeaths(List<CovidCase> caseList){
      long min = 10000;
      ArrayList<CovidCase> ret = new ArrayList<CovidCase>();
      for (int i = 0; i <= caseList.size() - 1; i++) {
         long test = caseList.get(i).getDeaths();
         if(min > test){
            min = test;
         }
      }
      for (int i = 0; i < caseList.size() - 1; i++) {
         if(caseList.get(i).getDeaths() == min) {
            ret.add(caseList.get(i));
         }
      }
      return ret;
   }

   // max deaths method
   public static ArrayList<CovidCase> getMaxDeaths(List<CovidCase> caseList){
      long max = 0;
      ArrayList<CovidCase> ret = new ArrayList<CovidCase>();
      for(int i = 0; i <= caseList.size() - 1; i++){
         long test = caseList.get(i).getDeaths();
         if(max < test){
            max = test;
         }
      }
      for(int i = 0; i <= caseList.size() - 1; i++){
         if(caseList.get(i).getDeaths() == max){
            ret.add(caseList.get(i));
         }
      }
      return ret;
   }

   // min cases method
   public static ArrayList<CovidCase> getMinCases(List<CovidCase> fList){
      long min = 10000;
      ArrayList<CovidCase> ret = new ArrayList<CovidCase>();
      for(int i = 0; i <= fList.size() - 1; i++){
         long test = fList.get(i).getCases();
         if(min > test){
            min = test;
         }
      }
      for(int i = 0; i <= fList.size() - 1; i++){
         if(fList.get(i).getCases() == min){
            ret.add(fList.get(i));
         }
      }
      return ret;
   }

   // min cases method
    public static ArrayList<CovidCase> getMaxCases(List<CovidCase> fList){
      long max = 0;
      ArrayList<CovidCase> ret = new ArrayList<CovidCase>();
      for(int i = 0; i <= fList.size() - 1; i++){
         long test = fList.get(i).getCases();
         if(max < test){
            max = test;
         }
      }
      for(int i = 0; i <= fList.size() - 1; i++){
         if(fList.get(i).getCases() == max){
            ret.add(fList.get(i));
         }
      }
      return ret;
   }
   
  
   // custom binarySearch method
   public static int binarySearch(List<CovidCase> coL, String name){
      int min = 0;                                          
      int max = coL.size() - 1;                             
      while(min <= max){
         int mid = (min + max) / 2;                         
         int result = name.compareTo(coL.get(mid).getCountry());             
         if(result > 0){                                    
            min = mid + 1;                                  
         } else if(result < 0){                             
            max = mid - 1;                                  
         } else {
            return mid;                                     
         }
      }
      return -1;                                         
   }
}

// deaths comparator
class DeathsComparator implements Comparator<CovidCase>{
   public int compare(CovidCase o1, CovidCase o2){
      if(o1.getDeaths() < o2.getDeaths()){
         return 1;
      }else if(o1.getDeaths() > o2.getDeaths()){
         return -1;
      }else{
         return 0;
      }
   }
}
   
// cases comparator
class CasesComparator implements Comparator<CovidCase>{
   public int compare(CovidCase o1, CovidCase o2){
      if(o1.getCases() < o2.getCases()){
         return 1;
      }else if(o1.getCases() > o2.getCases()){
         return -1;
      }else{
         return 0;
      }
   }
}


// mortality rate comparator
class MortalityComparator implements Comparator<CovidCase>{
   public int compare(CovidCase o1, CovidCase o2){
      if(o1.getRatio() < o2.getRatio()){
         return 1;
      }else if(o1.getRatio() > o2.getRatio()){
         return -1;
      }else{
         return 0;
      }
   }
}
