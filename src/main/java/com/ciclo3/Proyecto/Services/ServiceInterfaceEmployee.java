package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Modelos.Employee;
import com.ciclo3.Proyecto.Modelos.Enterprise;

import java.util.List;

public interface ServiceInterfaceEmployee {
    // metodo para ver lista empresa
    public List<Employee> getEmployee();

    // metodo que nos trae un Employee
    public Employee getOnlyOneEmployee(Long idEmployee) throws Exception;

    // metodo que nos cree una Employee
    public  String getCreateEmployee(Employee Employee);

    // metodo que nos actualiza una Employee
    public Employee getUpdateEmployee(Employee EmployeeIn) throws Exception;

    // metodo que nos elimina una empresa
    public String getDeleteEmployee(Long idEmployee) throws Exception;

}
