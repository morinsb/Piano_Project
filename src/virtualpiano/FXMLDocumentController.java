/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author csstudent
 */
public class FXMLDocumentController implements Initializable {
    
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
   private Rectangle D0;
   @FXML
   private Rectangle E0;
   @FXML
   private Rectangle F0;
   @FXML
   private Rectangle G0;
   @FXML
   private Rectangle A0;
   @FXML
   private Rectangle B0;
   @FXML
   private Rectangle C0;
   
   //Black keys 
   @FXML
   private Rectangle Csharp0;
   @FXML
   private Rectangle Eflat0;
   @FXML
   private Rectangle Fsharp0;
   @FXML
   private Rectangle Gsharp0;
   @FXML
   private Rectangle Asharp0;
   @FXML
   private Rectangle Bflat0;
   @FXML
   private Rectangle Csharp1;
   @FXML
   private Rectangle Eflat1;
   @FXML
   private Rectangle Fsharp1;
   @FXML
   private Rectangle Gsharp1;
   @FXML
   private Rectangle Asharp1;
   @FXML
   private Rectangle Bflat1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void playSound(ActionEvent playC0){
        
    }
   
    
}

