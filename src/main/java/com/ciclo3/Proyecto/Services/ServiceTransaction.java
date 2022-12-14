package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Models.Transaction;
import com.ciclo3.Proyecto.Repositories.RepositoryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceTransaction implements ServiceInterfaceTransaction {

    Date Today = new Date();

    @Autowired
    RepositoryTransaction repositoryTransaction;

    @Override
    public List<Transaction> getTransaction() {
        return repositoryTransaction.findAll();
    }

    @Override
    public Transaction getOnlyOneTransaction(Long idTransaction) throws Exception {
        Optional<Transaction> TransactionBD = repositoryTransaction.findById(idTransaction);
        if(TransactionBD.isPresent()){
            return TransactionBD.get();
        }
        throw new Exception("IdTransaction no asignado");
    }

    @Override
    public String getCreateTransaction(Transaction TransactionIn) {
        Optional<Transaction> TransactionBD = repositoryTransaction.findById(TransactionIn.getIdTransaction());
        if(!TransactionBD.isPresent()) {
            repositoryTransaction.save(TransactionIn);
            return "Transaction creada con exito";
        }
        return ("Id ya registrado en otra Transaction");
    }

    @Override
    public Transaction getUpdateTransaction(Transaction TransactionIn) throws Exception {
        Transaction TransactionBD = getOnlyOneTransaction(TransactionIn.getIdTransaction());

        if(TransactionIn.getConceptTransaction()!=null && !TransactionIn.getConceptTransaction().equals("")){
            TransactionBD.setConceptTransaction(TransactionIn.getConceptTransaction());
        }
        String amountCast = String.valueOf(TransactionIn.getAmountTransaction());
        if(amountCast!=null && !amountCast.equals("")){
            TransactionBD.setAmountTransaction(TransactionIn.getAmountTransaction());
        }
        TransactionBD.setUpdatedAtTransaction(Today);

        return repositoryTransaction.save(TransactionBD);
    }

    @Override
    public String getDeleteTransaction(Long idTransaction) throws Exception {
        Optional<Transaction> TransactionBD = repositoryTransaction.findById(idTransaction);
        if(TransactionBD.isPresent()){
            repositoryTransaction.deleteById(idTransaction);
            return "Transaction Eliminada con exito";
        }
        throw new Exception("Empresa no encontrada");
    }
}
