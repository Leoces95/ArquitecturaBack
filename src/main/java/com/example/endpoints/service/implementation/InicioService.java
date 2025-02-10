package com.example.endpoints.service.implementation;

import com.example.endpoints.dto.ConsultaResponse;
import com.example.endpoints.entities.Usuarios;
import com.example.endpoints.repository.Data;
import com.example.endpoints.service.IInicioService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InicioService implements IInicioService {
    private final Data usuarios;

    @PostConstruct
    public void initDB() {
        usuarios.save(new Usuarios("Pedro", "Suarez"));
        usuarios.save(new Usuarios("Ana", "Ortiz"));
        usuarios.save(new Usuarios("Ana", "Martinez"));
        usuarios.save(new Usuarios("Ana", "Diaz"));
        usuarios.save(new Usuarios("Juan", "Perez"));
    }

    @Override
    public ConsultaResponse saludo(String nombre) {
        ConsultaResponse respuesta =  new ConsultaResponse();
        respuesta.setInformacion(personajes(nombre));
        return respuesta;
    }

    private List<Usuarios> personajes(String name) {
        return usuarios.findByNombre(name);
    }


}
