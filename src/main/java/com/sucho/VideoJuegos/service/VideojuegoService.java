
package com.sucho.VideoJuegos.service;

import com.sucho.VideoJuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    public List<Videojuego> buscarDestacado(){
        List<Videojuego> destacados = new ArrayList<>();
        
        Videojuego juego = new Videojuego();
        juego.setNombre("Super Mario Bros");
        juego.setDescripcion("Primer juego ya siendo el fontanero plataformero");
        juego.setImagenUrl("img/mario1.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Super Mario Bros 2");
        juego.setDescripcion("segungo juego ya siendo el fontanero plataformero");
        juego.setImagenUrl("img/mario2.png");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Super Mario Bros 3");
        juego.setDescripcion("tercer juego ya siendo el fontanero plataformero");
        juego.setImagenUrl("img/mario3.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Super Mario World");
        juego.setDescripcion("cuarto juego ya siendo el fontanero plataformero");
        juego.setImagenUrl("img/marioworld.jpg");
        destacados.add(juego);
        
        
        return destacados;
    }
}
