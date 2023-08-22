import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Pruebas {
    @Test
    public void PruebaUno(){
        CensoCalificaciones data = new CensoCalificaciones();
        double[] inicial = {10, 9.5, 8, 10, 9.2};
        data.setCalificaciones(inicial);
        double[] esperado = {10, 9.5, 8, 10, 9.2};
        Assertions.assertArrayEquals(esperado, data.getCalificaciones());
    }
}
