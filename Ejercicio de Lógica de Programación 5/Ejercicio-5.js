const numeroSecreto = 47; //deckaramos el numero secreto
const intentos = []; //la lista para guardar el numero de intentos

//Funcion adivinar que trae con ayuda del DOM el valor del textfield lo compara y determina si coincide o no
const adivinar = () => {
    const numero = Number(document.getElementById("numero").value);//valor del textfield

    if (numero === numeroSecreto) { //si el numero coincide muestra un mensaje de felicitacion
        document.getElementById("mensaje").textContent = `Felicidades, adivinaste el número secreto y estos son todos los numero que probaste ${intentos}`;
    } else {
        intentos.push(numero); //si no agrega ese numero a la lista de numeros fallidos y crea el mensaje 
        const lista = document.getElementById("intentos");
        const item = document.createElement("li");
        item.textContent = `Ups, el número ${numero} es incorrecto, vuelve a intentarlo.`;
        lista.appendChild(item);
        document.getElementById("numero").value = ""; //borra el valor del textfield para que el usuario lo vuelva a intentar
        }
      };

document.getElementById("adivinar").addEventListener("click", adivinar); //escucha el evento click en el boton y ejecuta la funcion 

