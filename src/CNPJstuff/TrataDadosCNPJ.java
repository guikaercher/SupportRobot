/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CNPJstuff;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


/**
 *
 * @author Guilherme
 */
public class TrataDadosCNPJ{
    
    private String s = "";
    private String cnpj= "";
    //private String cnpj= "27865757000102";
    public void recebeDados(String cnpjRecebido){
                     
        String aux = cnpjRecebido;
        
        aux = aux.replace(" ", "");
        aux = aux.replace(",", "");
        aux = aux.replace(".", "");
        aux = aux.replace("/", "");
        aux = aux.replace("-", "");
        aux = aux.replace(":", "");
        
        if(aux.length() < 14 || aux.length() > 14) return;//return "CNPJ diferente de 14 digitos";
        
        ClientWithResponseHandler client = new ClientWithResponseHandler(aux);
        //Thread t = new Thread(client);
        client.run();
        this.cnpj = client.getDadosColetados();
        //return client.getDadosColetados();
    }
    //recebe por parametro o dado para buscar
    public String trataDado(String dado){
        //String recebido = recebeDados(cnpj);
        String recebido = this.cnpj;
        String[] aux = null;
        aux = recebido.split(",");
        String teste = "NADA";
        
        for (String string : aux) {
            if(string.contains(dado)){
                aux = string.split("//n");
                teste = aux[0];
                
                //separa apenas a informação 
                aux = teste.split(dado);
                teste = aux[1];
                teste = teste.replace(":", "");
                teste = teste.replace("\"", "");
                teste = teste.trim();
                 
                 
                return teste;
            }
        }
        
//        for (String string : aux) {
//            System.out.println(string);
//        }
        
        return "nao encontrou este CNPJ";
    }
    
}
