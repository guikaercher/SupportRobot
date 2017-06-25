/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportrobot;


import KeyboardHook.GlobalKeyListenerExample;
import UI1.UI1;
import UI2.UI2;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Guilherme_Kaercher
 */
public class Main {
    
    public static void main (String args[]) throws IOException{
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //le os arquivos txt
        HandleMacros.getInstance().read();      
        HandleBotoes.getInstance().read();
        
        
        //UI1 ui = new UI1();
        UI2 ui = new UI2();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        

        //inicia o global keyboard
        //new Thread(new GlobalKeyBoardHookJava()).run();
        new Thread(new GlobalKeyListenerExample()).run();
        
        
        
                

    }
}
