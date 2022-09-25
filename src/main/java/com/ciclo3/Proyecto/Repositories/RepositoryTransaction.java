package com.ciclo3.Proyecto.Repositories;

import com.ciclo3.Proyecto.Modelos.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTransaction extends JpaRepository<Transaction, Long> {


}
