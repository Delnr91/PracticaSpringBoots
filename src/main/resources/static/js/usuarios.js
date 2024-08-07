// Call the dataTables jQuery plugin
$(document).ready(function() {
    //Crear la funcion para cargar los Usuarios
    cargarUsuarios();

  $('#usuarios').DataTable();

  actualizarEmailDelUsuario();

});

function actualizarEmailDelUsuario(){
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}

async function cargarUsuarios(){

        //Función fetch para llamar a un servidor

      const request = await fetch('api/usuarios', {
        method: 'GET',
        headers: getHeaders()
      });
      const usuarios = await request.json();


       //variable para el listado del html
       let listadoHtml = '';
      for (let usuario of usuarios){

            //variable para el Boton Eliminar
            let btnEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"> </i></a>' ;

            let telefonoTexto = usuario.telefono == null? '-' : usuario.telefono;

            let usuarioHtml = '<tr><td>' + usuario.id + '</td><td>' + usuario.nombre + ' ' + usuario.apellido + '</td> <td>'
                              + usuario.email + '</td><td>' + telefonoTexto
                              + '</td><td>' + btnEliminar  + '</td></tr>';
            listadoHtml += usuarioHtml;
      }

      console.log(usuarios);

       //variable usuario


   //codigo html para el body
    document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}

    function getHeaders(){
     return {
                   'Accept': 'application/json',
                   'Content-Type': 'application/json',
                   'Authorization': localStorage.token
                };

    }
    //Función para Eliminar el usuario
    async function eliminarUsuario(id) {

    //!confirm para que entre el if solo si se apreta en cancelar, de lo contrario siga el proceso,

       if (!confirm('¿Desea eliminar este usuario?')){
            return;
        }

       const request = await fetch('api/usuarios/' + id, {
            method: 'DELETE',
            headers: getHeaders()
          });

          //variable para relogear pagina
        location.reload()
    }