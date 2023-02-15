fun main(){
    var numero:Int
    var continuar = "Si"
    while(continuar.uppercase()== "SI"){
        print("Ingrese un numero: ")
        numero = readLine()!!.toInt()
        if(numero < 0){
            numero = numero * -1
        }
        print("El numero positivo es: $numero")
        print("¿Desea ingresar otro numero? (si/no): ")
        continuar = readLine()!!
    }
}