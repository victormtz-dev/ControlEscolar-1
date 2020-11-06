/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FP;
 
import View.LoginUI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author victormanuel
 */
public class FP {
    public static void main(String[] args) {
         
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(FP.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(FP.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(FP.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(FP.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
       
    LoginUI loginUI = new LoginUI();
    }
}
