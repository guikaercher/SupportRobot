/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportrobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme_Kaercher
 */
public class Typer {

    public Robot robot;

    public Typer() {
        try {
            this.robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(Typer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void typeThat(String s) {

        String subString = "";
        int tempo = 10;

        for (int i = 0; i < s.length(); i++) {
            subString = s.substring(i, i + 1);
            //System.out.println(s.substring(i, i+1));

            switch (subString) {
                default:
                    throw new IllegalArgumentException("Cannot type character " + subString);
                //faz alguma coisa
                 case "▼":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    break;    
                    
                //acentos, cedilha e caracteres especiais

                case "Ç":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "ü":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "é":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "ç":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "ê":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ë":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "è":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ï":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "î":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ì":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ô":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ö":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ò":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "û":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ù":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ÿ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "á":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "í":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ó":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ú":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ñ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ñ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ª":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "º":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "¿":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "½":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "¼":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "²":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "€":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ˆ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "“":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "”":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "˜":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ÿ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "¨":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "³":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "¹":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "À":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Á":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Â":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ã":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ä":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Å":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "È":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ê":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ë":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ì":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Í":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Î":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ï":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ò":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ó":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case "Ô":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Õ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Ú":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Û":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "ã":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "õ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "_":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD9);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD9);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "/":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD4);
                    robot.keyPress(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_NUMPAD4);
                    robot.keyRelease(KeyEvent.VK_NUMPAD7);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case ">":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "<":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;

                case " ":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case ":":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "!":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "@":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "#":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "$":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_4);
                    robot.keyRelease(KeyEvent.VK_4);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "%":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "¨¨":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_6);
                    robot.keyRelease(KeyEvent.VK_6);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "&":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_7);
                    robot.keyRelease(KeyEvent.VK_7);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "*":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "(":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ")":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "=":
                    robot.keyPress(KeyEvent.VK_EQUALS);
                    robot.keyRelease(KeyEvent.VK_EQUALS);
                    break;
                case "?":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ",":
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case ".":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case ";":
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    break;
                case "-":
                    robot.keyPress(KeyEvent.VK_MINUS);
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    break;

                //letras maiusculas 
                case "A":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "B":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_B);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "C":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "D":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "E":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "F":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_F);
                    robot.keyRelease(KeyEvent.VK_F);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "G":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "H":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "I":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "J":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_J);
                    robot.keyRelease(KeyEvent.VK_J);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "K":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "L":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "M":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "N":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "O":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "P":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Q":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "R":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "S":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "T":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "U":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "V":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "W":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "X":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Y":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Z":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;

                //letras minusculas
                case "a":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    break;
                case "b":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_B);
                    robot.keyRelease(KeyEvent.VK_B);
                    break;
                case "c":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_C);
                    break;
                case "d":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);
                    break;
                case "e":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    break;
                case "f":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_F);
                    robot.keyRelease(KeyEvent.VK_F);
                    break;
                case "g":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_G);
                    break;
                case "h":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_H);
                    break;
                case "i":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_I);
                    break;
                case "j":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_J);
                    robot.keyRelease(KeyEvent.VK_J);
                    break;
                case "k":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_K);
                    break;
                case "l":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);
                    break;
                case "m":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_M);
                    break;
                case "n":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);
                    break;
                case "o":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    break;
                case "p":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_P);
                    break;
                case "q":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_Q);
                    break;
                case "r":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);
                    break;
                case "s":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    break;
                case "t":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_T);
                    break;
                case "u":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_U);
                    break;
                case "v":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    break;
                case "w":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_W);
                    break;
                case "x":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_X);
                    break;
                case "y":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_Y);
                    break;
                case "z":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_Z);
                    break;

                //numeros
                case "0":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_0);
                    break;
                case "1":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_1);
                    break;
                case "2":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_2);
                    break;
                case "3":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_3);
                    break;
                case "4":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_4);
                    robot.keyRelease(KeyEvent.VK_4);
                    break;
                case "5":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_5);
                    break;
                case "6":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_6);
                    robot.keyRelease(KeyEvent.VK_6);
                    break;
                case "7":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_7);
                    robot.keyRelease(KeyEvent.VK_7);
                    break;
                case "8":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_8);
                    break;
                case "9":
                    robot.delay(tempo);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    break;
            }

        }

    }

}
