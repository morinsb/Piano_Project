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
   private Rectangle Csharp2;
   @FXML
   private Rectangle Eflat2;
   @FXML
   private Rectangle Fsharp2;
   @FXML
   private Rectangle Gsharp2;
  
   @FXML
   private Rectangle Bflat2;
   @FXML
   private Rectangle Csharp3;
   @FXML
   private Rectangle Eflat3;
   @FXML
   private Rectangle Fsharp3;
   @FXML
   private Rectangle Gsharp3;
 
   @FXML
   private Rectangle Bflat3;

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
    public void playC3(MouseEvent event){
        playSound("c3.wav"); 
    }
    public void playA1(MouseEvent event){
        playSound("a1.wav"); 
    }
    public void playA1s(MouseEvent event){
        playSound("a1s.wav"); 
    }
    public void playB1(MouseEvent event){
        playSound("b1.wav"); 
    }
    public void playC1S(MouseEvent event){
        playSound("c1s.wav"); 
    }
     public void playC2(MouseEvent event){
        playSound("c2.wav"); 
    }
     public void playD1(MouseEvent event){
        playSound("d1.wav"); 
    }
     public void playD1S(MouseEvent event){
        playSound("d1s.wav"); 
    }
     public void playE1(MouseEvent event){
        playSound("e1.wav"); 
    }
   public void playF1(MouseEvent event){
        playSound("f1.wav"); 
    }
   public void playF1S(MouseEvent event){
        playSound("f1s.wav"); 
    }
   public void playG1(MouseEvent event){
        playSound("g1.wav"); 
    }
   public void playG1S(MouseEvent event){
        playSound("g1s.wav"); 
    }
   
   
   
   
   
   
   
   
    
}

