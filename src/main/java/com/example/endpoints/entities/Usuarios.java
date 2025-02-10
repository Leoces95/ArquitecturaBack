package com.example.endpoints.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@Data
@NoArgsConstructor
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = false)
    private String nombre;

    @Column(nullable = true)
    private String apellido;

    public Usuarios(String nombre, String apellido){
        this.nombre =  nombre;
        this.apellido =  apellido;
    }

}
