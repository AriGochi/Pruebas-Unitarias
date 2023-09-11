import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruEstatura {
    @Test
    public void ProbarNombre() {
        Estatura estatura = new Estatura();
        String[] inicial1 = {"Carlos", "rOSA", "Luz"};
        estatura.setnombre(inicial1);
        String[] esperado1 = {"Juan", "Mona","Luz"};
        Assertions.assertNotEquals(esperado1, estatura.getNombre());

    }

    @Test
    public void ProbarGenero() {
        Estatura estatura = new Estatura();
        String[] inicial2 = {"Masculino", "Masculino", "Masculino"};
        estatura.setnombre(inicial2);
        String[] esperado2 = {"Masculino", "Genero", "Masculino"};
        Assertions.assertNotEquals(esperado2, estatura.getGenero());
    }

    @Test
    public void ProbarAltura() {
        Estatura estatura = new Estatura();
        Double[] inicial2 = {1.80, 1.75, 1.70, 1.60};
        estatura.setnombre(inicial2);
        Double[] esperado2 = {1.80, 1.75, 1.70, 1.60};
        Assertions.assertNotEquals(esperado2, estatura.getGenero());

    }
}
