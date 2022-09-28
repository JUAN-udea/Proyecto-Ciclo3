package com.ciclo3.Proyecto.Controllers;

import com.ciclo3.Proyecto.Models.Employee;
import com.ciclo3.Proyecto.Models.ObjectAnswer;
import com.ciclo3.Proyecto.Services.ServiceInterfaceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerEmployee {
    @Autowired
    ServiceInterfaceEmployee serviceInterfaceEmployee;

    @GetMapping("/ListaEmployee")
    public ResponseEntity<List<Employee>> getEmployee(){
        return new ResponseEntity<>(serviceInterfaceEmployee.getEmployee(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/OneEmployee/{idEmployee}")
    public ResponseEntity<Object> getEmployeePath(@PathVariable Long idEmployee){
        try {
            Employee EmployeeX = serviceInterfaceEmployee.getOnlyOneEmployee(idEmployee);
            return new ResponseEntity<>(EmployeeX,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/CreateEmployee")
    public ResponseEntity<String> PostCreateEmployee(@RequestBody Employee EmployeeX){
        try{
            String message = serviceInterfaceEmployee.getCreateEmployee(EmployeeX);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/UpdateEmployee")
    public ResponseEntity<ObjectAnswer> putUpdateEmployee(@RequestBody Employee EmployeeX){
        try {
            Employee EmployeeBD = serviceInterfaceEmployee.getUpdateEmployee(EmployeeX);
            return new ResponseEntity<>(new ObjectAnswer("Actualizacion de Employee Exitosa",EmployeeBD),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ObjectAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/DeleteEmployee/{idEmployee}")
    public ResponseEntity<String> DeleteEmployee(@PathVariable Long idEmployee){
        try{
            String message = serviceInterfaceEmployee.getDeleteEmployee(idEmployee);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    
}
