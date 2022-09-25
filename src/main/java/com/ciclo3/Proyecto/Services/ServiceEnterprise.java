package com.ciclo3.Proyecto.Services;

import com.ciclo3.Proyecto.Modelos.Enterprise;
import com.ciclo3.Proyecto.Repositories.RepositoryEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceEnterprise implements ServiceInterfaceEnterprise {
    //Atributos
    Date Today = new Date();
    // Dar un objeto del repositorio a la entidad enterprise
    @Autowired
    RepositoryEnterprise repositoryEnterprise;

    @Override
    public List<Enterprise> getEnterprise() {
        return repositoryEnterprise.findAll();
    }

    @Override
    public Enterprise getOnlyOneEnterprise(Long idEnterprise) throws Exception {
        Optional<Enterprise> EnterpriseBD = repositoryEnterprise.findById(idEnterprise);
        if(EnterpriseBD.isPresent()){
            return EnterpriseBD.get();
        }
        throw new Exception("IdEnterprise no asignado");
    }

    @Override
    public String getCreateEnterprise(Enterprise enterpriseIn) {
        // preguntamos si hay alguna enterprise creada
        Optional<Enterprise> EnterpriseBD = repositoryEnterprise.findById(enterpriseIn.getIdEnterprise());
        if(!EnterpriseBD.isPresent()) {
            repositoryEnterprise.save(enterpriseIn);
            return "Enterprise creada con exito";
        }
        return ("Id ya registrado en otra enterprise");
    }

    @Override
    public Enterprise getUpdateEnterprise(Enterprise enterpriseIn) throws Exception {

        Enterprise enterpriseBD = getOnlyOneEnterprise(enterpriseIn.getIdEnterprise());
        if(enterpriseIn.getNameEnterprise()!=null && enterpriseIn.getNameEnterprise().equals("")){
            enterpriseBD.setNameEnterprise(enterpriseIn.getNameEnterprise());
        }
        if(enterpriseIn.getNITEnterprise()!=null && enterpriseIn.getNITEnterprise().equals("")){
            enterpriseBD.setNITEnterprise(enterpriseIn.getNITEnterprise());
        }
        if(enterpriseIn.getAdressEnterprise()!=null && enterpriseIn.getAdressEnterprise().equals("")){
            enterpriseBD.setAdressEnterprise(enterpriseIn.getAdressEnterprise());
        }
        if(enterpriseIn.getPhoneEnterprise()!=null && enterpriseIn.getPhoneEnterprise().equals("")){
            enterpriseBD.setPhoneEnterprise(enterpriseIn.getPhoneEnterprise());
        }
        enterpriseBD.setUpdatedAtEnterprise(Today);

        return repositoryEnterprise.save(enterpriseBD);
    }

    @Override
    public String getDeleteEnterprise(Long idEnterprise) throws Exception {
        Optional<Enterprise> enterpriseBD = repositoryEnterprise.findById(idEnterprise);
        if(enterpriseBD.isPresent()){
            repositoryEnterprise.deleteById(idEnterprise);
            return "Enterprise Eliminada con exito";
        }
        throw new Exception("Empresa no encontrada");
    }
}
