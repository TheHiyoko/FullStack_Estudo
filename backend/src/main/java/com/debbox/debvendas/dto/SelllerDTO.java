package com.debbox.debvendas.dto;
import java.io.Serializable;

import com.debbox.debvendas.entities.Saller;

public class SelllerDTO implements Serializable{

    private Long id;
    private String name;

    public SelllerDTO() {
    }


    public SelllerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SelllerDTO(Saller entity) {
        id = entity.getId();
        name = entity.getName();
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
