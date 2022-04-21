
//-------|---------|---------|---------|
// IMPORTS
//-------|---------|---------|---------|

import java.util.Scanner;             // For file read
import java.io.File;                  // For file operations
import java.io.FileNotFoundException; // For file exception

public class Main {

        //-------|---------|---------|---------|
        // GLOBAL VARIABLES
        //-------|---------|---------|---------|
        
          public static final boolean DEBUG = true;
        
        //-------|---------|---------|---------|---------|---------|---------|---------|
        // PROGRAM DRIVER
        //-------|---------|---------|---------|---------|---------|---------|---------|
    
      public static void main(String[] args) {
    
        //-------|---------|---------|---------|
        // STEP 1 - SET FILENAME
        //-------|---------|---------|---------|
    
        String filename = "maths.txt";
        
        // Check result
        if( DEBUG ) {
          System.out.println( "Filename: '" + filename + "'" );
        }
    
        //-------|---------|---------|---------|
        // STEP 2 - OPEN TARGET FILE
        //-------|---------|---------|---------|
    
        // Do work for this code section
        File f = new File( filename );
    
        if( DEBUG ) {
          System.out.println( "Checking file open operation:" );
          System.out.println( "  File name    : " + f.getName()         );
          System.out.println( "  Exists       : " + f.exists()          );
          if( f.exists() ) {
            System.out.println();
            System.out.println( "File exists. Checking file states:" );
            System.out.println( "  Is writeable      : " + f.canWrite()    ); 
            System.out.println( "  Is readable       : " + f.canRead()     );
            System.out.println( "  File Size in bytes: " + f.length()      );
            System.out.println();
            System.out.println( "Printing file object:" );
            System.out.println( f );
            System.out.println();
          }
        }
        
        //-------|---------|---------|---------|
        // STEP 3 - LOAD FILE OBJECT TO A SCANNER
        //-------|---------|---------|---------|
            Scanner fileReader = null;
        try {
          fileReader = new Scanner( f );
          if( DEBUG ) {
            System.out.print( fileReader );
          }
        }
        catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        
        //-------|---------|---------|---------|
        // STEP 4 - READ SCANNER, TOKEN-BY-TOKEN
        //-------|---------|---------|---------|
            String currToken = "";
        while( fileReader.hasNext() ) {
          currToken = fileReader.next();
          System.out.print( currToken );
        }
    
        //-------|---------|---------|---------|
        // STEP 5 - READ SCANNER, LINE-BY-LINE
        //-------|---------|---------|---------|
            System.out.println();
    
        // Reset by assigning a new scanner object constructed from f
        try {
          fileReader = new Scanner( f );
        }
        catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        
        String currLine = "";
        while( fileReader.hasNextLine() ) {
          currLine = fileReader.nextLine();
          System.out.println( currLine );
        }
        
        
        //-------|---------|---------|---------|
        // STEP 6 - ALLOCATE ARRAYS BASED ON LINECOUNT
        //-------|---------|---------|---------|
        // Declarations
        int[]   timeArray;
        float[] velocityArray;
        
        // Allocation / Assignment
        timeArray     = currLine;
        velocityArray = currLine;
        
        
        //-------|---------|---------|---------|
        // STEP 7 - RELOAD SCANNER WITH FILE
        //-------|---------|---------|---------|
        try {
          fileReader = new Scanner( f );
        }
        catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        
        //-------|---------|---------|---------|
        // STEP 8 - READ SCANNER LINE BY LINE AND LOAD THE ARRAYS
        //-------|---------|---------|---------|    
        int currTime;
        float currVelocity;
        int currIndex = 0;
    
        // Strip the header off the scanner
        String header = fileReader.nextLine();
    
        // While there is data after the header to read...
        while( fileReader.hasNextLine() ) {
          // Pull the next line of data
          currLine = fileReader.nextLine();
    
          // Load the current line to a different scanner
          Scanner lineReader = new Scanner(currLine);
    
          // Change the lineReader's delimiter to a ','
          lineReader.useDelimiter(",");
          
          // Acquire the int and float corresponding to time and velocity
          currTime = lineReader.nextInt();
          currVelocity = lineReader.nextInt();
    
          // Assign acquired values to the correct arrays
          timeArray[currLine] = currTime;
          velocityArray[currLine] = currVelocity;
    
          // Advance the current index by 1
          currLine++;
        }
        
        
        //-------|---------|---------|---------|
        // STEP 9 - VALIDATE WORK
        //-------|---------|---------|---------|      
            System.out.println();
            System.out.println( "Array States: " );
            for( int i = 0; i < timeArray.length; i++ ) {
              System.out.println( "  " + timeArray[i] + " : " + velocityArray[i] );
            }
            
        //-------|---------|---------|---------|
        // STEP 10 - SAVE TO A DIFFERENT .CSV
        //-------|---------|---------|---------|      
            FileWriter fw = null;
            BufferedWriter writer = null;
            try {
              fw = new FileWriter( "output.csv" );
              writer = new BufferedWriter( fw );
              writer.write("Time,Velocity\n");
              for( int i = 0; i < timeArray.length; i++ ) {
                String line = "" + timeArray[i] + "," + velocityArray[i] + "\n";
                writer.write(line);
              }
              writer.close();
            }
            catch (IOException e) {
              e.printStackTrace();
            }

      } // Closing main()

} // Closing class Main()
