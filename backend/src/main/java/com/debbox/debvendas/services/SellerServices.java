package com.debbox.debvendas.services;
import java.util.List;
import com.debbox.debvendas.entities.Saller;
import com.debbox.debvendas.repositories.SellerRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServices {
    
    @Autowired
    private SellerRepositorie repository;

    public List<Saller> findAll(){
        return repository.findAll();
    }

}
