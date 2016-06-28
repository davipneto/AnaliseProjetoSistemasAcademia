/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemautilitario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author davip
 */
public class ClassConexao {
    public static Connection getConexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado ao Banco!!");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mybd","root","6659");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + ex);
            Logger.getLogger(ClassConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão\n com a fonte de dados: \n" + ex);
            Logger.getLogger(ClassConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
