package com.ciclo3.Proyecto.Controllers;

import com.ciclo3.Proyecto.Modelos.Transaction;
import com.ciclo3.Proyecto.Modelos.ObjectAnswer;
import com.ciclo3.Proyecto.Services.ServiceInterfaceTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerTransaction {
    @Autowired
    ServiceInterfaceTransaction serviceInterfaceTransaction;

    @GetMapping("/ListaTransaction")
    public ResponseEntity<List<Transaction>> getTransaction(){
        return new ResponseEntity<>(serviceInterfaceTransaction.getTransaction(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/OneTransaction/{idTransaction}")
    public ResponseEntity<Object> getTransactionPath(@PathVariable Long idTransaction){
        try {
            Transaction TransactionX = serviceInterfaceTransaction.getOnlyOneTransaction(idTransaction);
            return new ResponseEntity<>(TransactionX,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/CreateTransaction")
    public ResponseEntity<String> PostCreateTransaction(@RequestBody Transaction TransactionX){
        try{
            String message = serviceInterfaceTransaction.getCreateTransaction(TransactionX);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/UpdateTransaction")
    public ResponseEntity<ObjectAnswer> putUpdateTransaction(@RequestBody Transaction TransactionX){
        try {
            Transaction TransactionBD = serviceInterfaceTransaction.getUpdateTransaction(TransactionX);
            return new ResponseEntity<>(new ObjectAnswer("Actualizacion de Transaction Exitosa",TransactionBD),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ObjectAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/DeleteTransaction/{idTransaction}")
    public ResponseEntity<String> DeleteTransaction(@PathVariable Long idTransaction){
        try{
            String message = serviceInterfaceTransaction.getDeleteTransaction(idTransaction);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}
