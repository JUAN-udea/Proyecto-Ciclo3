package com.ciclo3.Proyecto.Modelos;

import javax.persistence.Id;
import java.util.Date;

public class Transaction {
    //Atributos
    private Long idTransaction;
    private String conceptTransaction;
    private float amountTransaction;
    private Employee employeeTransaction;
    private Enterprise enterpriseTransaction;
    private Date createdAtTransaction;
    private Date updatedAtTransaction;

    //Constructor

    public Transaction(Long idTransaction, String conceptTransaction, float amountTransaction, Date createdAtTransaction, Date updatedAtTransaction) {
        this.idTransaction = idTransaction;
        this.conceptTransaction = conceptTransaction;
        this.amountTransaction = amountTransaction;
        this.createdAtTransaction = createdAtTransaction;
        this.updatedAtTransaction = updatedAtTransaction;
    }
    //Constructor vacio
    public Transaction() {
    }
    //getter and setter
    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getConceptTransaction() {
        return conceptTransaction;
    }

    public void setConceptTransaction(String conceptTransaction) {
        this.conceptTransaction = conceptTransaction;
    }

    public float getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(float amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    public Employee getEmployeeTransaction() {
        return employeeTransaction;
    }

    public void setEmployeeTransaction(Employee employeeTransaction) {
        this.employeeTransaction = employeeTransaction;
    }

    public Enterprise getEnterpriseTransaction() {
        return enterpriseTransaction;
    }

    public void setEnterpriseTransaction(Enterprise enterpriseTransaction) {
        this.enterpriseTransaction = enterpriseTransaction;
    }

    public Date getCreatedAtTransaction() {
        return createdAtTransaction;
    }

    public void setCreatedAtTransaction(Date createdAtTransaction) {
        this.createdAtTransaction = createdAtTransaction;
    }

    public Date getUpdatedAtTransaction() {
        return updatedAtTransaction;
    }

    public void setUpdatedAtTransaction(Date updatedAtTransaction) {
        this.updatedAtTransaction = updatedAtTransaction;
    }
}


