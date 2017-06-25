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
 * @author email
 */
public class HandleBotoes {
      
    private static final String caminho = "C:\\SupportRobot\\"; 
    private static final String simboloDivisor = "¬"; 
     private ArrayList<Botao> listaDeBotoes = new ArrayList<>();
     private static HandleBotoes instance = null;
     
     
     public static HandleBotoes getInstance(){
      if(instance == null) {
         instance = new HandleBotoes();
      }
      return instance;
   }
     
    public void adcionaBotao(Botao botao) {

        if (botao != null) {
            boolean existeBotao = false;

            for (Botao b : listaDeBotoes) {
                if (b.getNomeDoBotao().equalsIgnoreCase(botao.getNomeDoBotao())) {
                    b.setNomeDaMacro(botao.getNomeDaMacro());
                    existeBotao = true;
                    System.out.println("botao " + b.getNomeDoBotao() + " ja existe, trocado apenas o nome da macro.");
                    try {
                        write();
                    } catch (IOException | NullPointerException ex) {
                        Logger.getLogger(HandleBotoes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }   

            if (existeBotao == false) {
                listaDeBotoes.add(botao);
                try {
                    write();
                } catch (IOException | NullPointerException ex) {
                    Logger.getLogger(HandleBotoes.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

    public Botao getBotaoPerName(String nome){

         for (Botao botao : listaDeBotoes) {
             if (botao.getNomeDoBotao().equalsIgnoreCase(nome)) {
                 return botao;
             }
         }
         return null;
     }
     
    private boolean verificaSeEstaVazio(){
        
        try {
            FileReader fileReader = new FileReader(caminho + "botoes.txt");
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
     
    public void read() throws IOException, NullPointerException, ArrayIndexOutOfBoundsException {
        System.out.println("entrou no metodo read() Botao");
        
        if(verificaSeEstaVazio() == true) return;//se o arquivo estiver vazio, nem le...

        listaDeBotoes = new ArrayList<>();

        FileReader fileReader = new FileReader(caminho + "botoes.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String data = "";
        String[] aux = {""};
        String nomeBotao = "";
        String nomeMacro = "";

        
        
        
        while ((data = reader.readLine()) != null) {
            aux = data.split(simboloDivisor);
            nomeBotao = aux[0];
            nomeMacro = aux[1];
            listaDeBotoes.add(new Botao(nomeBotao, nomeMacro));
            System.out.println("lido " + nomeBotao);
        }

        fileReader.close();
        reader.close();
    }
     
      public void write() throws IOException, NullPointerException {
        System.out.println("entrou no metodo write()");
        
        File arquivo = new File(caminho + "botoes.txt");
        if (listaDeBotoes != null) {
            try (FileWriter fw = new FileWriter(arquivo)) {
                
                for (Botao botao : listaDeBotoes) {
                    fw.write(botao.getNomeDoBotao() + simboloDivisor + botao.getNomeDaMacro());
                    fw.write("\n");//  pula 1 linha
                    System.out.println("escreveu na lista: " + botao.getNomeDoBotao());
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }else{
            JOptionPane.showMessageDialog(null, "A lista esta vazia, nada para escrever");
        }
    }
    
}
