/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author mdsjo
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // TODO Auto-generated method stub  
        //Initialising path of the media file, replace this with your file path   
        String path = "\\\\192.168.56.1\\teste\\akiyo.mp4";

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
        Scene scene = new Scene(root,500,400);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Playing video");  
        primaryStage.show();  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   
    
}
