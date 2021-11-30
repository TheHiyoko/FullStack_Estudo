package com.debbox.debvendas.dto;

import java.io.Serializable;

import com.debbox.debvendas.entities.Saller;

public class SaleSumDTO implements Serializable{
    
    private String sallerName;
    private Double soma;


    public SaleSumDTO() {
    }

    public SaleSumDTO(Saller saller, Double soma) {
        this.sallerName = saller.getName();  
        this.soma = soma;
    }

    public String getSallerName() {
        return this.sallerName;
    }

    public void setSallerName(String sallerName) {
        this.sallerName = sallerName;
    }

    public Double getSoma() {
        return this.soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

}
