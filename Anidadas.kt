
fun main(){
    println("Ingrese el numero 1: ")
    println("Ingrese el numero 2: ")

    val a= readLine()!!.toInt()
    val b= readLine()!!.toInt()

    if (a > b){
        println("$a es mayor que $b")
    }else{
        if (b > a){
            println("$b es mayor que $a")
        }else{
            println("$a es mayor que $b")
        }
    }
    

}