package com.practicaJava.practica.dao;


import com.practicaJava.practica.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    //Metodo para Traer Usuario
    List<Usuario> getUsuarios();

    //Metodo para Eliminar Usuario
    void eliminar(Long id);

    //Metodo para Crear Usuario
    void registrar(Usuario usuario);


    boolean verificarCredenciales(Usuario usuario);

}
