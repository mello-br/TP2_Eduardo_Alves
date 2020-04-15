/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eduardo_alves;

import java.util.ArrayList;

/**
 *
 * @author Elaine
 */
public class Atividades {
    private Professor professor;
    private String definicao;

    public Atividades(Professor professor, String definicao) {
        this.professor = professor;
        this.definicao = definicao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }
    
    
    
}
