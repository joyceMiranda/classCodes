
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author mdsjo
 */
public class RunTeste extends javax.swing.JFrame {

    //Initialising path of the media file, replace this with your file path   
    static String path = "\\\\192.168.56.1\\teste\\akiyo.mp4";

    /**
     * Creates new form TesteFrame
     */
    public RunTeste() {
        
        final JFXPanel fxPanel = new JFXPanel();
        final JButton btn = new JButton("Show Video");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        initFX(fxPanel);
                    }
               });
            }
        });
        
        
        JPanel panel = new JPanel(new GridLayout(1, 1));
 
        panel.add(btn);
        panel.add(fxPanel);
        add(panel);
        setSize(720, 340);
        setTitle("Swing and JavaFX");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

       
       
    }
    
    private static void initFX(JFXPanel fxPanel) {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private static Scene createScene() {
        // TODO Auto-generated method stub  
       
        //Instantiating Media class  
        Media media = new Media(new File(path).toURI().toString());

        //Instantiating MediaPlayer class   
        MediaPlayer mediaPlayer = new MediaPlayer(media);  
          
        //Instantiating MediaView class   
        MediaView mediaView = new MediaView(mediaPlayer);  
          
        //by setting this property to true, the Video will be played   
        mediaPlayer.setAutoPlay(true);  
          
        //setting group and scene   
        Group root = new Group();  
        root.getChildren().add(mediaView);  
        Scene scene = new Scene(root);  


        return (scene);

    }
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RunTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
