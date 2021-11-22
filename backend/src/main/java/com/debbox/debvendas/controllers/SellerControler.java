package com.debbox.debvendas.controllers;

import java.util.List;

import com.debbox.debvendas.dto.SelllerDTO;
import com.debbox.debvendas.services.SellerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/sellers")
public class SellerControler {

    @Autowired
    private SellerServices service;

    @GetMapping
    public ResponseEntity<List<SelllerDTO>>findAll() {
        List<SelllerDTO> list = service.findAll();
        return ResponseEntity.ok(list);

    }
    
  
    
    
}
