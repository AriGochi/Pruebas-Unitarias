import org.example.Persona;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebaPersona {

    @Test
    public void PruebasPersona2() {
        Persona persona2 = new Persona("Juanito", 20, 1.76, 70, "Masculino");
        int esperado = 20;
        Assertions.assertEquals(esperado, persona2.getEdad());
    }

    @Test
    public void CambiarPeso() {
        Persona persona3 = new Persona("Pedro", 40, 1.80, 90.0, "Maculino");

        persona3.setPeso(85.0);
        double esperado = 85;
        Assertions.assertEquals(esperado, persona3.getPeso());
    }
    //Pruebas con NotNull y Null

    @Test
    public void testConstructorPersona() {

        // Prueba para verificar que el constructor de Persona inicialice correctamente los atributos
        Persona persona = new Persona("Juan", 25, 1.75, 70.5, "Masculino");

        Assertions.assertNotNull(persona);
        Assertions.assertEquals("Juan", persona.getNombre());
        Assertions.assertEquals(25, persona.getEdad());
        Assertions.assertEquals(1.75, persona.getEstatura(), 0.01);
        Assertions.assertEquals(70.5, persona.getPeso(), 0.01);
        Assertions.assertEquals("Masculino", persona.getGenero());
    }
    @Test
    public void testNombreNoNulo() {
        Persona persona = new Persona("Ari", 25, 1.75, 70.5, "Masculino");

        Assertions.assertNotNull(persona.getNombre());
    }

    @Test
    public void testGeneroNoNulo() {
        Persona persona = new Persona("Juan", 25, 1.75, 70.5, "Masculino");

        Assertions.assertNotNull(persona.getGenero());
    }

    @Test
    public void testEstaturaNoNula() {
        Persona persona = new Persona("Juan", 25, 1.75, 70.5, "Masculino");

        Assertions.assertNotNull(persona.getEstatura());
    }

    @Test
    public void testPesoNoNulo() {
        Persona persona = new Persona("Juan", 25, 1.75, 70.5, "Masculino");

        Assertions.assertNotNull(persona.getPeso());
    }

    @Test
    public void testEdadNoNula() {
        Persona persona = new Persona("Juan", 25, 1.75, 70.5, null);

        Assertions.assertNotNull(persona.getEdad());
        Assertions.assertNull(persona.getGenero());
    }

    @Test
    public void testConstructorPersonaSinGenero() {

        Persona persona = new Persona("Juan", 25, 1.75, 70.5, null);

        Assertions.assertNotNull(persona);
        Assertions.assertNull(persona.getGenero());
    }
}


