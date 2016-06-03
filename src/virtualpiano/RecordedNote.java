/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

import java.io.Serializable;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author csstudent
 */
public class RecordedNote implements Serializable{
    private long time;
    private String file;
    public RecordedNote(long t, String f){
        time = t;
        file = f;
    }
    
    public long getTime(){
        return time;
    }
    public String getFile(){
         return file;
     }

    
}
