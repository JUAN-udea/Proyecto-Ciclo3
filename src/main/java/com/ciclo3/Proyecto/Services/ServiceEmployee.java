package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Models.Employee;
import com.ciclo3.Proyecto.Repositories.RepositoryEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployee implements ServiceInterfaceEmployee{

    Date Today = new Date();

    @Autowired
    RepositoryEmployee repositoryEmployee;

    @Override
    public List<Employee> getEmployee() {
        return repositoryEmployee.findAll();
    }

    @Override
    public Employee getOnlyOneEmployee(Long idEmployee) throws Exception {
        Optional<Employee> EmployeeBD = repositoryEmployee.findById(idEmployee);
        if(EmployeeBD.isPresent()){
            return EmployeeBD.get();
        }
        throw new Exception("IdEmpleado no asignado");
    }

    @Override
    public String getCreateEmployee(Employee EmployeeIn) {

        Optional<Employee> EmployeeBD = repositoryEmployee.findById(EmployeeIn.getIdEmployee());
        if(!EmployeeBD.isPresent()) {
            repositoryEmployee.save(EmployeeIn);
            return "Empleado creado con exito";
        }
        return ("Id ya registrado en otro empleado");
    }

    @Override
    public Employee getUpdateEmployee(Employee EmployeeIn) throws Exception {

        Employee EmployeeBD = getOnlyOneEmployee(EmployeeIn.getIdEmployee());
        if(EmployeeIn.getNameEmployee()!=null && EmployeeIn.getNameEmployee().equals("")){
            EmployeeBD.setNameEmployee(EmployeeIn.getNameEmployee());
        }
        if(EmployeeIn.getEmailEmployee()!=null && EmployeeIn.getEmailEmployee().equals("")){
            EmployeeBD.setEmailEmployee(EmployeeIn.getEmailEmployee());
        }
        if(EmployeeIn.getRolesEmployee()!=null && EmployeeIn.getRolesEmployee().equals("")){
            EmployeeBD.setRolesEmployee(EmployeeIn.getRolesEmployee());
        }
        if(EmployeeIn.getPhoneEmployee()!=null && EmployeeIn.getPhoneEmployee().equals("")){
            EmployeeBD.setPhoneEmployee(EmployeeIn.getPhoneEmployee());
        }
        EmployeeBD.setUpdatedAtEmployee(Today);

        return repositoryEmployee.save(EmployeeBD);
    }

    @Override
    public String getDeleteEmployee(Long idEmployee) throws Exception {
        Optional<Employee> EmployeeBD = repositoryEmployee.findById(idEmployee);
        if(EmployeeBD.isPresent()){
            repositoryEmployee.deleteById(idEmployee);
            return "Empleado Eliminado con exito";
        }
        throw new Exception("Empleado no encontrado");
    }
    
    
    
}
