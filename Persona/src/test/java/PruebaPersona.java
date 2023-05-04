import org.example.Persona;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebaPersona {
    @Test
    public void PruebasPersona() {
        Persona persona = new Persona("Ari", 19, 1.58, 52, "Femenino");
        String esperado = "Ari";
        Assertions.assertEquals(esperado, persona.getNombre());

    }

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
}

