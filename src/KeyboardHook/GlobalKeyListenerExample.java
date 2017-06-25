package KeyboardHook;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import supportrobot.HandleMacros;
import supportrobot.Macro;
import supportrobot.Typer;

public class GlobalKeyListenerExample implements NativeKeyListener, Runnable {

    private String realChar = "", stringConverted = "";
    private Macro macro;

    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println(NativeKeyEvent.getKeyText(e.getKeyCode()));

        realChar += NativeKeyEvent.getKeyText(e.getKeyCode()) + "";
        stringConverted += NativeKeyEvent.getKeyText(e.getKeyCode()) + "";
        
        stringConverted = stringConverted.toLowerCase();
        stringConverted = stringConverted.replace(" ", "");
        if(stringConverted.contains("pontofinal")) stringConverted = stringConverted.replace("pontofinal", ".");

        for (Macro m : HandleMacros.getInstance().getListaDeMacros()) {
            // System.out.println("entrou no loop do keyboard");
            String aux = m.getNome().toLowerCase();
            aux = aux.replaceAll(" ", "");
            macro = m;
            if (stringConverted.toLowerCase().contains(".." + aux)) {
                System.out.println("Digitada macro: " + aux);
                Typer t = new Typer();
                //t.robot.delay(10);
                t.robot.keyPress(KeyEvent.VK_CONTROL);
                t.robot.keyPress(KeyEvent.VK_A);
                t.robot.keyRelease(KeyEvent.VK_CONTROL);
                t.robot.keyRelease(KeyEvent.VK_A);
                t.typeThat(macro.getTexto());
                t.robot.delay(100);
                macro = null;
                stringConverted = "";
                
                try {
                    macro.wait(0);
                    stringConverted.wait(0);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GlobalKeyListenerExample.class.getName()).log(Level.SEVERE, null, ex);
                }
                //mata o registro e abre um novo "em branco"
                try {
                    GlobalScreen.unregisterNativeHook();
                } catch (NativeHookException ex) {
                    Logger.getLogger(GlobalKeyListenerExample.class.getName()).log(Level.SEVERE, null, ex);
                }//finally{
                    //t.robot.delay(100);
                    run();
                //}
                
            }
        }

        if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            try {
                System.out.println("real char: " + realChar);
                System.out.println("converted char: " + stringConverted);
                GlobalScreen.unregisterNativeHook();
                
                //System.exit(1);
            } catch (NativeHookException ex) {
                Logger.getLogger(GlobalKeyListenerExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
    }

    public void run() {
        try {
            stringConverted = "";
            macro = null;
            //new Typer().robot.delay(10);
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        GlobalScreen.addNativeKeyListener(new GlobalKeyListenerExample());
    }

}
