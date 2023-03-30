/**
 * Obtiene el número de elementos de la serie de Fibonacci a calcular a partir de un input HTML,
 * llama a la función fibonacci para calcular la serie y guarda el resultado en una lista,
 * y finalmente muestra el resultado en otro elemento HTML.
 */
function calcularFibonacci() {
    // Obtiene el número de elementos de la serie a calcular a partir de un input HTML
    const numeroElementos = document.getElementById("fibonacci").value;
  
    // Llama a la función fibonacci para calcular la serie y guarda el resultado en una lista
    const resultadoFibonacci = fibonacci(numeroElementos);
  
    // Muestra el resultado de la serie en otro elemento HTML
    document.getElementById("resultadoFibonacci").textContent = `La serie de Fibonacci hasta el elemento ${numeroElementos} es: ${resultadoFibonacci}`;
  }
  
  
   /* Calcula los primeros n+1 términos de la serie de Fibonacci y los devuelve como una lista. */
  function fibonacci(n) {
    if (n <= 1) {
      // Si n es menor o igual a 1, devuelve una lista con los primeros n+1 términos de la serie de Fibonacci
      return [0, 1].slice(0, n + 1);
    } else {
      // Si n es mayor que 1, llama a sí misma con n-1 para obtener los primeros n términos de la serie de Fibonacci,
      // y luego calcula el último término de la serie sumando los dos términos anteriores.
      const fiboAnterior = fibonacci(n - 1);
      const nuevoTermino = fiboAnterior[fiboAnterior.length - 1] + fiboAnterior[fiboAnterior.length - 2];
  
      // Devuelve una lista que incluye los primeros n términos de la serie de Fibonacci, seguidos del último término calculado.
      return [...fiboAnterior, nuevoTermino];
    }
  }