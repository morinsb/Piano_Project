/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;

/**
 *
 * @author csstudent
 */
public class RecordedNote {
    private static long time;
    private static String note;
    
    public RecordedNote(long t, String n){
        time = t;
        note = n;
    }
    
    public long getTime(){
        return time;
    }
     public String getNote(){
         return note;
     }
     
}
