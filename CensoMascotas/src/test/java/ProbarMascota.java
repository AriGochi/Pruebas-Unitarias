import org.example.Mascota;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProbarMascota {
    @Test
    public void pruebaTipoNoNulo() {
        Mascota mascota = new Mascota("Dell", "Caballo", "Grande");
        Assertions.assertNotNull(mascota.getTipo());
    }

    @Test
    public void PruebaTamañoNoNulo() {
        Mascota mascota = new Mascota("Dell", "Caballo", "Grande");
        Assertions.assertNotNull(mascota.getTamaño());
    }

    @Test
    public void PruebaNombreNoNulo() {
        Mascota mascota = new Mascota("Dell", "Caballo", "Grande");
        Assertions.assertNotNull(mascota.getNombre());

    }
    @Test
    public void pruebaNombreNulo(){
        Mascota compu = new Mascota(null,"Gato", "Chico");
        Assertions.assertNull(compu.getNombre());
    }
    @Test
    public void pruebaTipoNulo(){
        Mascota compu = new Mascota("Kane",null, "Chico");
        Assertions.assertNull(compu.getTipo());
    }
    @Test
    public void pruebaTamañoNulo(){
        Mascota compu = new Mascota("Molly","Gato", null);
        Assertions.assertNull(compu.getTamaño());
    }
}
