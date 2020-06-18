package com.sucho.VideoJuegos.Repository;

import com.sucho.VideoJuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
}
