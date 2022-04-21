
import java.util.Scanner;  // For the Scanner class
import java.io.File;                  // For file operations
import java.io.FileNotFoundException; // For file exception
import java.io.IOException;    // For buffered writer
import java.io.BufferedWriter; // For buffered writing
import java.io.FileWriter;     // For buffered writing

public class Main {

    //-------|---------|---------|---------|
    // GLOBAL VARIABLES
    //-------|---------|---------|---------|
    
      public static final boolean DEBUG = true;
    
    //-------|---------|---------|---------|---------|---------|---------|---------|
    // PROGRAM DRIVER
    //-------|---------|---------|---------|---------|---------|---------|---------|

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object

    //-------|---------|---------|---------|
    // STEP 1 - ACCEPT FILENAME
    //-------|---------|---------|---------|

    System.out.println( "Enter a target filename to open: " );
    String filename = "";
    if( !DEBUG ) {
      filename = input.next(); // Skip for testing  
    }
    else if( DEBUG ) {
      filename = "freefall.csv";
    }
    
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
      System.out.println( "  Path         : " + f.getPath()         );
      System.out.println( "  Absolute path: " + f.getAbsolutePath() );
      System.out.println( "  Parent       : " + f.getParent()       );
      System.out.println( "  Exists       : " + f.exists()          );
      if( f.exists() ) {
        System.out.println();
        System.out.println( "File exists. Checking file states:" );
        System.out.println( "  Is writeable      : " + f.canWrite()    ); 
        System.out.println( "  Is readable       : " + f.canRead()     ); 
        System.out.println( "  Is a directory    : " + f.isDirectory() ); 
        System.out.println( "  File Size in bytes: " + f.length()      );
        System.out.println();
        System.out.println( "Printing file object:" );
        System.out.println( f );
      }
    }
    
    
    //-------|---------|---------|---------|
    // STEP 3 - LOAD FILE OBJECT TO A SCANNER
    //-------|---------|---------|---------|
    Scanner fileReader = null; // Declare outside of try-catch block
    try {
      fileReader = new Scanner( f );
      if( DEBUG ) {
        System.out.print( fileReader );
      }
    }
    catch( FileNotFoundException e ) {
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
    // STEP 5 - READ SCANNER TO ACQUIRE LINECOUNT
    //-------|---------|---------|---------|
    System.out.println();

    // Reset scanner by assigning a new scanner object from the file
    try {
      fileReader = new Scanner( f );
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    String currLine = "";
    int lineCount = 0;
    while( fileReader.hasNextLine() ) {
      // Ingest the next line from the Scanner
      currLine = fileReader.nextLine();
      // Count the line
      lineCount++;
      // Report the count and line contents
      System.out.println( lineCount + " : " + currLine );
    }

    // Report the number of lines identified
    System.out.println( "Linecount == " + lineCount );

    
    //-------|---------|---------|---------|
    // STEP 6 - ALLOCATE ARRAYS BASED ON LINECOUNT
    //-------|---------|---------|---------|
    // Declarations
    int[]   timeArray;
    float[] velocityArray;
    
    // Allocation / Assignment
    timeArray     = new int[(lineCount - 1)];
    velocityArray = new float[(lineCount - 1)];
    
    
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
      currVelocity = lineReader.nextFloat();
      
      // Assign acquired values to the correct arrays
      timeArray[currIndex] = currTime;
      velocityArray[currIndex] = currVelocity;

      // Advance the current index by 1
      currIndex++;
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
        String line = "" + timeArray + ", " + velocityArray + "";
        writer.write(line);
      }
      writer.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }

  }
}
