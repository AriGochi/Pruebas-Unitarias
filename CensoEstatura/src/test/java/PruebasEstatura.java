import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebasEstatura {
    @Test
    public void pruebaUno(){
        CensoEstatura data = new CensoEstatura();
        double[] inicial ={1.70, 1.58, 1.62, 1.85};
        data.setRegistros(inicial);
        double[] esperado = {1.70, 1.58, 1.62, 1.85};
        Assertions.assertArrayEquals( esperado, data.getRegistros());
    }
}
