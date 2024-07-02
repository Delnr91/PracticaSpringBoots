package com.practicaJava.practica.controllers;


import com.practicaJava.practica.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usu = new Usuario();
        usu.setId(234L);
        usu.setNombre("Daniel");
        usu.setApellido("Nuñez");
        usu.setEmail("invdesdev@outlook.com");
        usu.setTelefono("9410333333");

        Usuario usu2 = new Usuario();
        usu2.setId(456L);
        usu2.setNombre("Migul");
        usu2.setApellido("hay MIGUEL");
        usu2.setEmail("invdesdevc@outlook.com");
        usu2.setTelefono("941033213");

        Usuario usu3 = new Usuario();
        usu3.setId(678L);
        usu3.setNombre("Demente");
        usu3.setApellido("Nuñez");
        usu3.setEmail("invdesdevf@outlook.com");
        usu3.setTelefono("71928030");

        usuarios.add(usu);
        usuarios.add(usu2);
        usuarios.add(usu3);

        return usuarios;
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