package com.ciclo3.Proyecto.Repositories;

import com.ciclo3.Proyecto.Modelos.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEmployee extends JpaRepository<Employee, Long> {
}
