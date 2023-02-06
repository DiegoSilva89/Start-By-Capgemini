/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Diego Silva
 */
public class Project {
    
    //Atributos dos campos criados no banco de dados
    private int id;
    private String name;
    private String description;
    private Date creatadAt;
    private Date updatedAt;
    
    //criação do construtor
    public Project(int id, String name, String description, Date creatadAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creatadAt = creatadAt;
        this.updatedAt = updatedAt;
    }

    //getters and setters. Métodos que permitem acessar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatadAt() {
        return creatadAt;
    }

    public void setCreatadAt(Date creatadAt) {
        this.creatadAt = creatadAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
   //método toString
    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", description=" + description + ", creatadAt=" + creatadAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
