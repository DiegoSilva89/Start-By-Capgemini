/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.organizaapp;

import util.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Diego Silva
 */
public class OrganizaApp {

    public static void main(String[] args) {
        
        /*para criar a conexão com o banco de dados a classe ConnectionFactory 
        devolvera uma conexão para carregar o driver e a conexão será estabelecida*/
        Connection c = ConnectionFactory.getConnection();
        
        //para fechar a conexão devemos fecha-la com o comando a segir:
        ConnectionFactory.closeConnection(c);
        
    }
}
