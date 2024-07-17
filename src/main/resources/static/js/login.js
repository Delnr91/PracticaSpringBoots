
$(document).ready(function() {
    //Login Usuarios
});

    async function iniciarSesion(){
    //variable para crear datos

    let datos = {};

    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

      //Función fetch para llamar a un servidor

    const request = await fetch('api/login', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });

    const respuesta = await request.text();

    if(respuesta == 'OK'){
        window.location.href = 'usuarios.html'
    }else {
        alert("Las credenciales son incorrectas, Por favor prueba otra vez");
    }

}
