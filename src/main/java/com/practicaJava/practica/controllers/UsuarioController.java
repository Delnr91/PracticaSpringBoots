package com.practicaJava.practica.controllers;


import com.practicaJava.practica.dao.UsuarioDao;
import com.practicaJava.practica.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UsuarioController {

    //Inyeccion de dependencias usuariodao
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable long id){
        Usuario usu = new Usuario();
        usu.setId(id);
        usu.setNombre("Daniel");
        usu.setApellido("Nuñez");
        usu.setEmail("invdesdev@outlook.com");
        usu.setTelefono("9410333333");
        return usu;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
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

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)

    public void eliminar(@PathVariable Long id){
         usuarioDao.eliminar(id);

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