fun main(){
    print("Ingrese la cantidad de personas a saludar: ")
    val cantPersonas = readLine()!!.toInt()
    var contador=1
    do{
        print("Ingrese el nombre de la persona $contador: ")
        val nombre = readLine()!!
        println("Hola $nombre, ¡Bienvenido!")
        contador++

    }while(contador <= cantPersonas)

}