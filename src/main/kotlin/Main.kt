fun main() {
    variablesEntornoYPropiedadesSistema()
}

fun variablesEntornoYPropiedadesSistema(){
    println("Variables de entorno\n")
    System.getenv().forEach{
        println("${it.key} : ${it.value}")
    }


    println("\nPropiedades del sistema\n")
    System.getProperties().forEach{
        println("${it.key} : ${it.value}")
    }
}