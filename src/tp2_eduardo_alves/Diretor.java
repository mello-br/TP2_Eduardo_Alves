/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eduardo_alves;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alu201715378
 */
public class Diretor extends Professor {

    private String senha;
    private int cont=0;

    public Diretor(String senha, double CargaHoraria, double salario, String nome, int idade) {
        super(CargaHoraria, salario, nome, idade);
        this.senha = senha;
    }

    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    
    
    public String MostrarInformaçoes(Diretor d) {
        String a="=== DIRETOR ==="+"\nNome: " +d.getNome()+"\nIdade: " + d.getIdade() +"\nCarga Horária: " +d.getCargaHoraria()+"\nSalário: R$" + d.getSalario();
        return a;
    }

    
   
}
