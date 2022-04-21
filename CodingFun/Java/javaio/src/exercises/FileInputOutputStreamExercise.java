/*
 * TCSS 305
 * 
 * File IO example
 */

package exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This demonstrates I/O using byte streams.
 * 
 * @author Martin Lillo
 * @version 1.0
 *
 */
public final class FileInputOutputStreamExercise {

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private FileInputOutputStreamExercise() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        // append characters 'a' to 'z' to the END of outputfile.txt using FileOutputStream
        FileOutputStream out = null;
        
        try {
            
            // get the current working directory
            final String workingDirectory = System.getProperty("user.dir");

            // use file separator 
            System.out.println("File separator for Windows: " + File.separator);

            final String resourcesPath = workingDirectory + File.separator + "resources";
            final String outputPath = resourcesPath + File.separator + "outputfile.txt";

            // print if path is correct
            System.out.println(outputPath);

            // create output stream
            out = new FileOutputStream(outputPath, true);

            // append characters from 'a' to 'z'
            char c;
            for (c = 'a'; c <= 'z'; c++) {

                // writes a byte of data
                out.write(c);
            }

            out.close();
        } catch (final IOException e) {
            System.out.println(e);
        }
    }
}
