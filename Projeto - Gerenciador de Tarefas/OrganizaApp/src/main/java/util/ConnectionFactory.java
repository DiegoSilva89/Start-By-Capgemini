/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Diego Silva
 */
public class ConnectionFactory {
    
    //driver de conexão que faz a ponte entre o projeto e bando de dados
    public static final String DRIVER = "com.mysql.jbdc.Driver"; //endereço do banco mysql
    public static final String URL = "jcbc:mysql://localhost:3306/OrganizaApp"; //caminho da nossa aplicação de banco de dados. Localhost pois o banco de dados está no computador.
    public static final String USER = "root";
    public static final String PASS = "";   
    
        //método público com static. static utiliza o método sem criar a instancia ou objeto da classe connectionFactory para executar o método. getConnection é o nome do método
        public static Connection getConnection() {
            try { /*try e catch realizam tratamento de exceção quando encontram algum erro, fazendo com que o algoritmo saiba o que fazer para tratar o erro, 
                e neste caso será analisado a class DRIVER*/
                Class.forName(DRIVER);
                /*Drivemanager é uma classe do conjunto de dependencias que utilizamos para realizar uma conexão com os caminhos entre (), o método .getConnection é estático*/
                return DriverManager.getConnection(URL, USER, PASS);
                /*catch será executado quando ocorrer a exceção, onde neste caso mostra a mensagem de uma provável ação para reparo ou mensagem de aviso */
            } catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException("Erro na conexão com o banco de dados", ex);
            }
    }
    
        //closeConnection recebe como parametro a conexão solicitada e verifica caso ocorra erroa a serem tratados, sendo neste caso erro de conexão
        public static void closeConnection(Connection connection) {
            try {
                if(connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
            }
        }
        
        public static void closeConnection(Connection connection, PreparedStatement statement) {
            try {
                if(connection != null) {
                    connection.close();
                }
                
                if(statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
            }
        }
    
    
    
}
