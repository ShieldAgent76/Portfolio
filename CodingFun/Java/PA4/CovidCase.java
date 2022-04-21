/*
Martin Lillo
TCSS 143
CovidCase Class
*/


public class CovidCase implements Comparable<CovidCase> {
   
   // class fields
   private String country;
   private long totalCases;
   private long totalDeaths;
   private double deathToCaseRatio;
   
   // class constructor
   public CovidCase(String country, long totalCases, long totalDeaths, double deathToCaseRatio) {
      
      this.country = country;
      this.totalCases = totalCases;
      this.totalDeaths = totalDeaths;
      this.deathToCaseRatio = deathToCaseRatio;
   }
   
   // getter methods
   public String getCountry() {
      return country;
   }
   
   public long getCases() {
      return totalCases;
   }
   
   public long getDeaths() {
      return totalDeaths;
   }
   
   public double getRatio() {
      return deathToCaseRatio;
   }
   
   // default compareTo method
   public int compareTo(CovidCase defaultCase) { 
      return 0;
   }
   
   // compareTo methods based on their parameters
   public int compareToCountry(CovidCase countryAffected) {
      return country.compareTo(countryAffected.country);
   }
   // extra methods in case of using comparable
   /*
   public int compareToCases(CovidCase covidCases) {
      return (int)(totalCases - covidCases.totalCases);
   }
   
   public int compareToDeaths(CovidCase covidDeaths) {
      return (int)(totalDeaths - covidDeaths.totalDeaths);
   }
   
   public int compareToRatio(CovidCase covidRatio) {
      return (int)(deathToCaseRatio - covidRatio.deathToCaseRatio);
   }
   */
}