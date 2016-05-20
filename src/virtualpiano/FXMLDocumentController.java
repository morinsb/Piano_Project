/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ArrayList;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.FillTransition;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Sam Morin, Delnaz Patel, Emma Rafkin, Mia Waggoner
 */
public class FXMLDocumentController implements Initializable {
    //record button
    @FXML
    private ToggleButton rec;
    //play buttons
    @FXML
    private Button play;
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
   
   
   @FXML
   private MenuBar menu;
   
   
   @FXML
   private Menu file;
   
   
   @FXML
   private Menu help;
   
   @FXML
   private MenuItem quit;
   
   @FXML
   private MenuItem about;
   
   @FXML
   private Menu preferences;
   
   @FXML
   private MenuItem skins;

 
   //DO NOT DELETE THIS
   //system.currentTimeMillis
   @FXML
   private Rectangle C2g;
   @FXML
   private Rectangle D2g;
   @FXML
   private Rectangle E2g;
   @FXML
   private Rectangle F2g;
   @FXML
   private Rectangle G2g;
   @FXML
   private Rectangle A2g;
   @FXML
   private Rectangle B2g;
   @FXML
   private Rectangle C3g;
   @FXML
   private Rectangle D3g;
   @FXML
   private Rectangle E3g;
   @FXML
   private Rectangle F3g;
   @FXML
   private Rectangle G3g;
   @FXML
   private Rectangle A3g;
   @FXML
   private Rectangle B3g;
   @FXML
   private Rectangle C2sg;
   @FXML
   private Rectangle D2sg;
   @FXML
   private Rectangle F2sg;
   @FXML
   private Rectangle G2sg;
   @FXML
   private Rectangle B2fg;
   @FXML
   private Rectangle C3sg;
   @FXML
   private Rectangle D3sg;
   @FXML
   private Rectangle F3sg;
   @FXML
   private Rectangle G3sg;
   @FXML
   private Rectangle B3fg;
   
   private long startTime;
   private long elapsedTime;
   private ArrayList<RecordedNote> rec1 = new ArrayList<RecordedNote>();
   private boolean isRecording = false;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    //method to start recording
    public void record(MouseEvent event){
       if(isRecording == false){
           rec1.clear();
           startTime = System.currentTimeMillis();
           isRecording = true;
           
       } else {
           isRecording = false;
           elapsedTime = startTime - System.currentTimeMillis();
       }   
    }
    //method to play recording
    public void playRec(){
        startTime = System.currentTimeMillis();
        //check time alignment
        for (int i = 0; i < rec1.size(); i++){
            playSound(rec1.get(i).getFile(), rec1.get(i).getRec());
            if(i + 1 <= rec1.size()){
                try{
                    //Thread.sleep(rec1.get(i+1).getTime()-rec1.get(i).getTime());
                    Thread.sleep(250);
                } catch(InterruptedException e){   
                    
                }
            }
        }
    }
    //method to play the piano notes
    
     
    
    public void changeSkin(ActionEvent event){
        
    
    }
   
    
    public void showKeyPlayed(Rectangle rec){
        //rec is the original key, not the hidden key
     Paint temp = rec.getFill();
     FillTransition ft = new FillTransition(Duration.millis(250), rec, (Color) temp, Color.GRAY);
     ft.setCycleCount(1);
     ft.setAutoReverse(true);
     ft.play();
     FillTransition ft1 = new FillTransition(Duration.millis(250), rec, Color.GRAY, (Color)temp);
     ft1.setCycleCount(1);
     ft1.setAutoReverse(true);
     ft1.play();   
    }

    //Method to play the piano notes
    public void playSound(String filename, Rectangle rectangle){
        if(isRecording == true){
            rec1.add(new RecordedNote(startTime-System.currentTimeMillis(), filename, rectangle));
            
        }
       URL sound = getClass().getResource("pianoNotes/" + filename);
       AudioClip play = new AudioClip(sound.toString());
       play.play();
       showKeyPlayed(rectangle);
       
    }
   
    public void playC2(MouseEvent event){
        playSound("c2.wav", C2);    
    }
    public void playC2s(MouseEvent event){
        playSound("cs2.wav", C2s); 
    }
    public void playD2(MouseEvent event){
        playSound("d2.wav", D2); 
    }
    public void playD2s(MouseEvent event){
        playSound("ds2.wav", D2s); 
    }
    public void playE2(MouseEvent event){
        playSound("e2.wav", E2); 
    }
    public void playF2(MouseEvent event){
        playSound("f2.wav",F2); 
    }
    public void playF2s(MouseEvent event){
        playSound("fs2.wav", F2s); 
    }
    public void playG2(MouseEvent event){
        playSound("g2.wav", G2); 
    }
    public void playG2s(MouseEvent event){
        playSound("gs2.wav", G2s); 
    }
    public void playA2(MouseEvent event){
        playSound("a2.wav", A2); 
    }
    public void playB2f(MouseEvent event){
        playSound("as2.wav", B3f); 
    }
    public void playB2(MouseEvent event){
        playSound("b2.wav", B2); 
    }
    public void playC3(MouseEvent event){
        playSound("c3.wav", C3); 
    }
    
    public void playC3s(MouseEvent event){
        playSound("cs3.wav", C3s); 
    }
    
    public void playD3(MouseEvent event){
        playSound("d3.wav", D3); 
    }
    
    public void playD3s(MouseEvent event){
        playSound("ds3.wav", D3s); 
    }
    
    public void playE3(MouseEvent event){
        playSound("e3.wav", E3); 
    }
    
    public void playF3(MouseEvent event){
        playSound("f3.wav", F3); 
    }
    
    public void playF3s(MouseEvent event){
        playSound("fs3.wav", F3s); 
    }
    
    public void playG3(MouseEvent event){
        playSound("g3.wav", G3); 
    }
    
    public void playG3s(MouseEvent event){
        playSound("gs3.wav", G3s); 
    }
    
    public void playA3(MouseEvent event){
        playSound("a3.wav", A3); 
    }
    
    public void playB3f(MouseEvent event){
        playSound("as3.wav", B3f); 
    }
    
    public void playB3(MouseEvent event){
        playSound("b3.wav", B3); 
    }
  
    
    
    public void quit(ActionEvent event){
        System.exit(0);
        
    }
    public void showAbout(ActionEvent event){
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("About the program");
           alert.setHeaderText(null);
           alert.setContentText("This program was made by Emma, Delnaz, Sam, and Mia. You can play our virtual piano, record your music, and choose from one of our many styles!");
           alert.showAndWait();
    }
    public void keyboardPlay(KeyEvent event){
        if(event.getCode()==KeyCode.A){
            playSound("c2.wav", C2);
        
        }
        if(event.getCode()==KeyCode.S){
            playSound("d2.wav", D2);
        
        }
        if(event.getCode()==KeyCode.D){
            playSound("e2.wav", E2);
        
        }
        if(event.getCode()==KeyCode.F){
            playSound("f2.wav", F2);
        
        }
        if(event.getCode()==KeyCode.G){
            playSound("g2.wav", G2);
        
        }
        if(event.getCode()==KeyCode.H){
            playSound("a2.wav", A2);
        
        }
        if(event.getCode()==KeyCode.J){
            playSound("b2.wav", B2);
        
        }
        if(event.getCode()==KeyCode.K){
            playSound("c3.wav", C3);
        
        }
        if(event.getCode()==KeyCode.L){
            playSound("d3.wav", D3);
        
        }
        if(event.getCode()==KeyCode.Z){
            playSound("e3.wav", E3);
        
        }
        if(event.getCode()==KeyCode.X){
            playSound("f3.wav", F3);
        
        }
        if(event.getCode()==KeyCode.C){
            playSound("g3.wav", G3);
        
        }
        if(event.getCode()==KeyCode.V){
            playSound("a3.wav", A3);
        
        }
        if(event.getCode()==KeyCode.B){
            playSound("b3.wav", B3);
        
        }
        if(event.getCode()==KeyCode.Q){
            playSound("cs2.wav", C2s);
        
        }
        if(event.getCode()==KeyCode.W){
            playSound("ds2.wav", D2s);
        
        }
        if(event.getCode()==KeyCode.E){
            playSound("fs2.wav", F2s);
        
        }
        if(event.getCode()==KeyCode.R){
            playSound("gs2.wav", G2s);
        
        }
        if(event.getCode()==KeyCode.T){
            playSound("as2.wav", B2f);
        
        }
        if(event.getCode()==KeyCode.Y){
            playSound("cs3.wav", C3s);
        
        }
        if(event.getCode()==KeyCode.U){
            playSound("ds3.wav", D3s);
        }
        if(event.getCode()==KeyCode.I){
            playSound("fs3.wav", F3s);
        
        }
        if(event.getCode()==KeyCode.O){
            playSound("gs3.wav", G3s);
        
        }
        if(event.getCode()==KeyCode.P){
            playSound("as3.wav", B3f);
        
        }
    }
}
    
    
    
     
     
     
    
   
   
   
   
   
   
   
   
    


