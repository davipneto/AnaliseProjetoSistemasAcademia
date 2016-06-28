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
public class FichadeFrequencia {
    
    private Aluno aluno;
    private List<ItemFichaFrequencia> item;

    public List<ItemFichaFrequencia> getItem() {
        return item;
    }

    public void setItem(List<ItemFichaFrequencia> item) {
        this.item = item;
    }

    public FichadeFrequencia(Aluno aluno, List<ItemFichaFrequencia> item) {
        this.aluno = aluno;
        this.item = item;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
