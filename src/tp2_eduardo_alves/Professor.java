/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eduardo_alves;


/**
 *
 * @author alu201715378
 */
public class Professor extends Pessoa {
    private double CargaHoraria;
    private double salario;    

    public Professor(double CargaHoraria, double salario, String nome, int idade) {
        super(nome, idade);
        this.CargaHoraria = CargaHoraria;
        this.salario = salario;
    }

    

    public double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(double CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    public String MostrarInformaçoes(Professor p) {
        String a="=== FUNCIONÁRIO ==="
                +"\nNome: "+p.getNome()
                +"\nIdade: "+ p.getIdade() 
                +"\nCarga Horária: "+ p.getCargaHoraria()
                +"\nSalário: R$"+ p.getSalario();
        return a;
    }
    
    
}
