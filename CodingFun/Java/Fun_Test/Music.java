import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Martin Lillo
 */
public class Music
{
    public static void main(String[] args)
    {
        String bip = "TACACHO - Black Swan (feat. Philip Strand).mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
}
