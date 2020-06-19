package com.sucho.VideoJuegos.controller;

import com.sucho.VideoJuegos.domain.Videojuego;
import com.sucho.VideoJuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoController {
    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
    
    
    @RequestMapping("/")
    public String listarVideoJuegos(Model model){
        
        List<Videojuego> destacados = videojuegoService.buscarDestacado();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }
    
    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideoJuegoPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
    
    @RequestMapping("/buscar")
    public String buscar(@RequestParam ("q") String consulta, Model model){
        List<Videojuego> juegos = videojuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
}
