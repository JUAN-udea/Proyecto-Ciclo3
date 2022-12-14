package com.ciclo3.Proyecto.Repositories;

import com.ciclo3.Proyecto.Models.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEnterprise extends JpaRepository<Enterprise, Long> {
}
