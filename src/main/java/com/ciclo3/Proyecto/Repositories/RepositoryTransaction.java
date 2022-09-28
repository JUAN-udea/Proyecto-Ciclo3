package com.ciclo3.Proyecto.Repositories;

import com.ciclo3.Proyecto.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTransaction extends JpaRepository<Transaction, Long> {


}
