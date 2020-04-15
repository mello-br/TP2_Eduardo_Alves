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
public class TP2_Eduardo_Alves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom;
        String opp="", op="";
        boolean achou=false, achouN=false;
        String name=JOptionPane.showInputDialog("Diretor(a), digite seu nome: ");
        
        String aux=JOptionPane.showInputDialog("Diretor(a), digite sua idade: ");
        int idad=Integer.parseInt(aux);
        
        aux=JOptionPane.showInputDialog(null, "Diretor(a), digite sua carga horaria: ");
        double carga=Double.parseDouble(aux);
        
        aux=JOptionPane.showInputDialog(null, "Diretor(a), digite seu salário:  ");
        double salari=Double.parseDouble(aux);        
        
        String senha=JOptionPane.showInputDialog("Diretor(a), digite sua senha: ");
        
        Diretor diretor=new Diretor( senha, carga, salari, name, idad);
                    
        ArrayList<Professor> professores= new ArrayList();
        ArrayList<Turma> turmas= new ArrayList();
        ArrayList<Crianca> criancas= new ArrayList();
        do{
            senha=JOptionPane.showInputDialog("Diretor(a), digite sua senha para entrar no sistema: ");
            if(!senha.equals(diretor.getSenha())) JOptionPane.showMessageDialog(null, "SENHA INCORRETA, TENTE NOVAMENTE!!!");
            else JOptionPane.showMessageDialog(null, "SENHA CORRETA, Seja bem-vindo!!!");
        }while(!senha.equals(diretor.getSenha()));
            do{

            opp=JOptionPane.showInputDialog("========= MENU ========="
                    + "\n1 - MENU DAS CRIANÇAS"
                    + "\n2 - MENU DAS TURMAS"
                    + "\n3 - MENU DOS FUNCIONÁRIOS"
                    + "\n9 - SAIR DO SISTEMA");
            switch(opp){

                case"1":
                        op=JOptionPane.showInputDialog("====== MENU CRIANÇAS ======"
                                + "\n1 - Adicionar criança"
                                + "\n2 - Excluir criança"
                                + "\n3 - Mostrar criança"
                                + "\n4 - Dar parabéns / Fazer aniversário");


                        switch(op){

                            case"1":
                                if(!criancas.isEmpty()){
                                    do{
                                        achou=false;
                                        name=JOptionPane.showInputDialog(null, "Digite o nome da criança: ");
                                        for(Crianca aux25:criancas){
                                            if(name.equals(aux25.getNome())){
                                                JOptionPane.showMessageDialog(null, "NOME JÁ CADASTRADO, DIGITE COM SOBRENOME!!!");
                                                achou=true;
                                                break;
                                            }
                                        }if(!achou){ 
                                            aux=JOptionPane.showInputDialog(null, "Digite a idade da criança: ");
                                            idad=Integer.parseInt(aux);
                                            String pais=JOptionPane.showInputDialog(null, "Digite o nome dos pais da criança: ");
                                            String aniver=JOptionPane.showInputDialog(null, "Digite a data de nascimento da criança: ");

                                            Crianca novac= new Crianca(pais, aniver, name,idad );
                                            criancas.add(novac);
                                            JOptionPane.showMessageDialog(null, "CRIANÇA CADASTRADA COM SUCESSO!!!");
                                            break;
                                        }
                                    }while(achou);
                                    
                                    break;
                                }else{
                                    name=JOptionPane.showInputDialog(null, "Digite o nome da criança: ");
                                    aux=JOptionPane.showInputDialog(null, "Digite a idade da criança: ");
                                    idad=Integer.parseInt(aux);
                                    String pais=JOptionPane.showInputDialog(null, "Digite o nome dos pais da criança: ");
                                    String aniver=JOptionPane.showInputDialog(null, "Digite a data de nascimento da criança: ");

                                    Crianca novac= new Crianca(pais, aniver, name,idad );
                                    criancas.add(novac);
                                    JOptionPane.showMessageDialog(null, "CRIANÇA CADASTRADA COM SUCESSO!!!");
                                    break;
                                }
                          
                            case"2":
                                achou=false;
                                nom=JOptionPane.showInputDialog(null, "Digite o nome da criança: ");
                                for(Crianca aux25:criancas){
                                    if(nom.equals(aux25.getNome())){
                                        criancas.remove(aux25);
                                        JOptionPane.showMessageDialog(null, "CRIANÇA EXCLUÍDA COM SUCESSO!!!");
                                        achou=true;
                                        break;
                                    }
                                }if(!achou) JOptionPane.showMessageDialog(null, "CRIANÇA NÃO ENCONTRADA!!!");
                                break;

                            case "3":
                                achou=false;
                                nom=JOptionPane.showInputDialog(null, "Digite o nome da criança: ");
                                for(Crianca aux25:criancas){
                                    if(nom.equals(aux25.getNome())){
                                        JOptionPane.showMessageDialog(null, aux25.MostrarInformaçoes(aux25));
                                        achou=true;
                                    }
                                }if(!achou) JOptionPane.showMessageDialog(null, "CRIANÇA NÃO ENCONTRADA!!!");
                                break;
                                
                            case"4":
                                achou=false;
                                nom=JOptionPane.showInputDialog(null, "Digite o nome da criança: ");
                                for(Crianca aux25:criancas){
                                    if(nom.equals(aux25.getNome())){
                                        JOptionPane.showMessageDialog(null, "PARABÈNS "+nom+" POR FAZER "+ aux25.darParabens(aux25)+" ANOS");
                                        achou=true;
                                    }
                                }if(!achou) JOptionPane.showMessageDialog(null, "CRIANÇA NÃO ENCONTRADA!!!");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!!!");
                                break;
                        }
                        break;

                case"2":
                        op=JOptionPane.showInputDialog("====== MENU TURMAS ======"
                                + "\n1 - Criar turma"
                                + "\n2 - Excluir turma"
                                + "\n3 - Adicionar criança à turma"
                                + "\n4 - Retirar criança da turma"
                                + "\n5 - Distribuir atividade para a turma"
                                + "\n6 - Mostrar turma");
                        switch(op){
                            case "1":
                                achou=false;
                                Professor aux2 = null;
                                if(!turmas.isEmpty()){
                                    do{
                                        achouN=false;
                                        nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                        for(Turma aux25:turmas){
                                            if(nom.equals(aux25.getNomeT())){
                                                JOptionPane.showMessageDialog(null, "TURMA JÁ CADASTRADA, DIGITE OUTRO NOME!!!");
                                                achouN=true;
                                                break;
                                            }
                                        }if(!achouN){ 
                                            nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                            String responsavel=JOptionPane.showInputDialog(null, "Digite o nome do professor responsável: ");

                                            for(Professor aux20:professores){
                                                if(responsavel.equals(aux20.getNome())){
                                                    aux2=aux20;
                                                    achou=true;
                                                }
                                            }

                                            if(achou){            
                                                Turma nova= new Turma(nom,aux2);
                                                turmas.add(nova);
                                                JOptionPane.showMessageDialog(null, "TURMA CADASTRADA COM SUCESSO!!!");
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Professor não encontrado, TURMA NÃO CADASTRADA!!!");
                                            }
                                            break;
                                        }
                                    }while(achouN);
                                    break;

                                }

                                nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                String responsavel=JOptionPane.showInputDialog(null, "Digite o nome do professor responsável: ");

                                for(Professor aux20:professores){
                                    if(responsavel.equals(aux20.getNome())){
                                        aux2=aux20;
                                        achou=true;
                                    }
                                }

                                if(achou){            
                                    Turma nova= new Turma(nom,aux2);
                                    turmas.add(nova);
                                    JOptionPane.showMessageDialog(null, "TURMA CADASTRADA COM SUCESSO!!!");

                                }else{
                                    JOptionPane.showMessageDialog(null, "Professor não encontrado, TURMA NÃO CADASTRADA!!!");
                                }
                                break;

                            case "2":
                                nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                for(Turma aux23:turmas){
                                    if(nom.equals(aux23.getNomeT())){
                                        turmas.remove(aux23);
                                        JOptionPane.showMessageDialog(null, "TURMA EXCLUÍDA COM SUCESSO!!!");
                                        break;
                                    }
                                } 
                                if (!achou)JOptionPane.showMessageDialog(null, "TURMA NÃO ENCONTRADA!!!");
                                break;

                            case"3":
                                achou=false;
                                Turma t=null;
                                nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                for(Turma aux23:turmas){
                                    if(nom.equals(aux23.getNomeT())){
                                        achou=true;
                                        t=aux23;
                                    }
                                }if(!achou) {
                                    JOptionPane.showMessageDialog(null, "TURMA NÃO ENCONTRADA!!!");
                                    break;
                                }else{
                                    achou=false;
                                    nom=JOptionPane.showInputDialog(null, "Digite o nome da criança a ser colocada na turma "+t.getNomeT()+": ");
                                    for(Crianca aux25:criancas){
                                        if(nom.equals(aux25.getNome())){
                                            t.addCrianca(aux25, t);
                                            achou=true;
                                        }
                                    }if(!achou) JOptionPane.showMessageDialog(null, "CRIANÇA NÃO ENCONTRADA!!!");
                                    break;
                                }

                            case "4":
                                achou=false;
                                t=null;
                                nom=JOptionPane.showInputDialog(null, "Digite o nome da turma da criança a ser excluída: ");
                                for(Turma aux23:turmas){
                                    if(nom.equals(aux23.getNomeT())){
                                        achou=true;
                                        t=aux23;
                                    }
                                }if(!achou) {
                                    JOptionPane.showMessageDialog(null, "TURMA NÃO ENCONTRADA!!!");
                                    break;
                                }else{
                                    achou=false;
                                    nom=JOptionPane.showInputDialog(null, "Digite o nome da criança a ser excluída da turma "+t.getNomeT()+": ");
                                    for(Crianca aux25:criancas){
                                        if(nom.equals(aux25.getNome())){
                                            t.excluirCrianca(aux25);
                                            achou=true;
                                        }
                                    }if(!achou) JOptionPane.showMessageDialog(null, "CRIANÇA NÃO ENCONTRADA!!!");
                                    break;
                                }
                                
                                case"5":
                                    achou=false;
                                    t=null;
                                    nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                    for(Turma aux23:turmas){
                                        if(nom.equals(aux23.getNomeT())){
                                            achou=true;
                                            t=aux23;
                                        }
                                    }if(!achou) {
                                        JOptionPane.showMessageDialog(null, "TURMA NÃO ENCONTRADA!!!");
                                        break;
                                    }else{
                                        String definicao=JOptionPane.showInputDialog("Escreva a definição da atividade: ");
        
                                        Atividades aux30= new Atividades(t.getResponsavel(),definicao) ;
                                        if(turmas.isEmpty()) JOptionPane.showMessageDialog(null, "Não há nenhuma turma cadastrada!!!");
                                        else{
                                            for(Crianca aux31:t.getTurma()){
                                                t.addAtividadesT(aux30);
                                                aux31.addAtividadesF(aux30);
                                            }
                                        }
                                        JOptionPane.showMessageDialog(null, "Atividade distribuída para a turma!");
                                        break;
                                    }
                                    
                                
                                case"6":
                                    if(turmas.isEmpty()) JOptionPane.showMessageDialog(null, "NÃO HÁ NENHUMA TURMA CADASTRADA!!!");
                                    else{
                                        achou=false;
                                        t=null;
                                        nom=JOptionPane.showInputDialog(null, "Digite o nome da turma: ");
                                        for(Turma aux23:turmas){
                                            if(nom.equals(aux23.getNomeT())){
                                                achou=true;
                                                t=aux23;
                                            }
                                        }

                                        JOptionPane.showMessageDialog(null, t.mostrarTurma(t));
                                        break;
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!!!");
                                    break;


                        }

                    break;

                case"3":
                    op=JOptionPane.showInputDialog("====== MENU FUNCIONÁRIOS ======"
                                + "\n1 - Adicionar funcionário"
                                + "\n2 - Excluir funcionário"
                                + "\n3 - Mostrar funcionário");
                    switch(op){
                        case "1":
                            if(professores.isEmpty()){
                                do{
                                    achou=false;
                                    name=JOptionPane.showInputDialog(null, "Digite o nome do(a) novo(a) professor(a): ");
                                    for(Crianca aux25:criancas){
                                        if(name.equals(aux25.getNome())){
                                            JOptionPane.showMessageDialog(null, "NOME JÁ CADASTRADO, DIGITE COM SOBRENOME!!!");
                                            achou=true;
                                            break;
                                        }
                                    }if(!achou){ 
                                        aux=JOptionPane.showInputDialog(null, "Digite a idade do(a) novo(a) professor(a): ");
                                        idad=Integer.parseInt(aux);
                                        aux=JOptionPane.showInputDialog(null, "Digite a carga horaria do(a) novo(a) professor(a): ");
                                        carga=Double.parseDouble(aux);
                                        aux=JOptionPane.showInputDialog(null, "Digite o salário do(a) novo(a) professor(a): ");
                                        salari=Double.parseDouble(aux);

                                        Professor novo =new Professor(carga,salari,name,idad);
                                        professores.add(novo);
                                        break;
                                    }
                                }while(achou);
                                break;
                            }else{
                                name=JOptionPane.showInputDialog(null, "Digite o nome do(a) novo(a) professor(a): ");
                                aux=JOptionPane.showInputDialog(null, "Digite a idade do(a) novo(a) professor(a): ");
                                idad=Integer.parseInt(aux);
                                aux=JOptionPane.showInputDialog(null, "Digite a carga horaria do(a) novo(a) professor(a): ");
                                carga=Double.parseDouble(aux);
                                aux=JOptionPane.showInputDialog(null, "Digite o salário do(a) novo(a) professor(a): ");
                                salari=Double.parseDouble(aux);

                                Professor novo =new Professor(carga,salari,name,idad);
                                professores.add(novo);
                                break;
                            }
                            
                        case"2":
                            achou=false;
                            nom=JOptionPane.showInputDialog(null, "Digite o nome do funcionário: ");
                            for(Professor aux24:professores){
                                if(nom.equals(aux24.getNome())){
                                    professores.remove(aux24);
                                    achou=true;
                                    JOptionPane.showMessageDialog(null, "FUNCIONÁRIO EXCLUÍDO COM SUCESSO!!!");
                                    break;
                                    
                                }
                            }if(!achou)JOptionPane.showMessageDialog(null, "FUNCIONÁRIO NÃO ENCONTRADO!!!");
                        break;

                        case"3":
                            achou=false;
                            nom=JOptionPane.showInputDialog(null, "Digite o nome do funcionário: ");
                            for(Professor aux24:professores){
                                if(nom.equals(aux24.getNome())){
                                    achou=true;
                                    JOptionPane.showMessageDialog(null,aux24.MostrarInformaçoes(aux24));
                                }
                            }if(!achou)JOptionPane.showMessageDialog(null, "FUNCIONÁRIO NÃO ENCONTRADO!!!");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!!!");
                            break;   

                    }
                    break;
                    
                case"9":
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!!!");
                    break;  
                
                }
            }while(!opp.equals("9"));
        }
}
