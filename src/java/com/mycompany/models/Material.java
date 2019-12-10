/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

/**
 *
 * @author JuanEAB
 */
public class Material {
    private Integer idMaterial;
    private String titleMaterial;
    private String description;
    public Material(Integer idMaterial, String titleMaterial, String description){
        this.idMaterial = idMaterial;
        this.description = description;
        this.titleMaterial = titleMaterial;
    }
    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTitleMaterial() {
        return titleMaterial;
    }

    public void setTitleMaterial(String titleMaterial) {
        this.titleMaterial = titleMaterial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
