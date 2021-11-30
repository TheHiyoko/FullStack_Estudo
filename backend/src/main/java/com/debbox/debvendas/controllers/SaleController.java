package com.debbox.debvendas.controllers;

import com.debbox.debvendas.dto.SaleDTO;
import com.debbox.debvendas.services.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>>findAll(Pageable pageable) {
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);

    }
    
  
    
    
}
