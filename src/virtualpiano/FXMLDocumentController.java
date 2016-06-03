/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Sam Morin, Delnaz Patel, Emma Rafkin, Mia Waggoner
 */
public class FXMLDocumentController implements Initializable, EventHandler<ActionEvent> {
    
    //Styling
    @FXML
    private Rectangle titleBackground;
    //white rectangles
    @FXML
    private Rectangle white1;
    @FXML
    private Rectangle white2;
    @FXML
    private Rectangle white3;
    @FXML
    private Rectangle white4;
    @FXML
    private Rectangle white5;
    @FXML
    private Rectangle white6;
    //black rectanlges
    @FXML
    private Rectangle black1;
    @FXML
    private Rectangle black2;
    @FXML
    private Rectangle black3;
    @FXML
    private Rectangle black4;
            
    
    
    //getFrustrated!
    @FXML
    private Button getFrustrated;
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
   private MenuItem tutorial;
   
   
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

   @FXML
   private Menu pianos;
   
   @FXML
   private MenuItem steinway;
   @FXML
   private MenuItem kawai;
   
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
   private Slider metronomeSlider;
   //hear the masters buttons
   @FXML
   private Button otj;
   @FXML
   private Button cancan;

 
   
   
   private long startTime;
   private long elapsedTime;
   private ArrayList<RecordedNote> rec1 = new ArrayList<RecordedNote>();
   private boolean isRecording = false;
   private boolean metronomeOn = false;
   Timeline tl = new Timeline();
   private double sliderValue;
   
   
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    @Override
    public void handle(ActionEvent event) {
         playSound("Click1.wav");
        
    }
    
    public void metronome(MouseEvent event){
        this.sliderValue = 60000/(metronomeSlider.getValue());
        metronomeOn=!metronomeOn;
        
        tl.getKeyFrames().add(new KeyFrame(Duration.millis(this.sliderValue), this));
        tl.setCycleCount(Animation.INDEFINITE);
        if(metronomeOn == true){ 
            tl.play();
        }else{
            tl.stop();
            tl.getKeyFrames().clear();
        }
        
    }
    public void getSliderValue(MouseEvent event){
        this.sliderValue = 60000/(metronomeSlider.getValue());
  
    }
    public void getFrustrated(MouseEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("You're Frustrated?");
        alert.setHeaderText("Everyone gets frustrated!");
        alert.setContentText("Only losers give up! Keep practicing! You can take a break once you become a piano master! :)");
        alert.showAndWait();
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
      try{
      Thread.sleep(t);
      }catch(InterruptedException e){
          
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
        if((VirtualPiano.getPiano().equals("kawai/")) && (VirtualPiano.getOctave().equals("zero_one/") || VirtualPiano.getOctave().equals("five_six/"))){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Octaves");
            alert.setHeaderText(null);
            alert.setContentText("Sorry, this function is not available. Only octaves 1-5 are available for the Kawai piano.");
            alert.showAndWait();
        } else {
            URL sound = getClass().getResource("pianoNotes/" + VirtualPiano.getPiano() + filename);
            AudioClip play = new AudioClip(sound.toString());
            play.play();
            showKeyPlayed(rectangle);
        }
    }
    //method to play a sound that is not a piano note
     public void playSound(String filename){
       URL sound = getClass().getResource("pianoNotes/" + filename);
       AudioClip play1 = new AudioClip(sound.toString());
       play1.play(); 
    }
   
     
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
    
    // set piano
    public void steinway(ActionEvent event){
        changePiano("steinway");
    }
    public void kawai(ActionEvent event){
        changePiano("kawai");
    }
    public void changePiano(String newPiano){
        VirtualPiano.currentPiano = newPiano;
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
    
    
    
   
   //Tutorial
   public void showTutorial(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: How to use the Virtual Piano");
        alert.setContentText("This tutorial will cover the basics of VirtualPiano. Would you like to begin the VirtualPiano tutorial?");
        ButtonType beginTutorial = new ButtonType("Yes!  Let's begin");
        ButtonType doNotBeginTutorial = new ButtonType("Nah, I got this", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(beginTutorial, doNotBeginTutorial);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == beginTutorial){
                this.tutorialPart1();
            } else if (result.get() == doNotBeginTutorial) {
                // ... user chose "Two"
            }
    }
   
   private void tutorialPart1() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: Step One");
        alert.setContentText("Playing the white keys: you can either use the keyboard to play (keys A-B) or click the keys on the screen inidividually.");
        ButtonType nextTutorial1 = new ButtonType("Next");
        ButtonType stopTutorial1 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(stopTutorial1, nextTutorial1);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == nextTutorial1) {
                this.tutorialPart2();
            }
    }
   
   private void tutorialPart2() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: Step Two");
        alert.setContentText("Playing the black keys: you can either use the keyboard to play (keys Q-P) or click the keys on the screen inidividually.");
        ButtonType backTutorial2 = new ButtonType("Back");
        ButtonType nextTutorial2 = new ButtonType("Next");
        ButtonType stopTutorial2 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(backTutorial2, stopTutorial2, nextTutorial2);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == backTutorial2){
                this.tutorialPart1();
            } else if (result.get() == nextTutorial2) {
                this.tutorialPart3();
            }
    }
   
    private void tutorialPart3() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: Step Three");
        alert.setContentText("You can switch between octaves by clicking File > Octaves in the toolbar.  You can then choose which octave range you would like to play.");
        ButtonType backTutorial3 = new ButtonType("Back");
        ButtonType nextTutorial3 = new ButtonType("Next");
        ButtonType stopTutorial3 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(backTutorial3, stopTutorial3, nextTutorial3);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == backTutorial3){
                this.tutorialPart2();
            } else if (result.get() == nextTutorial3) {
                this.tutorialPart4();
            }
    }
    
    private void tutorialPart4() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: Step Four");
        alert.setContentText("Custom Keys: To change the color of the keys, click File > Skins.  You can select your desired custom designed skin!");
        ButtonType backTutorial4 = new ButtonType("Back");
        ButtonType nextTutorial4 = new ButtonType("Next");
        ButtonType stopTutorial4 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(backTutorial4, stopTutorial4, nextTutorial4);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == backTutorial4){
                this.tutorialPart3();
            } else if (result.get() == nextTutorial4) {
                this.tutorialPart5();
            }
    }
    
    
    
        
        private void tutorialPart5() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: Step Five");
        alert.setContentText("Recording your own tunes: To record and play back your music, press the record button in the upper right hand corner of the screen and proceed to record your song by clicking the 'Record' button.  You may change the octaves as you record, to get a wider variety of sounds.  When you are finished recording, press the 'Record' button.  You can then press Play, right below the 'Record' button to hear what you have recorded.");
        ButtonType backTutorial5 = new ButtonType("Back");
        ButtonType nextTutorial5 = new ButtonType("Next");
        ButtonType stopTutorial5 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(backTutorial5, stopTutorial5, nextTutorial5);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == backTutorial5){
                this.tutorialPart4();
            } else if (result.get() == nextTutorial5) {
                this.tutorialPart6();
            }
    }
    
        private void tutorialPart6() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: Step Seven");
        alert.setContentText("Recording your own tunes: You can also save your recordings and play them later.  Share them with your friends and family!");
        ButtonType backTutorial6 = new ButtonType("Back");
        ButtonType nextTutorial6 = new ButtonType("Next");
        ButtonType stopTutorial6 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(backTutorial6, stopTutorial6, nextTutorial6);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == backTutorial6){
                this.tutorialPart5();
            } else if (result.get() == nextTutorial6) {
                this.tutorialPart7();
            }
    }
        
        
        private void tutorialPart7() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("Piano.png").toString()));
        alert.setTitle("Tutorial");
        alert.setHeaderText("Tutorial: COMPLETE");
        alert.setContentText("YOU ARE NOW A VIRTUAL PIANO SUPERSTAR/MASTER!!!");
        ButtonType backTutorial7 = new ButtonType("Back");
        ButtonType stopTutorial7 = new ButtonType("End Tutorial", ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(backTutorial7, stopTutorial7);

        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == backTutorial7){
                this.tutorialPart6();
            }
    }
    
    
    
    public void keyboardPlay(KeyEvent event){
        if(event.getCode()==KeyCode.A){
            playSound(VirtualPiano.getOctave() + "c1.wav", C1);
        
        }
        if(event.getCode()==KeyCode.S){
            playSound(VirtualPiano.getOctave() + "d1.wav", D1);
        
        }
        if(event.getCode()==KeyCode.D){
            playSound(VirtualPiano.getOctave() + "e1.wav", E1);
        
        }
        if(event.getCode()==KeyCode.F){
            playSound(VirtualPiano.getOctave() + "f1.wav", F1);
        
        }
        if(event.getCode()==KeyCode.G){
            playSound(VirtualPiano.getOctave() + "g1.wav", G1);
        
        }
        if(event.getCode()==KeyCode.H){
            playSound(VirtualPiano.getOctave() + "a1.wav", A1);
        
        }
        if(event.getCode()==KeyCode.J){
            playSound(VirtualPiano.getOctave() + "b1.wav", B1);
        
        }
        if(event.getCode()==KeyCode.K){
            playSound(VirtualPiano.getOctave() + "c2.wav", C2);
        
        }
        if(event.getCode()==KeyCode.L){
            playSound(VirtualPiano.getOctave() + "d2.wav", D2);
        
        }
        if(event.getCode()==KeyCode.Z){
            playSound(VirtualPiano.getOctave() + "e2.wav", E2);
        
        }
        if(event.getCode()==KeyCode.X){
            playSound(VirtualPiano.getOctave() + "f2.wav", F2);
        
        }
        if(event.getCode()==KeyCode.C){
            playSound(VirtualPiano.getOctave() + "g2.wav", G2);
        
        }
        if(event.getCode()==KeyCode.V){
            playSound(VirtualPiano.getOctave() + "a2.wav", A2);
        
        }
        if(event.getCode()==KeyCode.B){
            playSound(VirtualPiano.getOctave() + "b2.wav", B2);
        
        }
        if(event.getCode()==KeyCode.Q){
            playSound(VirtualPiano.getOctave() + "cs1.wav", Cs1);
        
        }
        if(event.getCode()==KeyCode.W){
            playSound(VirtualPiano.getOctave() + "ds1.wav", Ds1);
        
        }
        if(event.getCode()==KeyCode.E){
            playSound(VirtualPiano.getOctave() + "fs1.wav", Fs1);
        
        }
        if(event.getCode()==KeyCode.R){
            playSound(VirtualPiano.getOctave() + "gs1.wav", Gs1);
        
        }
        if(event.getCode()==KeyCode.T){
            playSound(VirtualPiano.getOctave() + "as1.wav", Bf1);
        
        }
        if(event.getCode()==KeyCode.Y){
            playSound(VirtualPiano.getOctave() + "cs2.wav", Cs2);
        
        }
        if(event.getCode()==KeyCode.U){
            playSound(VirtualPiano.getOctave() + "ds2.wav", Ds2);
        }
        if(event.getCode()==KeyCode.I){
            playSound(VirtualPiano.getOctave() + "fs2.wav", Fs2);
        
        }
        if(event.getCode()==KeyCode.O){
            playSound(VirtualPiano.getOctave() + "gs2.wav", Gs2);
        
        }
        if(event.getCode()==KeyCode.P){
            playSound(VirtualPiano.getOctave() + "as2.wav", Bf2);
        
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
    
    public void playCanCan(MouseEvent event){
       playSound(VirtualPiano.getOctave() + "g1.wav", G1);
       sleep(500);
       playSound(VirtualPiano.getOctave() + "g1.wav", G1);
       sleep(500);
       playSound(VirtualPiano.getOctave() + "a1.wav", A1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "c2.wav", C2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "b1.wav", B1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "a1.wav", A1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "d2.wav", D2);
       sleep(500);
       playSound(VirtualPiano.getOctave() + "d2.wav", D2);
       sleep(500);
       playSound(VirtualPiano.getOctave() + "d2.wav", D2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "e2.wav", E2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "b1.wav", B1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "c2.wav", C2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "a1.wav", A1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "a1.wav", A1);
       sleep(500);
       playSound(VirtualPiano.getOctave() + "b1.wav", B1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "c2.wav", C2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "b1.wav", B1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "a1.wav", A1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "g1.wav", G1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "g2.wav", G2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "fs2.wav", Fs2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "e2.wav", E2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "d2.wav", D2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "c2.wav", C2);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "b1.wav", B1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "a1.wav", A1);
       sleep(250);
       playSound(VirtualPiano.getOctave() + "g1.wav", G1);
       sleep(500);
    }
    
}


    
    
    
  
    
    

    

    
    
    
     
     
     
    
   
   
   
   
   
   
   
    


