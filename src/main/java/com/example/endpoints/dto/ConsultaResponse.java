package com.example.endpoints.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultaResponse {
    private String nombre;
    private String apellido;
    private Object informacion;
}
