const numeroSecreto = 47; 
const intentos = [];

const adivinar = () => {
    const numero = Number(document.getElementById("numero").value);

    if (numero === numeroSecreto) {
        document.getElementById("mensaje").textContent = `Felicidades, adivinaste el número secreto y estos son todos los numero que probaste ${intentos}`;
    } else {
        intentos.push(numero);
        const lista = document.getElementById("intentos");
        const item = document.createElement("li");
        item.textContent = `Ups, el número ${numero} es incorrecto, vuelve a intentarlo.`;
        lista.appendChild(item);
        document.getElementById("numero").value = "";
        }
      };

document.getElementById("adivinar").addEventListener("click", adivinar);

