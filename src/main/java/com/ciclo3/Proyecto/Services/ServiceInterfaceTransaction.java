package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Models.Transaction;

import java.util.List;

public interface ServiceInterfaceTransaction {

    public List<Transaction> getTransaction();


    public Transaction getOnlyOneTransaction(Long idTransaction) throws Exception;


    public  String getCreateTransaction(Transaction Transaction);


    public Transaction getUpdateTransaction(Transaction TransactionIn) throws Exception;


    public String getDeleteTransaction(Long idTransaction) throws Exception;
}
