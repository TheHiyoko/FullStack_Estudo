package com.debbox.debvendas.dto;

import java.time.LocalDate;

import com.debbox.debvendas.entities.Sale;

public class SaleDTO {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SelllerDTO saller;

    public SaleDTO () {

    }
    

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SelllerDTO saller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.saller = saller;
    }


    public SaleDTO(Sale entity) {
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmout();
        date = entity.getDate();
        saller = new SelllerDTO(entity.getSaller());
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return this.visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return this.deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SelllerDTO getSaller() {
        return this.saller;
    }

    public void setSaller(SelllerDTO saller) {
        this.saller = saller;
    }

}
