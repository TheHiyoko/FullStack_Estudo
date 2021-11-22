package com.debbox.debvendas.services;
import java.util.List;
import java.util.stream.Collectors;

import com.debbox.debvendas.dto.SelllerDTO;
import com.debbox.debvendas.entities.Saller;
import com.debbox.debvendas.repositories.SellerRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServices {
    
    @Autowired
    private SellerRepositorie repository;

    public List<SelllerDTO> findAll(){
        List<Saller> result = repository.findAll();
        return result.stream().map(x -> new SelllerDTO(x)).collect(Collectors.toList());

    }
}
