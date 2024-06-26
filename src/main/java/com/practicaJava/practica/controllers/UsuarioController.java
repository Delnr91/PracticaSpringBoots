package com.practicaJava.practica.controllers;


import com.practicaJava.practica.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usu/{id}")

    public Usuario getUsuario(@PathVariable long id){

        Usuario usu = new Usuario();
        usu.setId(id);
        usu.setNombre("Daniel");
        usu.setApellido("Nuñez");
        usu.setEmail("invdesdev@outlook.com");
        usu.setTelefono("9410333333");
        return usu;
    }

    @RequestMapping(value = "usu12")

    public Usuario editar(){

        Usuario usuario = new Usuario();

        usuario.setNombre("Daniel");
        usuario.setApellido("Nuñez");
        usuario.setEmail("invdesdev@outlook.com");
        usuario.setTelefono("9410333333");
        return usuario;
    }

    @RequestMapping(value = "usu13")

    public Usuario eliminar(){

        Usuario usuario = new Usuario();

        usuario.setNombre("Daniel");
        usuario.setApellido("Nuñez");
        usuario.setEmail("invdesdev@outlook.com");
        usuario.setTelefono("9410333333");
        return usuario;
    }
    @RequestMapping(value = "usu14")

    public Usuario buscar(){

        Usuario usuario = new Usuario();

        usuario.setNombre("Daniel");
        usuario.setApellido("Nuñez");
        usuario.setEmail("invdesdev@outlook.com");
        usuario.setTelefono("9410333333");
        return usuario;
    }
}