
$(document).ready(function() {
    //Crear Usuarios
});

    async function registrarUsuario(){

    //variable para crear datos

    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;

        if(repetirPassword != datos.password){
          alert('La contraseña que escribiste es diferente.');
          return;
        }


      //Función fetch para llamar a un servidor

      const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
    alert("La cuenta fu creada con exito!");
    window.location.href = 'login.html'
}
