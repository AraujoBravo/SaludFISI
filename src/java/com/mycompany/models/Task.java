/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

import java.sql.Date;

/**
 *
 * @author cristian
 */
public class Task {

    private Integer idTask;
    private String titleTask;
    private String descriptionTask;
    private Integer idEmployee;
    private String nombre;
    private Date date_start;
    private Date date_end;
    private String estado;
    public static final String[] estados = {"Asignado", "Realizado", "Finalizado"};
    
    public Task() {
    }

    public Task(Integer idTask,String titleTask, String descriptionTask, Integer idIncidents, Integer idEmployee) {
        this.idTask = idTask;
        this.descriptionTask = descriptionTask;
        this.idEmployee = idEmployee;
        this.titleTask = titleTask;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTask() {
        return idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public String getTitleTask() {
        return titleTask;
    }

    public void setTitleTask(String titleTask) {
        this.titleTask = titleTask;
    }
    
    public String getDescriptionTask() {
        return descriptionTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

}
