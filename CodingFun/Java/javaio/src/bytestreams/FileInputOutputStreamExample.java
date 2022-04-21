/*
 * TCSS 305
 * 
 * File IO example
 */

package bytestreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This demonstrates I/O using byte streams.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class FileInputOutputStreamExample {

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private FileInputOutputStreamExample() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            // get the current working directory
            final String workingDirectory = System.getProperty("user.dir");
            System.out.println(workingDirectory);

            // use fileseperator which is OS specific "\" for windows and "/" for linux, mac
            System.out.println(File.separator);

            final String resourcesPath = workingDirectory + File.separator + "resources";
            final String inputPath = resourcesPath + File.separator + "inputfile.txt";
           final String outputPath = resourcesPath + File.separator + "outputfile.txt";
//
           System.out.println(inputPath);
           System.out.println(outputPath);
//
//            // create input and output streams
            in = new FileInputStream(inputPath);
            out = new FileOutputStream(outputPath);

            // reads a byte of data from the input stream
            int c;
            while ((c = in.read()) != -1) {

                // writes a byte of data
                out.write(c);
            }

            in.close();
            out.close();
        } catch (final IOException e) {
            System.out.println(e);
        }

    }

}
