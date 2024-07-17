package com.practicaJava.practica.controllers;


import com.practicaJava.practica.dao.UsuarioDao;
import com.practicaJava.practica.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UsuarioController {

    //Inyeccion de dependencias usuariodao
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Daniel");
        usuario.setApellido("Nuñez");
        usuario.setEmail("invdesdev@outlook.com");
        usuario.setTelefono("9410333333");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
         usuarioDao.registrar(usuario);
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