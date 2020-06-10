package com.sucho.VideoJuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    @RequestMapping("/")
    public String listarVideoJuegos(){
        //busqueda de los video juegos
        return "listado";
    }
    
}
