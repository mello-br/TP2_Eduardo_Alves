/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eduardo_alves;

import java.util.ArrayList;

/**
 *
 * @author alu201715378
 */
public class Crianca extends Pessoa {
    private String responsaveis;
    private String aniversario; 
    private ArrayList <Atividades> atividadesF= new ArrayList() ;

    public Crianca(String responsaveis, String aniversario, String nome, int idade) {
        super(nome, idade);
        this.responsaveis = responsaveis;
        this.aniversario = aniversario;
    }

    
    public String getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(String responsaveis) {
        this.responsaveis = responsaveis;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getAtividadesF() {
        String a="";
        for(Atividades aux:atividadesF){
            a+="\n"+aux.getDefinicao();
        }
        return a;
    }

    public void addAtividadesF(Atividades atividades) {
        atividadesF.add(atividades);
    }
    
    
    public int darParabens(Crianca c){
        int aux=c.getIdade();
        c.setIdade(aux+1);
        return aux+1;
    }
    
    public String MostrarInformaçoes(Crianca c) {
        String a="=== CRIANÇAS ==="+"\nNome: " +c.getNome()+"\nIdade: " + c.getIdade()+"\nResponsaveis: "+c.getResponsaveis()+"\n Aniversario: "+c.getAniversario();
        return a;
    }

    
}
