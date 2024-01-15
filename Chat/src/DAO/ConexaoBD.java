package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoBD {

    public Connection getConnection() throws SQLException {
        
        Connection conexao;
        conexao = DriverManager.getConnection("jdbc:postgresql://200.18.128.56:5432/aula", "aula", "aula");
        return conexao;
    }
}
