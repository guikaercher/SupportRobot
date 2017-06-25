//package KeyboardHook;
//
//import java.awt.event.KeyEvent;
//import lc.kra.system.keyboard.GlobalKeyboardHook;
//import lc.kra.system.keyboard.event.GlobalKeyAdapter;
//import lc.kra.system.keyboard.event.GlobalKeyEvent;
//import supportrobot.HandleMacros;
//import supportrobot.Macro;
//import supportrobot.Typer;
//
//public class GlobalKeyBoardHookJava implements Runnable {
//
//    private static boolean run = true;
//    private static String stringDigitada = "";
//    //private static Typer t;
//    private static Macro macro;
//
//    public static String getStringDigitada() {
//        return stringDigitada;
//    }
//
//    public static void teste() {
//
//        // might throw a UnsatisfiedLinkError if the native library fails to load or a RuntimeException if hooking fails 
//        GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook();
//
//        //HandleMacros.getInstance().getMacroPerName(stringDigitada)
//        System.out.println("Global keyboard hook successfully started, press [escape] key to shutdown.");
//        keyboardHook.addKeyListener(new GlobalKeyAdapter() {
//            @Override
//            public void keyPressed(GlobalKeyEvent event) {
//                stringDigitada += "" + event.getKeyChar();
//                System.out.println(stringDigitada);
//                for (Macro m : HandleMacros.getInstance().getListaDeMacros()) {
//                    // System.out.println("entrou no loop do keyboard");
//                    String aux = m.getNome().toLowerCase();
//                    aux = aux.replaceAll("\\s", "");
//                    if (stringDigitada.contains(".." + aux)) {
//                        macro = m;
//                        System.out.println("Digitada macro: " + aux);
//                        run = false;// para de ouvir
//                    }
//                }
//
//                //se apertar ESC para a aplicaçao
//                if (event.getVirtualKeyCode() == GlobalKeyEvent.VK_ESCAPE) {
//                    run = false;
//                    System.exit(0);
//                }
//            }
//
//            @Override
//            public void keyReleased(GlobalKeyEvent event) {
//                //System.out.println(event.getKeyChar()); 
//            }
//        });
//
//        try {
//            while (run) {
//                Thread.sleep(128);
//            }
//        } catch (InterruptedException e) {
//            /* nothing to do here */ } finally {
//            keyboardHook.shutdownHook();
//        }
//
//    }
//
//    @Override
//    public void run() {
//        Typer t = new Typer();
//        teste();
//        //somente print/a quando se aperta ESC
//        System.out.println("String digitada: " + getStringDigitada());
//
//        t.robot.delay(100);
//        t.robot.keyPress(KeyEvent.VK_CONTROL);
//        t.robot.keyPress(KeyEvent.VK_A);
//        t.robot.keyRelease(KeyEvent.VK_CONTROL);
//        t.robot.keyRelease(KeyEvent.VK_A);
//        t.typeThat(macro.getTexto());
//
//        t.robot.delay(100);
//        stringDigitada = "";
//        run = true;
//        run();
//
//    }
//
//    public static void main(String[] args) {
//
//        //  try {
//        //     //le os arquivos txt
//        //      HandleMacros.getInstance().read();
//        //     HandleBotoes.getInstance().read();
//        //  } catch (IOException | NullPointerException ex) {
//        //      Logger.getLogger(GlobalKeyboardExample.class.getName()).log(Level.SEVERE, null, ex);
//        //  }
//        // Typer t = new Typer();
//        //teste();
//        //somente print/a quando se aperta ESC
//        //System.out.println("String digitada: " + getStringDigitada());
//        //t.robot.delay(100);
//        // t.robot.keyPress(KeyEvent.VK_CONTROL);
//        // t.robot.keyPress(KeyEvent.VK_A);
//        // t.robot.keyRelease(KeyEvent.VK_CONTROL);
//        //  t.robot.keyRelease(KeyEvent.VK_A);
//        // t.typeThat(macro.getTexto());
//    }
//
//}
