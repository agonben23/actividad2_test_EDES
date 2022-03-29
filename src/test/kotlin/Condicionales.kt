import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class Condicionales {

    @Test
    @DisplayName("Test de la version de Java")
    @EnabledIfSystemProperty(named = "java.version",matches = "17")
    internal fun javaVersion(){
        println("Estás en la java version 17")
    }

    @Test
    @DisplayName("Test del pais del usuario")
    @EnabledIfSystemProperty(named = "user.country", matches = "ES")
    internal fun pais(){
        println("Arriba España!!")
    }

    @Test
    @DisplayName("Test de arquitectura de procesador")
    @EnabledIfEnvironmentVariable(named = "PROCESSOR_ARCHITECTURE", matches = "AMD64")
    internal fun testArquitectura(){
        println("Tiene una arquitectura de procesador AMD64")
    }

    @Test
    @DisplayName("Test de procesadores")
    @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "4")
    internal fun testProcesadores(){
        println("Tiene 4 procesadores")
    }

    @Test
    @DisplayName("Test de OS Linux")
    @EnabledOnOs(OS.LINUX)
    internal fun osLinux(){
        println("Este ordenador usa Linux")
    }

    @Test
    @DisplayName("Test de JRE de Java")
    @EnabledOnJre(JRE.JAVA_10)
    internal fun jre(){
        println("Este ordenador usa el JRE Java 10")
    }
}