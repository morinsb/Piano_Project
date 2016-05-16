/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import java.io.File;
import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    //method to play the piano notes
    public void playSound(String filename, Rectangle rectangle){
       URL sound = getClass().getResource("pianoNotes/" + filename);
       AudioClip play = new AudioClip(sound.toString());
       PauseTransition pause = new PauseTransition(Duration.millis(1000));
       rectangle.setVisible(true);
       play.play();
       pause.play();
       rectangle.setVisible(false);
       
    }
    public void playC2(MouseEvent event){
        playSound("c2.wav", C2g);    
    }
    public void playC2s(MouseEvent event){
        playSound("cs2.wav", C2sg); 
    }
    public void playD2(MouseEvent event){
        playSound("d2.wav", D2g); 
    }
    public void playD2s(MouseEvent event){
        playSound("ds2.wav", D2sg); 
    }
    public void playE2(MouseEvent event){
        playSound("e2.wav", E2g); 
    }
    public void playF2(MouseEvent event){
        playSound("f2.wav",F2g); 
    }
    public void playF2s(MouseEvent event){
        playSound("fs2.wav", F2sg); 
    }
    public void playG2(MouseEvent event){
        playSound("g2.wav", G2g); 
    }
    public void playG2s(MouseEvent event){
        playSound("gs2.wav", G2sg); 
    }
    public void playA2(MouseEvent event){
        playSound("a2.wav", A2g); 
    }
    public void playB2f(MouseEvent event){
        playSound("as2.wav", B3fg); 
    }
    public void playB2(MouseEvent event){
        playSound("b2.wav", B2g); 
    }
    public void playC3(MouseEvent event){
        playSound("c3.wav", C3g); 
    }
    
    public void playC3s(MouseEvent event){
        playSound("cs3.wav", C3sg); 
    }
    
    public void playD3(MouseEvent event){
        playSound("d3.wav", D3g); 
    }
    
    public void playD3s(MouseEvent event){
        playSound("ds3.wav", D3sg); 
    }
    
    public void playE3(MouseEvent event){
        playSound("e3.wav", E3g); 
    }
    
    public void playF3(MouseEvent event){
        playSound("f3.wav", F3g); 
    }
    
    public void playF3s(MouseEvent event){
        playSound("fs3.wav", F3sg); 
    }
    
    public void playG3(MouseEvent event){
        playSound("g3.wav", G3g); 
    }
    
    public void playG3s(MouseEvent event){
        playSound("gs3.wav", G3sg); 
    }
    
    public void playA3(MouseEvent event){
        playSound("a3.wav", A3g); 
    }
    
    public void playB3f(MouseEvent event){
        playSound("as3.wav", B3fg); 
    }
    
    public void playB3(MouseEvent event){
        playSound("b3.wav", B3g); 
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
            playSound("c2.wav", C2g);
        
        }
        if(event.getCode()==KeyCode.S){
            playSound("d2.wav", D2g);
        
        }
        if(event.getCode()==KeyCode.D){
            playSound("e2.wav", E2g);
        
        }
        if(event.getCode()==KeyCode.F){
            playSound("f2.wav", F2g);
        
        }
        if(event.getCode()==KeyCode.G){
            playSound("g2.wav", G2g);
        
        }
        if(event.getCode()==KeyCode.H){
            playSound("a2.wav", A2g);
        
        }
        if(event.getCode()==KeyCode.J){
            playSound("b2.wav", B2g);
        
        }
        if(event.getCode()==KeyCode.K){
            playSound("c3.wav", C3g);
        
        }
        if(event.getCode()==KeyCode.L){
            playSound("d3.wav", D3g);
        
        }
        if(event.getCode()==KeyCode.Z){
            playSound("e3.wav", E3g);
        
        }
        if(event.getCode()==KeyCode.X){
            playSound("f3.wav", F3g);
        
        }
        if(event.getCode()==KeyCode.C){
            playSound("g3.wav", G3g);
        
        }
        if(event.getCode()==KeyCode.V){
            playSound("a3.wav", A3g);
        
        }
        if(event.getCode()==KeyCode.B){
            playSound("b3.wav", B3g);
        
        }
        if(event.getCode()==KeyCode.Q){
            playSound("cs2.wav", C2sg);
        
        }
        if(event.getCode()==KeyCode.W){
            playSound("ds2.wav", D2sg);
        
        }
        if(event.getCode()==KeyCode.E){
            playSound("fs2.wav", F2sg);
        
        }
        if(event.getCode()==KeyCode.R){
            playSound("gs2.wav", G2sg);
        
        }
        if(event.getCode()==KeyCode.T){
            playSound("as2.wav", B2fg);
        
        }
        if(event.getCode()==KeyCode.Y){
            playSound("cs3.wav", C3sg);
        
        }
        if(event.getCode()==KeyCode.U){
            playSound("ds3.wav", D3sg);
        }
        if(event.getCode()==KeyCode.I){
            playSound("fs3.wav", F3sg);
        
        }
        if(event.getCode()==KeyCode.O){
            playSound("gs3.wav", G3sg);
        
        }
        if(event.getCode()==KeyCode.P){
            playSound("as3.wav", B3fg);
        
        }
    }
}
    
    
    
     
     
     
    
   
   
   
   
   
   
   
   
    


