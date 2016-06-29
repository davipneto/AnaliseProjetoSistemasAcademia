/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemaacademia.Aluno;
import sistemautilitario.ClassConexao;

/**
 *
 * @author davip
 */
public class ClassDaoAluno {
    private final Connection conexao;
    public ClassDaoAluno() throws ClassNotFoundException, SQLException {
         this.conexao = ClassConexao.getConexao();
    }
    
    public void incluir (Aluno aluno) throws SQLException{
        //modificar essa linha de acordo com o construido no banco de dados    
        String sqlincluir = "insert into aluno (Nome, DataNascimento, Sexo, EstadoCivil, Telefone1, Telefone2, Endereco, "
                + "Numero, Complemento, Bairro,CEP,Cidade, RG, CPF,Imagem, email, Matricula,Situacao,DataMatricula,DataCancelamento,Senha)"+
                                                      "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement smt = conexao.prepareStatement(sqlincluir);
            smt.setString (1, aluno.getNome());
            smt.setString (2, aluno.getDataDeNascimento());
            smt.setString (3, String.valueOf(aluno.getSexo()));
            smt.setString (4, aluno.getEstadoCivil());
            smt.setString (5, aluno.getTelefone1());
            smt.setString (6, aluno.getTelefone2());
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
            smt.setInt    (17,aluno.getMatricula());
            smt.setString (18,aluno.getSituacao());
            smt.setString (19,aluno.getDataMatricula());
            smt.setString (20,aluno.getDataCancelamento());
            smt.setInt    (21,aluno.getSenha());
            smt.executeUpdate();
            smt.close();
            conexao.close();
    }

    public void alterar(Aluno aluno) throws SQLException{
        String sqlalterar = "update aluno set Nome=?, DataNascimento=?, Sexo=?, EstadoCivil=?, Telefone1=?, Telefone2=?,"
                + " Endereco=?, Numero=?,Complemento=?, Bairro=?,CEP=?, Cidade=?, RG=?, CPF=?, "
                + "Imagem=?, email=?,Matricula=?,Situacao=?, DataMatricula=?,DataCancelamento=?,Senha=? where CPF=?";
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
            smt.setInt    (17,aluno.getMatricula());
            smt.setString (18,String.valueOf(aluno.getSituacao().charAt(0)));
            smt.setString (19,aluno.getDataMatricula());
            smt.setString (20,aluno.getDataCancelamento());
            smt.setInt    (21,aluno.getSenha());
            smt.setString (22,String.valueOf(aluno.getCpf()));
            smt.executeUpdate();
            smt.close();
            conexao.close();
    }
    
    public void consultar(Aluno aluno) throws SQLException{
        String sql = "SELECT * FROM aluno WHERE CPF=" + String.valueOf(aluno.getCpf());
        PreparedStatement ptm = this.conexao.prepareStatement(sql);
        ResultSet rs = ptm.executeQuery();
        while(rs.next()){
            aluno.setNome(rs.getString("Nome"));
            aluno.setDataDeNascimento(rs.getString("DataNascimento"));
            aluno.setSexo(rs.getString("Sexo").charAt(0));
            aluno.setEstadoCivil(rs.getString("EstadoCivil"));
            aluno.setTelefone1(rs.getString("Telefone1"));
            aluno.setTelefone2(rs.getString("Telefone2"));
            aluno.setEndereco(rs.getString("Endereco"));
            aluno.setNumero(rs.getInt("Numero"));
            aluno.setComplemento(rs.getString("Complemento"));
            aluno.setBairro(rs.getString("Bairro"));
            aluno.setCep(rs.getInt("CEP"));
            aluno.setCidade(rs.getString("Cidade"));
            aluno.setRg(rs.getInt("RG"));
            aluno.setImagem(rs.getString("Imagem"));
            aluno.setEmail(rs.getString("email"));
            aluno.setMatricula(rs.getInt("Matricula"));
            aluno.setSituacao(rs.getString("Situacao"));
            aluno.setDataMatricula(rs.getString("DataMatricula"));
            aluno.setDataCancelamento(rs.getString("DataCancelamento"));
            aluno.setSenha(rs.getInt("Senha"));
        }
    }
    
}
