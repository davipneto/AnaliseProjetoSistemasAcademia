/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademia;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemadao.ClassDaoProfessor;

/**
 *
 * @author davip
 */
public class Professor extends Pessoa {
    
    private String DataAdmissao;
    private String senha;

    public Professor(String DataAdmissao, String senha, String nome, String dataDeNascimento, char sexo, String estadoCivil, String telefone1, String telefone2, String endereco, int numero, String complemento, String bairro, int cep, String cidade, int rg, long cpf, String imagem, String email) {
        super(nome, dataDeNascimento, sexo, estadoCivil, telefone1, telefone2, endereco, numero, complemento, bairro, cep, cidade, rg, cpf, imagem, email);
        this.DataAdmissao = DataAdmissao;
        this.senha = senha;
    }

    public Professor() {
        super();
    }
    
    public void cadastraProf(){
        try {
            ClassDaoProfessor profDao = new ClassDaoProfessor();
            profDao.incluir(this);
            JOptionPane.showMessageDialog(null,"Cadastro Realizado Com Sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}