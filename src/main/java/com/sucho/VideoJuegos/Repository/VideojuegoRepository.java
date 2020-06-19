package com.sucho.VideoJuegos.Repository;

import com.sucho.VideoJuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    //puedo omitir el "select v" del principio
    @Query("select v from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
    
    @Query("from Videojuego v where v.distribuidor.id=?1 order by v.nombre")
    List <Videojuego> buscarPorDistribuidor(int distribuidorId);
}
