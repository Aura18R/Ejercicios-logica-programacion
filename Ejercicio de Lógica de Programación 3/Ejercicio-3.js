
/* Funcion que toma el valor del numero ingresado por el ususario, llama la funcion factorial para calcularlo y lo devuelve como el contenido de la etiqueta p atraves del DOM */
function calcularFactorial(){

    const numero = parseInt(document.getElementById("factorial").value);//guardamos el valor del input en numero y lo convertimos a un numero entero en caso de que sea numero decimal

    let resultadoFactorial = factorial(numero); //llamamos la funcion factorial y metemos como parametro numero

    document.getElementById("resultadoFactorial").textContent = `El factorial del numero ${numero} es ${resultadoFactorial}`; //escribimos el resultado dentro de la etiqueta p
}

/* Funcio que calcular el factorial de un numero recusrsivamente */
function factorial(numero){
    if(numero==0 || numero==1){
        return 1;
    }else{
        return (numero * factorial(numero - 1));
    }
}