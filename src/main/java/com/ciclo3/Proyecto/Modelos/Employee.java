package com.ciclo3.Proyecto.Modelos;

import javax.transaction.Transaction;
import java.util.Date;
import java.util.List;

public class Employee {
    //Atributos
    private Long idEmpleado;
    private String nameEmployee;
    private String phoneEmployee;
    private String emailEmployee;

    private List<ROLES> rolesEmployee;
    private Enterprise enterpriseEmployee;
    private List<Transaction> transactions;
    private Date updatedAtEmployee;
    private Date CreatedAtEmployee;
    //Constructor


    public Employee(Long idEmpleado, String nameEmployee, String phoneEmployee, String emailEmployee, Date updatedAtEmployee, Date createdAtEmployee) {
        this.idEmpleado = idEmpleado;
        this.nameEmployee = nameEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.updatedAtEmployee = updatedAtEmployee;
        this.CreatedAtEmployee = createdAtEmployee;
    }
    //Constructor vacio
    public Employee() {
    }
    //Setters and getters
    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public List<ROLES> getRolesEmployee() {
        return rolesEmployee;
    }

    public void setRolesEmployee(List<ROLES> rolesEmployee) {
        this.rolesEmployee = rolesEmployee;
    }

    public Enterprise getEnterpriseEmployee() {
        return enterpriseEmployee;
    }

    public void setEnterpriseEmployee(Enterprise enterpriseEmployee) {
        this.enterpriseEmployee = enterpriseEmployee;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getUpdatedAtEmployee() {
        return updatedAtEmployee;
    }

    public void setUpdatedAtEmployee(Date updatedAtEmployee) {
        this.updatedAtEmployee = updatedAtEmployee;
    }

    public Date getCreatedAtEmployee() {
        return CreatedAtEmployee;
    }

    public void setCreatedAtEmployee(Date createdAtEmployee) {
        CreatedAtEmployee = createdAtEmployee;
    }
}
