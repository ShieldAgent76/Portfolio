/*
 * TCSS 305
 */

package fullDialogExample;

import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Demonstrates the use of several types of JOptionPane dialogs.
 * 
 * @author Alan Fowler (acfowler@u.washington.edu)
 * @version Autumn 2014
 */
public final class OptionPaneDemo {

    /**
     * A UWT icon from an image file.
     */
    private static final Icon UWT = new ImageIcon("uwt.gif");

    /**
     * A smiley face icon from an image file.
     */
    private static final Icon SMILE = new ImageIcon("smile.jpg");

    /**
     * A frowny face icon from an image file.
     */
    private static final Icon FROWN = new ImageIcon("frown.jpg");

    /**
     * A smiley face waving goodbye icon from an image file.
     */
    private static final Icon BYE = new ImageIcon("bye.jpg");

    /**
     * The lower limit for the guessing game.
     */
    private static final int LOWER_LIMIT = 1;

    /**
     * The upper limit for the guessing game.
     */
    private static final int UPPER_LIMIT = 10;

    /**
     * Demonstrates the use of different types of message dialogs.
     */
    public void demoMessageDialogs() {
        // the simplest message dialog
        JOptionPane.showMessageDialog(null, "Hello, world!");

        // a message dialog with additional parameters
        JOptionPane.showMessageDialog(null, "Hello again!", "A Message with a Custom Title",
                                      JOptionPane.WARNING_MESSAGE);

        // a message dialog with an icon
        JOptionPane.showMessageDialog(null, "Hello, are you still watching this?",
                                      "A Message with an Icon", JOptionPane.PLAIN_MESSAGE,
                                      UWT);

    }

    /**
     * Demonstrates the use of different types of message dialogs.
     */
    // https://www.tutorialspoint.com/swing/swing_joptionpane.htm
    public void demoConfirmationDialogs() {
        // a confirmation dialog
        int response;
        do {
            response = JOptionPane.showConfirmDialog(null, "Is today Wednesday?");
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "You selected YES", "Yes was selected",
                                              JOptionPane.PLAIN_MESSAGE, SMILE);
            } else if (response == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "You selected NO", "No was selected",
                                              JOptionPane.PLAIN_MESSAGE, FROWN);
            } else {
                JOptionPane.showMessageDialog(null, "You selected CANCEL",
                                              "Cancel was selected", JOptionPane.PLAIN_MESSAGE,
                                              BYE);
            }
        }
        while (response != JOptionPane.CANCEL_OPTION);

        // a confirmation dialog with custom options
        JOptionPane.showConfirmDialog(null, "Are JOptionPanes fun?", "Having fun yet?",
                                      JOptionPane.YES_NO_OPTION);
    }

    /**
     * Demonstrates the use of an Option dialog.
     */
    public void demoOptionDialogs() {
        // an option dialog
        final Object[] options = { "Definitely!", "No way man!", "Not Sure" };
        JOptionPane.showOptionDialog(null, "Are you ready for GUI programming?",
                                     "Ready for GUI?", JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.QUESTION_MESSAGE, SMILE, options, options[0]);
    }

    /**
     * Demonstrates the use of an Input dialog.
     */
    public void demoInputDialog() {

        // a guessing game using an input dialog
        boolean readyToQuit = false;

        while (!readyToQuit) {
            // a number between lower_limit and upper_limit
            final int numberToGuess =
                            new Random().nextInt(UPPER_LIMIT - LOWER_LIMIT + 1) + LOWER_LIMIT;

            int guess = -1;
            int count = 0;
            while (guess != numberToGuess) {
                count++;
                final String guessString = JOptionPane
                                .showInputDialog(null, "Enter a number between 1 and 10",
                                                 "Guess my Number");
                try {
                    guess = Integer.parseInt(guessString);
                    if (guess < numberToGuess) {
                        JOptionPane.showMessageDialog(null,
                                                      "Your guess was too low, try a higher number.",
                                                      "Too Low!", JOptionPane.WARNING_MESSAGE,
                                                      FROWN);
                    } else if (guess > numberToGuess) {
                        JOptionPane.showMessageDialog(null,
                                                      "Your guess was too high, try a lower number.",
                                                      "Too High!", JOptionPane.WARNING_MESSAGE,
                                                      FROWN);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                                      "You guessed the correct number in "
                                                            + count + " guesses.",
                                                      "Congratulations!",
                                                      JOptionPane.INFORMATION_MESSAGE, SMILE);
                    }
                } catch (final NumberFormatException e) {
                    if (guessString == null) { // user entered 'Cancel'
                        break;
                    }
                    JOptionPane.showMessageDialog(null,
                                                  "You must enter an integer, please try again.",
                                                  "Input error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            final int response = JOptionPane
                            .showConfirmDialog(null, "Would you like to play again?",
                                               "Play Again?", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                readyToQuit = true;
            }
        }
    }

}
