package com.debbox.debvendas.services;


import java.util.List;

import com.debbox.debvendas.dto.SaleDTO;
import com.debbox.debvendas.dto.SaleSumDTO;
import com.debbox.debvendas.entities.Sale;
import com.debbox.debvendas.repositories.SaleRepository;
import com.debbox.debvendas.repositories.SellerRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepositorie sellerRepositoie;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepositoie.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));

    }

    public  List<SaleSumDTO> amoutGroupedBySaller() {
        return repository.amoutGroupedBySaller();
    }
}
