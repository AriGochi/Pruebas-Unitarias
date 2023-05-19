import org.example.CensoEdades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebasCenso {


    @Test
    public void pruebaUno(){
        CensoEdades data = new CensoEdades();
        int[] inicial = {19,22,0,0,0,0,0,0,0,0};
        data.setRegistros(inicial);
        int[] esperado = {19,22,0,0,0,0,0,0,0,0};
        Assertions.assertArrayEquals ( esperado, data.getRegistros());
    }

}
