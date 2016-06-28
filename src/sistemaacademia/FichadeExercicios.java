/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademia;

import java.util.List;

/**
 *
 * @author davip
 */
public class FichadeExercicios {
    
    private Aluno aluno;
    private Professor professor;
    private String dataCadastro;
    private List<Exercicio> exercicios;

    public FichadeExercicios(Aluno aluno, Professor professor, String dataCadastro, List<Exercicio> exercicios) {
        this.aluno = aluno;
        this.professor = professor;
        this.dataCadastro = dataCadastro;
        this.exercicios = exercicios;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
    
    
    
}
