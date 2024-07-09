// Call the dataTables jQuery plugin
$(document).ready(function() {
    //Crear la funcion para cargar los Usuarios
    cargarUsuarios();

  $('#usuarios').DataTable();
});

async function cargarUsuarios(){

        //Función fetch para llamar a un servidor

      const request = await fetch('api/usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const usuarios = await request.json();


       //variable para el listado del html
       let listadoHtml = '';
      for (let usuario of usuarios){

            //variable para el Boton Eliminar
            let btnEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"> </i></a>' ;

            let usuarioHtml = '<tr><td>' + usuario.id + '</td><td>' + usuario.nombre + ' ' + usuario.apellido + '</td> <td>'
                              + usuario.email + '</td><td>' + usuario.telefono
                              + '</td><td>' + btnEliminar  + '</td></tr>';
            listadoHtml += usuarioHtml;
      }

      console.log(usuarios);

       //variable usuario


   //codigo html para el body
    document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}
    //Función para Eliminar el usuario

    function eliminarUsuario(id) {
        alert(id);
    }