package com.ciclo3.Proyecto.Modelos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Enterprises")
public class Enterprise {
    //Atributos
    @Id
    private Long idEnterprise;
    @Column
    private String nameEnterprise;
    @Column
    private String NITEnterprise;
    @Column
    private String phoneEnterprise;
    @Column
    private String adressEnterprise;
    @OneToMany(mappedBy = "enterpriseTransaction")
    private List<Transaction> transactions;
    @OneToMany(mappedBy = "enterpriseEmployee")
    private List<Employee> employees;
    @Column
    private Date createdAtEnterprise;
    @Column
    private Date updatedAtEnterprise;

    //Constructor
    public Enterprise(Long idEnterprise, String nameEnterprise, String NITEnterprise, String phoneEnterprise, String adressEnterprise, Date createdAtEnterprise, Date updatedAtEnterprise) {
        this.idEnterprise = idEnterprise;
        this.nameEnterprise = nameEnterprise;
        this.NITEnterprise = NITEnterprise;
        this.phoneEnterprise = phoneEnterprise;
        this.adressEnterprise = adressEnterprise;
        this.createdAtEnterprise = createdAtEnterprise;
        this.updatedAtEnterprise = updatedAtEnterprise;
    }
    //Constructor Vacio
    public Enterprise() {
    }
    //Getter and setter
    public Long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getNameEnterprise() {
        return nameEnterprise;
    }

    public void setNameEnterprise(String nameEnterprise) {
        this.nameEnterprise = nameEnterprise;
    }

    public String getNITEnterprise() {
        return NITEnterprise;
    }

    public void setNITEnterprise(String NITEnterprise) {
        this.NITEnterprise = NITEnterprise;
    }

    public String getPhoneEnterprise() {
        return phoneEnterprise;
    }

    public void setPhoneEnterprise(String phoneEnterprise) {
        this.phoneEnterprise = phoneEnterprise;
    }

    public String getAdressEnterprise() {
        return adressEnterprise;
    }

    public void setAdressEnterprise(String adressEnterprise) {
        this.adressEnterprise = adressEnterprise;
    }

    public Date getCreatedAtEnterprise() {
        return createdAtEnterprise;
    }

    public void setCreatedAtEnterprise(Date createdAtEnterprise) {
        this.createdAtEnterprise = createdAtEnterprise;
    }

    public Date getUpdatedAtEnterprise() {
        return updatedAtEnterprise;
    }

    public void setUpdatedAtEnterprise(Date updatedAtEnterprise) {
        this.updatedAtEnterprise = updatedAtEnterprise;
    }
}
