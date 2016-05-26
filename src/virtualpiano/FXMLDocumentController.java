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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    //getFrustrated!
    //record button
    @FXML
    private ToggleButton rec;
    
    @FXML
    private ToggleButton metronome;
    //play buttons
    @FXML
    private Button play;
    
    //white keys    
    @FXML
    private Rectangle C1;
   
    @FXML
    private Rectangle D1;
   
    @FXML
    private Rectangle E1;
   
    @FXML
    private Rectangle F1;
   
    @FXML
    private Rectangle G1;
   
    @FXML
    private Rectangle A1;
   
    @FXML
    private Rectangle B1;
   
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
    private Rectangle C2;

    //Black keys 
    @FXML
    private Rectangle Cs1;

    @FXML
    private Rectangle Ds1;

    @FXML
    private Rectangle Fs1;

    @FXML
    private Rectangle Gs1;

    @FXML
    private Rectangle Bf1;

    @FXML
    private Rectangle Cs2;

    @FXML
    private Rectangle Ds2;

    @FXML
    private Rectangle Fs2;

    @FXML
    private Rectangle Gs2;

    @FXML
    private Rectangle Bf2;
   
   //menu bar
   @FXML
   private MenuBar menu;
   
   //menu choices
   @FXML
   private Menu file;
   @FXML
   private Menu help;
   
   
   @FXML
   private MenuItem quit;
   
   @FXML
   private MenuItem about;
   
   
   @FXML
   private Menu octaves;
   
   @FXML
   private MenuItem zero_one;
   @FXML
   private MenuItem one_two;
   @FXML
   private MenuItem two_three;
   @FXML
   private MenuItem three_four;
   @FXML
   private MenuItem four_five;
   @FXML
   private MenuItem five_six;
   
   
   @FXML
   private Menu skins;
   
   @FXML
   private MenuItem reverseSkin;
   @FXML
   private MenuItem blueSkin;
   @FXML
   private MenuItem lavendarSkin;
    @FXML
   private MenuItem maroonSkin;
    @FXML
   private MenuItem defaultSkin;
   @FXML
   private MenuItem rainbowSkin;

 
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
   @FXML
   private Button otj;
   
   private long startTime;
   private long elapsedTime;
   private ArrayList<RecordedNote> rec1 = new ArrayList<RecordedNote>();
   private boolean isRecording = false;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public void metronome(MouseEvent event){
        while(true){
         playSound("Click1.wav");
         
        }
        
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
                    long t = rec1.get(i+1).getTime()-rec1.get(i).getTime();
                    Thread.sleep(t);
                    //Thread.sleep(250);
                } catch(InterruptedException e){   
                    
                }
            }
        }
    }
    public void sleep(int t){
       try {
            Thread.sleep(t);
        } catch (InterruptedException ex) {
            
        } 
    }
  
    public void reverseSkin(ActionEvent event){
        VirtualPiano.switchToReverse();
    }
    public void blueSkin(ActionEvent event){
        VirtualPiano.switchToBlue();
    }
   public void lavendarSkin(ActionEvent event){
        VirtualPiano.switchToLavendar();
    }
    public void maroonSkin(ActionEvent event){
        VirtualPiano.switchToMaroon();
    }
    public void defaultSkin(ActionEvent event){
        VirtualPiano.switchToDefault();
    }
    public void rainbowSkin(ActionEvent event){
        VirtualPiano.switchToRainbow();
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
            rec1.add(new RecordedNote(System.currentTimeMillis()-startTime, filename, rectangle));
            
        }
       URL sound = getClass().getResource("pianoNotes/" + filename);
       AudioClip play = new AudioClip(sound.toString());
       play.play();
       showKeyPlayed(rectangle);
       
    }
    //method to play a sound that is not a piano note
     public void playSound(String filename){
       URL sound = getClass().getResource("pianoNotes/" + filename);
       AudioClip play1 = new AudioClip(sound.toString());
       play1.play(); 
    }
    //method to play a sound that is not a piano note
     
    //play notes
    public void playC1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "c1.wav", C1);    
    }
    public void playCs1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "cs1.wav", Cs1); 
    }
    public void playD1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "d1.wav", D1); 
    }
    public void playDs1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "ds1.wav", Ds1); 
    }
    public void playE1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "e1.wav", E1); 
    }
    public void playF1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "f1.wav",F1); 
    }
    public void playFs1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "fs1.wav", Fs1); 
    }
    public void playG1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "g1.wav", G1); 
    }
    public void playGs1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "gs1.wav", Gs1); 
    }
    public void playA1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "a1.wav", A1); 
    }
    public void playBf1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "as1.wav", Bf1); 
    }
    public void playB1(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "b1.wav", B1); 
    }
    public void playC2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "c2.wav", C2); 
    }
    
    public void playCs2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "cs2.wav", Cs2); 
    }
    
    public void playD2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "d2.wav", D2); 
    }
    
    public void playDs2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "ds2.wav", Ds2); 
    }
    
    public void playE2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "e2.wav", E2); 
    }
    
    public void playF2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "f2.wav", F2); 
    }
    
    public void playFs2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "fs2.wav", Fs2); 
    }
    
    public void playG2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "g2.wav", G2); 
    }
    
    public void playGs2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "gs2.wav", Gs2); 
    }
    
    public void playA2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "a2.wav", A2); 
    }
    
    public void playBf2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "as2.wav", Bf2); 
    }
    
    public void playB2(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "b2.wav", B2); 
    }
    
    
    //set octave methods
    public void zero_one(ActionEvent event){
       changeOctave("zero_one"); 
    }
    public void one_two(ActionEvent event){
        changeOctave("one_two");
    }
    public void two_three(ActionEvent event){
        changeOctave("two_three");
    }
    public void three_four(ActionEvent event){
        changeOctave("three_four");
    }
    public void four_five(ActionEvent event){
        changeOctave("four_five");
    }
    public void five_six(ActionEvent event){
        changeOctave("five_six");
    }
    
    public void changeOctave(String newOctave){
        VirtualPiano.currentOctave = newOctave;
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
            playSound("c1.wav", C1);
        
        }
        if(event.getCode()==KeyCode.S){
            playSound("d1.wav", D1);
        
        }
        if(event.getCode()==KeyCode.D){
            playSound("e1.wav", E1);
        
        }
        if(event.getCode()==KeyCode.F){
            playSound("f1.wav", F1);
        
        }
        if(event.getCode()==KeyCode.G){
            playSound("g1.wav", G1);
        
        }
        if(event.getCode()==KeyCode.H){
            playSound("a1.wav", A1);
        
        }
        if(event.getCode()==KeyCode.J){
            playSound("b1.wav", B1);
        
        }
        if(event.getCode()==KeyCode.K){
            playSound("c2.wav", C2);
        
        }
        if(event.getCode()==KeyCode.L){
            playSound("d2.wav", D2);
        
        }
        if(event.getCode()==KeyCode.Z){
            playSound("e2.wav", E2);
        
        }
        if(event.getCode()==KeyCode.X){
            playSound("f2.wav", F2);
        
        }
        if(event.getCode()==KeyCode.C){
            playSound("g2.wav", G2);
        
        }
        if(event.getCode()==KeyCode.V){
            playSound("a2.wav", A2);
        
        }
        if(event.getCode()==KeyCode.B){
            playSound("b2.wav", B2);
        
        }
        if(event.getCode()==KeyCode.Q){
            playSound("cs1.wav", Cs1);
        
        }
        if(event.getCode()==KeyCode.W){
            playSound("ds1.wav", Ds1);
        
        }
        if(event.getCode()==KeyCode.E){
            playSound("fs1.wav", Fs1);
        
        }
        if(event.getCode()==KeyCode.R){
            playSound("gs1.wav", Gs1);
        
        }
        if(event.getCode()==KeyCode.T){
            playSound("as1.wav", Bf1);
        
        }
        if(event.getCode()==KeyCode.Y){
            playSound("cs2.wav", Cs2);
        
        }
        if(event.getCode()==KeyCode.U){
            playSound("ds2.wav", Ds2);
        }
        if(event.getCode()==KeyCode.I){
            playSound("fs2.wav", Fs2);
        
        }
        if(event.getCode()==KeyCode.O){
            playSound("gs2.wav", Gs2);
        
        }
        if(event.getCode()==KeyCode.P){
            playSound("as2.wav", Bf2);
        
        }
    }
          
  
    public void playOdeToJoy(MouseEvent event){
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(700);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(800);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(700);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(800);
        //verse 2
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(700);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g1.wav", G1);
        sleep(800);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        sleep(500);
        playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        sleep(700);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        sleep(200);
        playSound(VirtualPiano.getOctave() + "c2.wav", C2);
    }
    }

    
    
    
     
     
     
    
   
   
   
   
   
   
   
   
    


