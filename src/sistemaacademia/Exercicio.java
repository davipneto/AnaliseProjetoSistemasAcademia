/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademia;

/**
 *
 * @author davip
 */
public class Exercicio {
    
    private String Nome;
    private int numRepeticoes;
    private int numSeries;

    public Exercicio(String Nome, int numRepeticoes, int numSeries) {
        this.Nome = Nome;
        this.numRepeticoes = numRepeticoes;
        this.numSeries = numSeries;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNumRepeticoes() {
        return numRepeticoes;
    }

    public void setNumRepeticoes(int numRepeticoes) {
        this.numRepeticoes = numRepeticoes;
    }

    public int getNumSeries() {
        return numSeries;
    }

    public void setNumSeries(int numSeries) {
        this.numSeries = numSeries;
    }
    
    
    
}
