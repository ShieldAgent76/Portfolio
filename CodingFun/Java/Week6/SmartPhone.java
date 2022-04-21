package exercises;

public class SmartPhone implements Radio, GPS {
    
    /* Use Interfaces!
     * The smart phone should implement 2 features Radio, GPS 
     * The radio has 2 functions -to switch on the radio and -switch off the radio
     * The GPS has 3 functions  -to switch on the GPS, -switch off the GPS, -get location
     * You can fill in all these methods with a print statement about the performed functionalities
     * 
     */
    
    /**
     * GPS method to turn it on. 
     */
    @Override
    public void gpsOn() {
        System.out.println("GPS Activiated");
    }
    
    /**
     * GPS method to turn it off. 
     */
    @Override
    public void gpsOff() {
        System.out.println("Entering dormant state");
    }
    
    /**
     * GPS method find location. 
     */
    @Override
    public void gpsLocate() {
        System.out.println("Finding location...");
    }
    
    /**
     * Radio method to turn it on. 
     */
    @Override
    public void radioOn() {
        System.out.println("You're listening to UW Dawg Beats");
    }
    
    /**
     * Radio method to turn it off. 
     */
    @Override
    public void radioOff() {
        System.out.println("Thanks for tuning in");
    }
    
    public static void main(final String[] theArgs) {
        
        final SmartPhone s = new SmartPhone();
        s.gpsOn();
        s.gpsLocate();
        s.gpsOff();
        s.radioOn();
        s.radioOff();
    }
}
