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
import sistemaacademia.Turma;
import sistemautilitario.ClassConexao;

/**
 *
 * @author davip
 */
public class ClassDaoTurma {
    private final Connection conexao;
    public ClassDaoTurma() throws ClassNotFoundException, SQLException {
         this.conexao = ClassConexao.getConexao();
    }
    
    public void incluir (Turma turma) throws SQLException{
        String sqlincluir = "insert into turma (Modalidade,Professor,maxalunos,HoraInicio,HoraFim,"
                            + "Segunda,Terca,Quarta,Quinta,Sexta)"
                            + "values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement smt = conexao.prepareStatement(sqlincluir);
        smt.setString(1, turma.getModalidade());
        smt.setInt(2, turma.getProfessor());
        smt.setInt(3, turma.getMaxAlunos());
        smt.setString(4, turma.getHorarioIni());
        smt.setString(5, turma.getHorarioFim());
        smt.setBoolean(6, turma.isSegunda());
        smt.setBoolean(7, turma.isTerca());
        smt.setBoolean(8, turma.isQuarta());
        smt.setBoolean(9, turma.isQuinta());
        smt.setBoolean(10, turma.isSexta());
        smt.executeUpdate();
        smt.close();
        conexao.close();
    }
    
    public void alterar (Turma turma) throws SQLException{
        String sqlalterar = "update turma set Professor=?,Modalidade=?,HoraInicio=?,HoraFim=?,maxalunos=?,"
                          + "Segunda=?,Terca=?,Quarta=?,Quinta=?,Sexta=? where Professor=?";
        PreparedStatement smt = conexao.prepareStatement(sqlalterar);
        smt.setInt(1, turma.getProfessor());
        smt.setString(2, turma.getModalidade());
        smt.setString(3, turma.getHorarioIni());
        smt.setString(4, turma.getHorarioFim());
        smt.setInt(5, turma.getMaxAlunos());
        smt.setBoolean(6, turma.isSegunda());
        smt.setBoolean(7, turma.isTerca());
        smt.setBoolean(8, turma.isQuarta());
        smt.setBoolean(9, turma.isQuinta());
        smt.setBoolean(10, turma.isSexta());
        smt.setInt(11, turma.getProfessor());
    }
    
    public void consultar (Turma turma) throws SQLException{
        String sql = "SELECT * FROM turma WHERE Professor=" + String.valueOf(turma.getProfessor());
        PreparedStatement ptm = this.conexao.prepareStatement(sql);
        ResultSet rs = ptm.executeQuery();
        while(rs.next()){
            turma.setProfessor(rs.getInt("Professor"));
            turma.setModalidade(rs.getString("Modalidade"));
            turma.setHorarioIni(rs.getString("HoraInicio"));
            turma.setHorarioFim(rs.getString("HoraFim"));
            turma.setMaxAlunos(rs.getInt("maxalunos"));
            turma.setSegunda(rs.getBoolean("Segunda"));
            turma.setTerca(rs.getBoolean("Terca"));
            turma.setQuarta(rs.getBoolean("Quarta"));
            turma.setQuinta(rs.getBoolean("Quinta"));
            turma.setSexta(rs.getBoolean("Sexta"));
        }
    }
}
