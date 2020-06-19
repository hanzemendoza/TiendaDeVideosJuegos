package com.sucho.VideoJuegos.Repository;

import com.sucho.VideoJuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    @Query("select v from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
}
