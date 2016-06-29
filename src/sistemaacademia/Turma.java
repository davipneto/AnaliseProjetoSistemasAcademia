/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademia;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemadao.ClassDaoTurma;

/**
 *
 * @author davip
 */
public class Turma {
    
    private String Modalidade;
    private String HorarioIni;
    private String HorarioFim;
    private int professor;
    private int maxAlunos;
    private boolean segunda;
    private boolean terca;
    private boolean quarta;
    private boolean quinta;
    private boolean sexta;
    
    public Turma(){
        
    }
    
    public Turma(String Modalidade, String HorarioIni, String HorarioFim, int professor, int maxAlunos, boolean segunda,
            boolean terca,boolean quarta,boolean quinta, boolean sexta) {
        this.Modalidade = Modalidade;
        this.HorarioIni = HorarioIni;
        this.HorarioFim = HorarioFim;
        this.professor = professor;
        this.maxAlunos = maxAlunos;
        this.segunda = segunda;
        this.terca = terca;
        this.quarta = quarta;
        this.quinta = quinta;
        this.sexta = sexta;
    }
    
    public void cadastraTurma(){
        try {
            ClassDaoTurma turmaDao = new ClassDaoTurma();
            turmaDao.incluir(this);
            JOptionPane.showMessageDialog(null,"Cadastro Realizado Com Sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void consultaTurma(){
        try {
            ClassDaoTurma turmaDao = new ClassDaoTurma();
            turmaDao.consultar(this);
            //JOptionPane.showMessageDialog(null,"Cadastro Realizado Com Sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alteraTurma(){
        try {
            ClassDaoTurma turmaDao = new ClassDaoTurma();
            turmaDao.alterar(this);
            JOptionPane.showMessageDialog(null,"Alteração Realizada Com Sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isSegunda() {
        return segunda;
    }

    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }

    public boolean isTerca() {
        return terca;
    }

    public void setTerca(boolean terca) {
        this.terca = terca;
    }

    public boolean isQuarta() {
        return quarta;
    }

    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }

    public boolean isQuinta() {
        return quinta;
    }

    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }

    public boolean isSexta() {
        return sexta;
    }

    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
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

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }
    
    
    
}
