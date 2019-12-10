/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

import java.sql.Date;

/**
 *
 * @author JuanEAB
 */
public class HealthReport {
    private Integer idHealthReport;
    private String description;
    private String titleHealthReport;
    private Date date;
    private Integer idEmployee;
    
    public HealthReport(){}
    public HealthReport(Integer idHealthReport, String title, String description, Integer idEmployee){
        this.idHealthReport = idHealthReport;
        this.idEmployee = idEmployee;
        this.titleHealthReport = title;
        this.description = description;
    }
    public Integer getIdHealthReport() {
        return idHealthReport;
    }

    public void setIdHealthReport(Integer idHealthReport) {
        this.idHealthReport = idHealthReport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitleHealthReport() {
        return titleHealthReport;
    }

    public void setTitleHealthReport(String titleHealthReport) {
        this.titleHealthReport = titleHealthReport;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
