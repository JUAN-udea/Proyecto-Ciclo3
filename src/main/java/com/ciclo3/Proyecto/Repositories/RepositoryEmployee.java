package com.ciclo3.Proyecto.Repositories;

import com.ciclo3.Proyecto.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee, Long> {
}
