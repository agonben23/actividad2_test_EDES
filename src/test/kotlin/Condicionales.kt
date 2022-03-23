import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledIfSystemProperty

class Condicionales {

    @Test
    @EnabledIfSystemProperty(named = "java.version",matches = "17")
    internal fun javaVersion(){
        println("Estás en la java version 17")
    }

    @Test
    @EnabledIfSystemProperty(named = "user.country", matches = "ES")
    internal fun pais(){
        println("Arriba España!!")
    }
}