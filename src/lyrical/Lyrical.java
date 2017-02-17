/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyrical;
import Frames.SongsList;
import Frames.PlaylistPage;
import Frames.PlayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author nisha
 */
public class Lyrical {

    public static void main(String[] args) {
        // TODO code application logic here
        SongsList sl=new SongsList();
        sl.setVisible(true);
        sl.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(sl,
                        "Are you sure to close this window?", "Really Closing?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        System.exit(0);
                }
            }
        });
    }
    
}
