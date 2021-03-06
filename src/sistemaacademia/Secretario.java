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
import sistemadao.ClassDaoSecretario;

/**
 *
 * @author davip
 */
public class Secretario extends Pessoa {
    
    private String dataAdmissao;
    private String senha;
    
    public Secretario(){
        super();
    }

    public Secretario(String dataAdmissao, String senha, String nome, String dataDeNascimento, char sexo, String estadoCivil, String telefone1, String telefone2, String endereco, int numero, String complemento, String bairro, int cep, String cidade, int rg, long cpf, String imagem, String email) {
        super(nome, dataDeNascimento, sexo, estadoCivil, telefone1, telefone2, endereco, numero, complemento, bairro, cep, cidade, rg, cpf, imagem, email);
        this.dataAdmissao = dataAdmissao;
        this.senha = senha;
    }
    
    public void cadastraSecr(){
        try {
            ClassDaoSecretario secrDao = new ClassDaoSecretario();
            secrDao.incluir(this);
            JOptionPane.showMessageDialog(null,"Secretário Cadastrado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void consultaSecr(){
        try {
            ClassDaoSecretario secrDao = new ClassDaoSecretario();
            secrDao.consultar(this);
            //JOptionPane.showMessageDialog(null,"Cadastro Realizado Com Sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alteraSecr(){
        try {
            ClassDaoSecretario secrDao = new ClassDaoSecretario();
            secrDao.alterar(this);
            JOptionPane.showMessageDialog(null,"Dados Alterados");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
