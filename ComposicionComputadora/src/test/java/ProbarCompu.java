import org.example.Computadora;
import org.example.Mouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProbarCompu {

    @Test
    public void pruebaRatonNoNulo(){
        Computadora compu = new Computadora("Dell",new Mouse("Logitech","G300"));
        Assertions.assertNotNull(compu.getRaton());
    }
    @Test
    public void pruebaRatonNulo(){
        Computadora compu = new Computadora("Dell",null);
        Assertions.assertNull(compu.getRaton());
    }
}
