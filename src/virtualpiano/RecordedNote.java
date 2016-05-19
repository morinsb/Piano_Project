/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author csstudent
 */
public class RecordedNote {
    private static long time;
    private static String file;
    private static Rectangle rectangle;
    public RecordedNote(long t, String f, Rectangle r){
        time = t;
        file = f;
        rectangle = r;
    }
    
    public long getTime(){
        return time;
    }
    public String getFile(){
         return file;
     }
    public Rectangle getRec(){
     return rectangle;   
    }
    
}
