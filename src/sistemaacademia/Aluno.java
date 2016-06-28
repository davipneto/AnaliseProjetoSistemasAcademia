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
public class Aluno extends Pessoa {
    
    private int matricula;
    private String situacao;
    private String dataMatricula;
    private String dataCancelamento;
    private int senha;
    private int turma;

    public Aluno(int turma,int matricula, String situacao, String dataMatricula, String dataCancelamento, int senha, String nome, String dataDeNascimento, char sexo, String estadoCivil, int telefone1, int telefone2, String endereco, int numero, String complemento, String bairro, int cep, String cidade, int rg, long cpf, String imagem, String email) {
        super(nome, dataDeNascimento, sexo, estadoCivil, telefone1, telefone2, endereco, numero, complemento, bairro, cep, cidade, rg, cpf, imagem, email);
        this.matricula = matricula;
        this.situacao = situacao;
        this.dataMatricula = dataMatricula;
        this.dataCancelamento = dataCancelamento;
        this.senha = senha;
        this.turma = turma;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
