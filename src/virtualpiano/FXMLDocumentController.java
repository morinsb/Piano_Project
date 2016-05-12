/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author csstudent
 */
public class FXMLDocumentController implements Initializable {
    //white keys    
   @FXML
    private Rectangle C2;
   @FXML
    private Rectangle D2;
   @FXML
   private Rectangle E2;
   @FXML
   private Rectangle F2;
   @FXML
   private Rectangle G2;
   @FXML
   private Rectangle A2;
   @FXML
   private Rectangle B2;
   @FXML
   private Rectangle D3;
   @FXML
   private Rectangle E3;
   @FXML
   private Rectangle F3;
   @FXML
   private Rectangle G3;
   @FXML
   private Rectangle A3;
   @FXML
   private Rectangle B3;
   @FXML
   private Rectangle C3;
   
   //Black keys 
   @FXML
   private Rectangle C2s;
   @FXML
   private Rectangle D2s;
   @FXML
   private Rectangle F2s;
   @FXML
   private Rectangle G2s;
   @FXML
   private Rectangle B2f;
   @FXML
   private Rectangle C3s;
   @FXML
   private Rectangle D3s;
   @FXML
   private Rectangle F3s;
   @FXML
   private Rectangle G3s;
   @FXML
   private Rectangle B3f;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    //method to play the piano notes
    public void playSound(String filename){
       URL sound = getClass().getResource("pianoNotes/" + filename);
       AudioClip play = new AudioClip(sound.toString());
       play.play();
       
    }
    public void playC2(MouseEvent event){
        playSound("c2.wav"); 
    }
    public void playC2s(MouseEvent event){
        playSound("c2s.wav"); 
    }
    public void playD2(MouseEvent event){
        playSound("d2.wav"); 
    }
    public void playD2s(MouseEvent event){
        playSound("d2s.wav"); 
    }
    public void playE2(MouseEvent event){
        playSound("e2.wav"); 
    }
    public void playF2(MouseEvent event){
        playSound("f2.wav"); 
    }
    public void playF2s(MouseEvent event){
        playSound("f2s.wav"); 
    }
    public void playG2(MouseEvent event){
        playSound("g2.wav"); 
    }
    public void playG2s(MouseEvent event){
        playSound("g2s.wav"); 
    }
    public void playA2(MouseEvent event){
        playSound("a2.wav"); 
    }
    public void playB2f(MouseEvent event){
        playSound("b2f.wav"); 
    }
    public void playB2(MouseEvent event){
        playSound("b2.wav"); 
    }
    public void playC3(MouseEvent event){
        playSound("c3.wav"); 
    }
    
    
     
     
     
    
   
   
   
   
   
   
   
   
    
}

