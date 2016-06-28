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
public class Pessoa {
    
    private String nome;
    private String dataDeNascimento;
    private char sexo;
    private String estadoCivil;
    private int telefone1;
    private int telefone2;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private int cep;
    private String cidade;
    private int rg;
    private long cpf;
    private String imagem;
    private String email;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String dataDeNascimento, char sexo, String estadoCivil, int telefone1, int telefone2, String endereco, int numero, String complemento, String bairro, int cep, String cidade, int rg, long cpf, String imagem, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.rg = rg;
        this.cpf = cpf;
        this.imagem = imagem;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public int getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public int getRg() {
        return rg;
    }

    public long getCpf() {
        return cpf;
    }

    public String getImagem() {
        return imagem;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
