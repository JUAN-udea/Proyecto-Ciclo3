package com.ciclo3.Proyecto.Controllers;

import com.ciclo3.Proyecto.Modelos.Enterprise;
import com.ciclo3.Proyecto.Modelos.ObjectAnswer;
import com.ciclo3.Proyecto.Services.ServiceInterfaceEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerEnterprise {
    @Autowired
    ServiceInterfaceEnterprise serviceInterfaceEnterprise;

    @GetMapping("/ListaEnterprise")
    public ResponseEntity <List<Enterprise>> getEnterprise(){
        return new ResponseEntity<>(serviceInterfaceEnterprise.getEnterprise(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/OneEnterprise/{idEnterprise}")
    public ResponseEntity<Object> getEnterprisePath(@PathVariable Long idEnterprise){
        try {
            Enterprise EnterpriseX = serviceInterfaceEnterprise.getOnlyOneEnterprise(idEnterprise);
            return new ResponseEntity<>(EnterpriseX,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/CreateEnterprise")
    public ResponseEntity<String> PostCreateEnterprise(@RequestBody Enterprise EnterpriseX){
        try{
            String message = serviceInterfaceEnterprise.getCreateEnterprise(EnterpriseX);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/UpdateEnterprise")
    public ResponseEntity<ObjectAnswer> putUpdateEnterprise(@RequestBody Enterprise EnterpriseX){
        try {
            Enterprise EnterpriseBD = serviceInterfaceEnterprise.getUpdateEnterprise(EnterpriseX);
            return new ResponseEntity<>(new ObjectAnswer("Actualizacion de Enterprise Exitosa",EnterpriseBD),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ObjectAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/DeleteEnterprise/{idEnterprise}")
    public ResponseEntity<String> DeleteEnterprise(@PathVariable Long idEnterprise){
        try{
            String message = serviceInterfaceEnterprise.getDeleteEnterprise(idEnterprise);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }


}

