/*
 * TCSS 305
 * 
 * File IO example
 */

package characterstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This demonstrates I/O using character streams.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class BufferedInputOutputStreamExample {

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private BufferedInputOutputStreamExample() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        FileReader reader = null;
        BufferedReader bufferedReader = null;
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {

            // get the current working directory
            final String workingDirectory = System.getProperty("user.dir");
            System.out.println(workingDirectory);

            // use fileseperator which is OS specific "\" for windows and "/" for linux, mac
            System.out.println(File.separator);

            final String resourcesPath = workingDirectory + File.separator + "resources";
            final String inputPath = resourcesPath + File.separator + "inputfile.txt";
            final String outputPath = resourcesPath + File.separator + "outputfile.txt";

            reader = new FileReader(inputPath);
            bufferedReader = new BufferedReader(reader);

            writer = new FileWriter(outputPath);
            bufferedWriter = new BufferedWriter(writer);

            // reads line of data
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
            }

            bufferedReader.close();
            bufferedWriter.close();
            reader.close();
            writer.close();
        } catch (final IOException e) {
            System.out.println(e);
        }

    }

}
