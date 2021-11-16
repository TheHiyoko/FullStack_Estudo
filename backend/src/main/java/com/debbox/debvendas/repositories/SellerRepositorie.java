package com.debbox.debvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.debbox.debvendas.entities.Saller;

public interface SellerRepositorie extends JpaRepository<Saller, Long> {
    
}
