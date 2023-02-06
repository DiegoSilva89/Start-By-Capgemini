/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
//pacotes
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author Diego Silva
 */
public class TaskController {
    
    //save recebendo a tarefa a qual quer salvar no banco de dados
    public void save(Task task) {
        
        //Gerar uma String com a sintaxe utilizada no SQL
        String sql = "INSERT INTO tasks (idProject, "
                + "name, "
                + "description, "
                + "completed, "
                + "notes, "
                + "deadline, "
                + "createdAt, "
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; /*sempre utili-
        zamos "?" quando não sabemos os valores e precisamos buscar nas 
        váriáveis SQL */
        
        //Conexão com banco de dados
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            /*setar os campos que definimos como "?" informando o tipo de dado, 
            campo e nome do campo*/
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            /*para setar data, devemos importar o pacote de datas do SQL e
            informar parametros como número long*/
            statement.setDate(6, new Date(
                    task.getDeadline().getTime()) );
            statement.setDate(7, new Date(
                    task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(
                    task.getUpdatedAt().getTime()));
            statement.execute();                    
                    
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " 
                    + ex.getMessage(), ex);            
        } finally {
            ConnectionFactory.closeConnection(connection, statement);            
            
        }
        
    }
    
    //update recebendo a tarefa a qual quer salvar no banco de dados
    public void update(Task task) {
        
        //Criar uma String com o update que queremos criar
        String sql = "UPDATE tasks SET "
                + "idProjett = ?, "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "completed = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        //criar tratamento de exceção
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(1, task.getName());
            statement.setString(1, task.getDescription());
            statement.setString(1, task.getNotes());
            statement.setBoolean(1, task.isIsCompleted());
            statement.setDate(1, new Date(task.getDeadline().getTime()));
            statement.setDate(1, new Date(task.getCreatedAt().getTime()));
            statement.setDate(1, new Date(task.getUpdatedAt().getTime()));
            statement.execute();            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa " + 
                    ex.getMessage(), ex);
            
        }
        
        
    }
     //deleta tarefas de acordo com o id do banco de dados
    public void removeById(int taskId) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        //try catch para seção critica que é passível de erro
        try {
            //estabelecer conexão com banco de dados
            connection = ConnectionFactory.getConnection(); // 1º pedir conexão
            /*criar objeto de statemant para prepara o comando SQL que vai ser
            executado no bando, evitando SQL */
            statement = connection.prepareStatement(sql); //2º preparar o SQL
            //setando valor no SQL, por exemplo, trocar o "?".
            statement.setInt(1, taskId);// mudar o para o parametro escolhido
            statement.execute();   //executar a remoção da tarefa         
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa " + ex.getMessage());            
        // finally será sempre executado ao final do try, tendo tratamento de exceção ou não.
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    //busca todas as tarefas do projeto de acordo com o id
    public List<Task> gerAll(int idProject) {
        return null;
    }
    
}
