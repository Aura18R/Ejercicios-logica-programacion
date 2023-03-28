
function convertirGrados(){

const gradosCelsius = document.getElementById("gradosCelsius").value; //Traemos con el DOM el valor del input

// Validamos si el valor ingresado es un número
if (isNaN(gradosCelsius)) {
    alert('Por favor, ingresa un número válido.');
    return;
  }

let resultadoFarenheit; //Creamos nuestras variables
let resultadoKelvin;

//Aplicamos las formulas
resultadoFarenheit = (gradosCelsius*1.8) + 32;
resultadoKelvin =  gradosCelsius + 273.15;

//Modificamos el contenido de las etiquetas p con ayuda del DOM
document.getElementById("resultadoFarenheit").textContent = `${gradosCelsius}° Celsius son equivalentes a ${resultadoFarenheit}° Farenheit`;
document.getElementById("resultadoKelvin").textContent = `${gradosCelsius}° Celsius son equivalentes a ${resultadoKelvin}° Kelvin`;

}
