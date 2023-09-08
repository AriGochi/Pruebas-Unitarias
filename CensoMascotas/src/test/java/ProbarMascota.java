import org.example.Mascota;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProbarMascota {
    @Test
    public void ProbarNombre() {
        Mascota mascota = new Mascota();
        String[] inicial = {"Kane", "Mediano", "Perro"};
        mascota.setNombre(inicial);
        String[] esperado = {"Kane", "Mediano", "Perro"};
        Assertions.assertArrayEquals(esperado, mascota.getNombre());

    }

    @Test
    public void ProbarTamaño() {
        Mascota mascota = new Mascota();
        String[] inicial2 = {"Nena", "Chico", "Gato"};
        mascota.setTamaño(inicial2);
        String[] esperado2 = {"Nena", "Chico", "Gato"};
        Assertions.assertArrayEquals(esperado2, mascota.getTamaño());


    }

    @Test
    public void ProbarTipo() {
        Mascota mascota = new Mascota();
        String[] inicial3 = {"Koda", "Chico", "Oso"};
        mascota.setTipo(inicial3);
        String[] esperado3 = {"Koda", "Chico", "Oso"};
        Assertions.assertArrayEquals(esperado3, mascota.getTipo());
    }
    @Test
    public void ProbarNombreFiferente() {
        Mascota mascota = new Mascota();
        String[] inicial3 = {"Koda", "Chico", "Oso"};
        mascota.setNombre(inicial3);
        String[] esperado3 = {"Akini", "Chico", "Oso"};
        Assertions.assertNotEquals(esperado3, mascota.getNombre());

    }
}
