fun main() {
    //Declaración de un array de números enteros
    val numeros = arrayOf(2, 4, 6, 8, 10)

    //Accediendo a los elementos del array
    println("El numero en la posicion 0 es: " + numeros[0])//imprime el numero: 2
    println("El numero en la posicion 3 es: " + numeros[4])//imprime el numero: 10

    //Modificando un elemento del array
    numeros[1] = 4
    println("Se ha modificado la posicion 2 del arreglo: " + numeros[2])//Imprime: 4

    //Iterando sobre los elementos del array con un for Loop
    for (numero in numeros) {
        println(numero)
    }
}