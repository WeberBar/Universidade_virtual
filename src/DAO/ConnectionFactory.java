
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String nome_banco_dados = "universidade_app";
    private static final String Usuario = "root";
    private static final String Senha = "W3b2004@";
    private static final String Url = "jdbc:mysql://localhost:3306/" + nome_banco_dados + "?useTimezone=true&serverTimezone=UTC" ;

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(Url, Usuario, Senha);
        } catch(SQLException ex){
            System.out.println(ConnectionFactory.class.getName() + " " + ex.getMessage());
        }
        return null;
    }
    
    
}


