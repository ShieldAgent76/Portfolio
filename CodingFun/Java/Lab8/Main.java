public class Main {
  
  public static void main( String[] args ) {
    String msgAsString= "KPK FVB RUVD? H ZLJYLA RLF PZ QBZA H UBTILY.";
    int msgLength = msgAsString.length();
    System.out.println( "The length of the plaintext message is: " + msgLength );
    int[] msgAsIntArray = new int[ msgLength ];
    
    System.out.println( charTranslator( ' ' ) );
    System.out.println( charTranslator( 'A' ) );
    System.out.println( charTranslator( 'Z' ) );
    System.out.println( charTranslator( '.' ) );
    System.out.println( charTranslator( '!' ) );
    System.out.println( charTranslator( '?' ) );
    
    // Move each character in the message to the array
    for( int i = 0 ; i < msgLength ; i++ ) {
      char currChar = msgAsString.charAt( i );
      int charAsInt = charTranslator( currChar );
      msgAsIntArray[ i ] = charAsInt;
    }
    
    // Check the work performed
    printIntArray( msgAsIntArray );
    System.out.println();
    printIntArrayAsChars( msgAsIntArray );
    
    System.out.println( );
    
    // Encrypt
    encipherArray( msgAsIntArray );
    printIntArrayAsChars( msgAsIntArray );

    System.out.println( );

    // Decrypt
    encipherArray( msgAsIntArray );
    printIntArrayAsChars( msgAsIntArray );
    
    System.out.println( );
    System.out.println( "Brute forcing the solution..." );
    for( int shift = 0 ; shift < 26 ; shift++ ) {
      if( shift < 10 ) {
        System.out.print( " " );
      }
      System.out.print( shift + " : " );
      printIntArrayAsChars( msgAsIntArray );
      encipherArray(msgAsIntArray);
      System.out.println();
    }
    
    // Allocate an array[26] of arrays[msgLength]
    int[][] solutionArray = new int[26][ msgLength ];
    // Load the ciphertext
    solutionArray[0] = msgAsIntArray;
    // For each of 25 remaining rotations...
    for( int i = 1 ; i < 26 ; i++ ) {

      // Copy the array from the prior solution...
      int[] currSolution = copyArray(solutionArray[i - 1]);

      // And rotate by 1
      encipherArray(currSolution);

      // Then assign to the solution array
      solutionArray[i] = currSolution;
    }
    
    // Check results:
    renderArrayOfArrays(solutionArray);
  }
  
  public static void printIntArrayAsChars( int[] array ) 
    {
    for( int i = 0 ; i < array.length ; i++ ) {
      char currChar = intTranslator(array[i]);
      System.out.print( currChar );
     }
    
  }
  
  // Another helper function to just print an array of ints
  public static void printIntArray( int[] array ) {
    for( int i = 0 ; i < array.length ; i++ ) {
      System.out.print( array[i] + " " );
    }
  }
  
  public static char intTranslator( int input ) {
    // A to Z case
    if( input >= 0 && input <= 25 ) {
      char retChar = (char)(input + 65);
      return retChar;
    }
    // Whitespace case
    else if( input == 26) {
      return ' ';
    }
    // Period case
    else if( input == 27 ) {
      return '.';
    }
    // Exclamation case
    else if( input == 28 ) {
      return '!';
    }
    // Question mark case
    else if( input == 29) {
      return '?';
    }
    // Apostrophe case
    else if( input == 30) {
      return '\'';
    }
    return '*';
  }
  
  public static int charTranslator( char input ) {
    // A to Z case
    if( input >= 'A' && input <= 'Z' ) {
      int retInt = (int)input - 65;
      return retInt;
    }
    // Whitespace case
    else if( input == ' ' ) {
      return 26;
    }
    // Period case
    else if( input == '.' ) {
      return 27;
    }
    // Exclamation case
    else if( input == '!' ) {
      return 28;
    }
    // Question mark case
    else if( input == '?' ) {
      return 29;
    }
    // Apostrophe case
    else if( input == '\'' ) {
      return 30;
    }
    return 9999;
  }
  
  public static int caesarRotate( int input, int distance) {
    // Punctuation case
    if( input >= 26 ) {
      // Don't do anything
      return input;
    }
   else {
      // Perform rotation
      return ((input + 19) % 26);
    }
  }
  
  public static void encipherArray( int[] array ) {
    for( int i = 0 ; i < array.length ; i++ ) {
      array[i] = caesarRotate( array[i], 1 );
    }
  }
  
   public static int[] copyArray( int[] array ) {
    int[] retArray = new int[ array.length ];
    for( int i = 0 ; i < array.length ; i++ ) {
      retArray[i] = array[i];
    }
    return retArray;
  }
  
  public static void renderArrayOfArrays( int[][] array ) {
    for( int i = 0 ; i < array.length ; i++ ) {
      if( i < 10 ) {
        System.out.print( " " );
      }
      System.out.print( i + " : " );
      for( int j = 0 ; j < array[i].length ; j++ ) {
        System.out.print( intTranslator( array[i][j] ) );
      }
      System.out.println();
    }
  }
}