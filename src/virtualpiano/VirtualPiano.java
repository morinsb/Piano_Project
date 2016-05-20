/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author csstudent
 */
public class VirtualPiano extends Application {
    private Parent root;
    private Scene scene;
    public static VirtualPiano appInstance;
    
    @Override
    public void start(Stage stage) throws Exception {
     appInstance = this;
     root= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")); 
     scene = new Scene(root);
     String cssFilePath = getClass().getResource("default.css").toExternalForm();
     scene.getStylesheets().add(cssFilePath);
     stage.setScene(scene);
     stage.show();
    }
    
    public static void switchToReverse(){
        appInstance.scene.getStylesheets().clear();
        appInstance.scene.getStylesheets().add(appInstance.getClass().getResource("reverseDefault.css").toExternalForm());

    }
    public static void switchToBlue(){
        appInstance.scene.getStylesheets().clear();
        appInstance.scene.getStylesheets().add(appInstance.getClass().getResource("bachBlue.css").toExternalForm());
    }
    public static void switchToLavendar(){
        appInstance.scene.getStylesheets().clear();
         appInstance.scene.getStylesheets().add(appInstance.getClass().getResource("lisztLavender.css").toExternalForm());
    }
    public static void switchToMaroon(){
        appInstance.scene.getStylesheets().clear();
        appInstance.scene.getStylesheets().add(appInstance.getClass().getResource("mozartMaroon.css").toExternalForm());
    }
    public static void switchToDefault(){
        appInstance.scene.getStylesheets().clear();
         appInstance.scene.getStylesheets().add(appInstance.getClass().getResource("default.css").toExternalForm());
    }
    public static void switchToRainbow(){
        appInstance.scene.getStylesheets().clear();
        appInstance.scene.getStylesheets().add(appInstance.getClass().getResource("rachmaninoffRainbow.css").toExternalForm());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
