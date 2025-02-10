package com.example.endpoints.controller;

import com.example.endpoints.dto.FiltroConsultaDTO;
import com.example.endpoints.dto.ConsultaResponse;
import com.example.endpoints.service.IInicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "inicio")
public class InicioController {

    private final IInicioService service;


    @PostMapping(value = "saludo")
    public ConsultaResponse saludar(@RequestBody FiltroConsultaDTO filtro){
        return service.saludo(filtro.getNombre());
    }

}
