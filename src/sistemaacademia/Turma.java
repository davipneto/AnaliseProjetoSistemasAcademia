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
public class Turma {
    
    private String Modalidade;
    private String HorarioIni;
    private String HorarioFim;
    private List<String> diasSemana;
    private Professor professor;

    public Turma(String Modalidade, String HorarioIni, String HorarioFim, List<String> diasSemana, Professor professor) {
        this.Modalidade = Modalidade;
        this.HorarioIni = HorarioIni;
        this.HorarioFim = HorarioFim;
        this.diasSemana = diasSemana;
        this.professor = professor;
    }

    public String getModalidade() {
        return Modalidade;
    }

    public void setModalidade(String Modalidade) {
        this.Modalidade = Modalidade;
    }

    public String getHorarioIni() {
        return HorarioIni;
    }

    public void setHorarioIni(String HorarioIni) {
        this.HorarioIni = HorarioIni;
    }

    public String getHorarioFim() {
        return HorarioFim;
    }

    public void setHorarioFim(String HorarioFim) {
        this.HorarioFim = HorarioFim;
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(List<String> diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
}
