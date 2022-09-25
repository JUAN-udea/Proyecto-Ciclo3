package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Modelos.Enterprise;

import java.util.List;

public interface ServiceInterfaceEnterprise {
    // metodo para ver lista empresa
    public List<Enterprise> getEnterprise();

    // metodo que nos trae un enterprise
    public Enterprise getOnlyOneEnterprise(Long idEnterprise) throws Exception;

    // metodo que nos cree una Enterprise
    public  String getCreateEnterprise(Enterprise enterprise);

    // metodo que nos actualiza una enterprise
    public Enterprise getUpdateEnterprise(Enterprise enterpriseIn) throws Exception;

    // metodo que nos elimina una empresa
    public String getDeleteEnterprise(Long idEnterprise) throws Exception;

}
