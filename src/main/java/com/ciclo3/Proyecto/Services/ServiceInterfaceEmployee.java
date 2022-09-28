package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Models.Employee;

import java.util.List;

public interface ServiceInterfaceEmployee {

    public List<Employee> getEmployee();


    public Employee getOnlyOneEmployee(Long idEmployee) throws Exception;


    public  String getCreateEmployee(Employee Employee);


    public Employee getUpdateEmployee(Employee EmployeeIn) throws Exception;


    public String getDeleteEmployee(Long idEmployee) throws Exception;

}
