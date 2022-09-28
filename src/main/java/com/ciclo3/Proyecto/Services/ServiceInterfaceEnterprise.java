package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Models.Enterprise;

import java.util.List;

public interface ServiceInterfaceEnterprise {

    public List<Enterprise> getEnterprise();

    public Enterprise getOnlyOneEnterprise(Long idEnterprise) throws Exception;

    public String setCreateEnterprise(Enterprise enterpriseIn);

    public Enterprise getUpdateEnterprise(Enterprise enterpriseIn) throws Exception;

    public String getDeleteEnterprise(Long idEnterprise) throws Exception;

}
