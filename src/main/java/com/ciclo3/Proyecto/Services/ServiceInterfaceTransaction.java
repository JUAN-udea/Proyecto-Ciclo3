package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Modelos.Transaction;

import java.util.List;

public interface ServiceInterfaceTransaction {
    // metodo para ver lista empresa
    public List<Transaction> getTransaction();

    // metodo que nos trae un Transaction
    public Transaction getOnlyOneTransaction(Long idTransaction) throws Exception;

    // metodo que nos cree una Transaction
    public  String getCreateTransaction(Transaction Transaction);

    // metodo que nos actualiza una Transaction
    public Transaction getUpdateTransaction(Transaction TransactionIn) throws Exception;

    // metodo que nos elimina una empresa
    public String getDeleteTransaction(Long idTransaction) throws Exception;
}
