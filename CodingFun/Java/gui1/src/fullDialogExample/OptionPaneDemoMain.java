/*
 * TCSS 305 demonstration code
 */

package fullDialogExample;

/**
 * A demonstration of JOptionPane dialogs.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @version Autumn 2014
 */
public final class OptionPaneDemoMain {

    /**
     * Private constructor to inhibit external instantiation.
     */
    private OptionPaneDemoMain() {
        // do nothing
    }

    /**
     * Shows various option pane types to demonstrate their use.
     * 
     * @param theArgs command line parameters - ignored in this program
     */
    public static void main(final String[] theArgs) {

        final OptionPaneDemo demo = new OptionPaneDemo();

        // demo.demoMessageDialogs();
        // demo.demoConfirmationDialogs();
        // demo.demoOptionDialogs();
        demo.demoInputDialog();
    }

}
