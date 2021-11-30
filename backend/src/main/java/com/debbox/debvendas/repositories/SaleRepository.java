package com.debbox.debvendas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.debbox.debvendas.dto.SaleSumDTO;
import com.debbox.debvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {
    
    @Query("SELECT new com.debbox.debvendas.dto.SaleSumDTO(obj.saller, SUM(obj.amount)) "
     + " FROM Sale AS obj  GROUP BY obj.saller")
    List<SaleSumDTO> amoutGroupedBySaller();

}
