
/* Codigo que le pide ingresar al ususario 3 numeros entero, los ordena de manera ascendente y descendente y los imprime en la consola */

// Requerimos el módulo readline para poder leer datos de entrada del usuario
const leerLinea = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

// Pedimos al usuario que ingrese un número entero mediante la función "question" del módulo readline
leerLinea.question('Ingresa un numero entero:', (numero1) => {
    // Verificamos si el dato ingresado no es un número o si es un número decimal
    if(isNaN(numero1) || !Number.isInteger(parseInt(numero1, 10))){
        // Si no es un número o es un número decimal, se imprime un mensaje de error y se cierra la interfaz readline
        console.log("No ingresaste un numero entero");
        leerLinea.close();
    } else {
        // Si el dato ingresado es un número entero, se convierte a entero y se procede a pedir el siguiente número
        numero1 = parseInt(numero1, 10);
        leerLinea.question('Ingresa un numero entero:', (numero2)=> {
            // Verificamos si el dato ingresado no es un número o si es un número decimal
            if(isNaN(numero2) || !Number.isInteger(parseInt(numero2, 10))){
                // Si no es un número o es un número decimal, se imprime un mensaje de error y se cierra la interfaz readline
                console.log("No ingresaste un numero entero");
                leerLinea.close();
            } else {
                // Si el dato ingresado es un número entero, se convierte a entero y se procede a pedir el siguiente número
                numero2 = parseInt(numero2, 10);
                leerLinea.question('Ingresa un numero entero:', (numero3) => {
                    // Verificamos si el dato ingresado no es un número o si es un número decimal
                    if(isNaN(numero3) || !Number.isInteger(parseInt(numero3, 10))){
                        // Si no es un número o es un número decimal, se imprime un mensaje de error y se cierra la interfaz readline
                        console.log("No ingresaste un numero entero");
                        leerLinea.close();
                    } else {
                        // Si el dato ingresado es un número entero, se convierte a entero y se procede a verificar cuál es el número más grande
                        numero3 = parseInt(numero3, 10);
                        if((numero1==numero2) && (numero2 == numero3)){
                            // Si los tres números son iguales, se imprime un mensaje indicándolo y se cierra la interfaz readline
                            console.log(`Todos los numeros son iguales y son ${numero1}`);
                            leerLinea.close();
                        }else{  
                            // Si los números no son iguales, se procede a verificar cuál es el número más grande
                            if ((numero1 >= numero2) && (numero1 >= numero3)){
                                // Si el número 1 es el más grande, se establece como número grande, el número 1
                                // y se procede a verificar cuál de los otros dos números es el siguiente más grande
                                var numeroGrande = numero1;
                                if (numero2 >= numero3){
                                    var numeroMediano = numero2;
                                    var numeroPequeño = numero3;
                                }else{
                                    var numeroMediano = numero3;
                                    var numeroPequeño = numero2;
                                }
                            }else if ((numero2 >= numero1) && (numero2 >= numero3)){
                                var numeroGrande = numero2;
                                if (numero1 >= numero3){
                                    var numeroMediano = numero1;
                                    var numeroPequeño = numero3;
                                }else{
                                    var numeroMediano = numero3;
                                    var numeroPequeño = numero1;
                                }
                            }else if ((numero3 >= numero1) && (numero3 >= numero2)){
                                var numeroGrande = numero3;
                                if (numero1 >= numero2){
                                    var numeroMediano = numero1;
                                    var numeroPequeño = numero2;
                                }else{
                                    var numeroMediano = numero2;
                                    var numeroPequeño = numero1;
                                }
                            }

                            console.log(numeroGrande, numeroMediano, numeroPequeño); //imprimimos el orden ascendente y descendente
                            console.log(numeroPequeño, numeroMediano, numeroGrande);
                            leerLinea.close();
                        }
                    }
                });
            }
        });
    }
});

