package com.sucho.VideoJuegos.service;

import com.sucho.VideoJuegos.Repository.VideojuegoRepository;
import com.sucho.VideoJuegos.domain.Videojuego;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    
    public List<Videojuego> buscarDestacado(){
        return videojuegoRepository.buscarTodos();
    }
    
    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }
    
    public List<Videojuego> buscar(String consulta){
        return videojuegoRepository.findByNombreContaining(consulta);
    }
    
    
    public Videojuego guardar(Videojuego videojuego){
        return videojuegoRepository.save(videojuego);
     }
}
