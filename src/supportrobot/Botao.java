/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportrobot;

/**
 *
 * @author Guilherme_Kaercher
 */
public class Botao {
    private String nomeDoBotao;
    private String nomeDaMacro;

    public Botao(String nomeDoBotao, String nomeDaMacro) {
        this.nomeDoBotao = nomeDoBotao;
        this.nomeDaMacro = nomeDaMacro;
    }
    
    

    public String getNomeDoBotao() {
        return nomeDoBotao;
    }

    public void setNomeDoBotao(String nomeDoBotao) {
        this.nomeDoBotao = nomeDoBotao;
    }

    public String getNomeDaMacro() {
        return nomeDaMacro;
    }

    public void setNomeDaMacro(String nomeDaMacro) {
        this.nomeDaMacro = nomeDaMacro;
    }

    
    
    
    
}
