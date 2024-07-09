package com.practicaJava.practica.dao;



import com.practicaJava.practica.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    //Metodo para Traer Usuarios
    List<Usuario> getUsuarios();

    //Metodo para Eliminar Usuarios
    void eliminar(Long id);
}
