package com.sucho.VideoJuegos.service;

import com.sucho.VideoJuegos.Repository.DistribuidorRepository;
import com.sucho.VideoJuegos.domain.Distribuidor;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DistribuidorService {
    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }
    
    public List<Distribuidor> buscarTodos(){
        return distribuidorRepository.findAll();
    }
    
 }
