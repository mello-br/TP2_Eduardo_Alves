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
public class Turma {
    private String nomeT;
    private Professor responsavel;
    private ArrayList<Crianca>turma= new ArrayList();
    private ArrayList<Atividades>atividadesT= new ArrayList();

    public Turma(String nomeT, Professor responsavel) {
        this.nomeT = nomeT;
        this.responsavel = responsavel;
    }

    public ArrayList<Crianca> getTurma() {
        return turma;
    }

    public ArrayList<Atividades> getAtividadesT() {
        return atividadesT;
    }
    
    public void addAtividadesT(Atividades a){
        atividadesT.add(a);
    } 

    public String getNomeT() {
        return nomeT;
    }

    public void setNomeT(String nomeT) {
        this.nomeT = nomeT;
    }

    public Professor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Professor responsavel) {
        this.responsavel = responsavel;
    }
        
    
    
    public void addCrianca(Crianca c, Turma t){
        if(t.turma.size()<=20){
            t.turma.add(c);
        }else JOptionPane.showMessageDialog(null, "Turma cheia!!!");
    }
    
    public void excluirCrianca(Crianca c){
        if(turma.isEmpty()){
            JOptionPane.showMessageDialog(null, "Turma vazia!!!");
        }else turma.remove(c);
    }
    
    public String mostrarTurma(Turma t){
        if(t.turma.isEmpty()){
            JOptionPane.showMessageDialog(null, "Turma vazia!!!");
            return null;
        }else{
            Professor p=t.getResponsavel();
            String a="Responsavel = "+p.getNome()+"\n=== CRIANÇAS ===";
            for(Crianca aux:t.turma){
                a+="\nNome = "+aux.getNome()+"\nIdade = "+aux.getIdade()+"\nAniversário = "+aux.getAniversario()+"\nPais = "+aux.getResponsaveis()+"\nAtividades feitas = "+aux.getAtividadesF();
            }
            return a;
        }
        
        
    }
    
}
