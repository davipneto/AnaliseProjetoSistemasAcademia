/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistemaacademia.Secretario;
import sistemautilitario.ClassConexao;

/**
 *
 * @author davip
 */
public class ClassDaoSecretario {
    
    private final Connection conexao;
    public ClassDaoSecretario() throws ClassNotFoundException, SQLException {
         this.conexao = ClassConexao.getConexao();
    }
    
    public void incluir (Secretario aluno) throws SQLException{
        //modificar essa linha de acordo com o construido no banco de dados    
        String sqlincluir = "insert into secretario (Nome, DatadeNascimento, Sexo, EstadoCivil, Telefone1, Telefone2, Endereco, "
                + "Numero, Complemento, Bairro,CEP,Cidade, RG, CPF,Imagem, email, DatadeAdmissao,Senha)"+
                                                      "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement smt = conexao.prepareStatement(sqlincluir);
            smt.setString (1, aluno.getNome());
            smt.setString (2, aluno.getDataDeNascimento());
            smt.setString (3, String.valueOf(aluno.getSexo()));
            smt.setString (4, aluno.getEstadoCivil());
            smt.setString (5, String.valueOf(aluno.getTelefone1()));
            smt.setString (6, String.valueOf(aluno.getTelefone2()));
            smt.setString (7, aluno.getEndereco());
            smt.setInt    (8, aluno.getNumero());
            smt.setString (9, aluno.getComplemento());
            smt.setString (10,aluno.getBairro());
            smt.setString (11,String.valueOf(aluno.getCep()));
            smt.setString (12,aluno.getCidade());
            smt.setString (13,String.valueOf(aluno.getRg()));
            smt.setString (14,String.valueOf(aluno.getCpf()));
            smt.setString (15,aluno.getImagem());
            smt.setString (16,aluno.getEmail());
            smt.setString (17,aluno.getDataAdmissao());
            smt.setString (18,aluno.getSenha());
            smt.executeUpdate();
            smt.close();
            conexao.close();
    }

    public void alterar(Secretario aluno) throws SQLException{
        String sqlalterar = "update professor set Nome=?, DataNascimento=?, Sexo=?, EestadoCivil=?, Telefone1=?, Telefone2=?,"
                + " Endereco=?, Numero=?,Complemento=?, Bairro=?,CEP=?, Cidade=?, RG=?, CPF=?, "
                + "Imagem=?, email=?, DatadeAdmissao=?,Senha=?, where Nome=?";
            PreparedStatement smt = conexao.prepareStatement(sqlalterar);
            smt.setString (1, aluno.getNome());
            smt.setString (2, aluno.getDataDeNascimento());
            smt.setString (3, String.valueOf(aluno.getSexo()));
            smt.setString (4, aluno.getEstadoCivil());
            smt.setString (5, String.valueOf(aluno.getTelefone1()));
            smt.setString (6, String.valueOf(aluno.getTelefone2()));
            smt.setString (7, aluno.getEndereco());
            smt.setInt    (8, aluno.getNumero());
            smt.setString (9, aluno.getComplemento());
            smt.setString (10,aluno.getBairro());
            smt.setString (11,String.valueOf(aluno.getCep()));
            smt.setString (12,aluno.getCidade());
            smt.setString (13,String.valueOf(aluno.getRg()));
            smt.setString (14,String.valueOf(aluno.getCpf()));
            smt.setString (15,aluno.getImagem());
            smt.setString (16,aluno.getEmail());
            smt.setString (17,aluno.getDataAdmissao());
            smt.setString    (18,aluno.getSenha());
            smt.executeUpdate();
            smt.close();
            conexao.close();
    }
    
}
