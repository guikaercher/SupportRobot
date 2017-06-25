/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportrobot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme_Kaercher
 */
public class HandleMacros {
    
    private static HandleMacros instance = null;
    
    private ArrayList<Macro> listaDeMacros = new ArrayList<>();
    private static final String caminho = "C:\\SupportRobot\\";
    private static final String simboloDivisor = "¬";


        
     public static HandleMacros getInstance(){
      if(instance == null) {
         instance = new HandleMacros();
      }
      return instance;
   }

    public ArrayList<Macro> getListaDeMacros() {
        return listaDeMacros;
    }
     
     
     
    
     public Macro getMacroPerName(String nome){

         for (Macro macro : listaDeMacros) {
             if (macro.getNome().equalsIgnoreCase(nome)) {
                 return macro;
             }
         }
         return null;
     }
     
     public String[] getAllMacrosNamesInArray(){
         String[] arrayDeMacros = new String[listaDeMacros.size()];
         int i = 0;
         for (Macro macro : listaDeMacros) {
             System.out.println("macro: " + macro.getNome() + " adcionada ao array");
             arrayDeMacros[i] = macro.getNome();
             i++;
         }
         
         return arrayDeMacros;
     }

    public void adcionaMacro(String nome, String texto) throws NullPointerException {

        if (listaDeMacros == null) {
            getInstance().listaDeMacros.add(new Macro(nome, texto));
        }

        boolean existe = false;
        

        if (listaDeMacros != null) {
            for (Macro macro : listaDeMacros) {
                if (macro.getNome().equalsIgnoreCase(nome)) {
                    JOptionPane.showMessageDialog(null, "Ja existe a macro: " + macro.getNome());
                    existe = true;
                } else {
                    existe = false;
                }
            }
            
            if (existe == false) {
                listaDeMacros.add(new Macro(nome, texto));
                System.out.println("Macro: " + nome + " adcionada com sucesso.");
            }
        }

        //salva no arquivo TXT
        try {
            write();
        } catch (IOException ex) {
            Logger.getLogger(HandleMacros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private boolean verificaSeEstaVazio(){
        
        try {
            FileReader fileReader = new FileReader(caminho + "macros.txt");
            Scanner sc = new Scanner(fileReader);
            if(sc.hasNextLine() == false){
                System.out.println("lista de macros esta vazia");
                return true;
            }
            fileReader.close();
            sc.close();
            
            
        } catch (FileNotFoundException  ex) {
            Logger.getLogger(HandleBotoes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HandleBotoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }

    public void read() throws IOException, NullPointerException {
        System.out.println("entrou no metodo read()");
        
        listaDeMacros = new ArrayList<>();
        
        FileReader fileReader = new FileReader(caminho + "macros.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String data = "";
        String[] aux = {""};
        String nome = "";
        String texto = "";
        
        if(verificaSeEstaVazio() == true) return;
        
        while ((data = reader.readLine()) != null) {
            //aux = data.split(":");
            aux = data.split(simboloDivisor);
            nome = aux[0];
            texto = aux[1];
            listaDeMacros.add(new Macro(nome, texto));
            System.out.println("lido " + nome);
        }
        
        fileReader.close();
            reader.close();
    }

    public void write() throws IOException, NullPointerException {
        System.out.println("entrou no metodo write()");
        
        File arquivo = new File(caminho + "macros.txt");
        if (listaDeMacros != null) {
            try (FileWriter fw = new FileWriter(arquivo)) {
                
                for (Macro macro : listaDeMacros) {
                    fw.write(macro.getNome() + simboloDivisor + macro.getTexto());
                    fw.write("\n");//  pula 1 linha
                    System.out.println("escreveu na lista: " + macro.getNome());
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }else{
            JOptionPane.showMessageDialog(null, "A lista esta vazia, nada para escrever");
        }
    }

}
