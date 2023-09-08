import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class PruebaLibro {
    @Test
    public void pruebaUno(){ //En esta prueba todo deberia salir bien
        CensoLibros data = new CensoLibros();
        int[] inicial = {1, 2, 1, 2, 1,0,1};
        data.setLibrosleidos(inicial);
        int[] esperado = {1, 2, 1, 2, 1, 0,1 };
        Assertions.assertArrayEquals(esperado, data.getLibrosleidos() );

    }
    @Test
    public void pruebaDos(){

        CensoLibros data = new CensoLibros();
        int[] inicial2= {1, 2,0,1,1,0,1};
        data.setLibrosleidos(inicial2);
        int[] esperado2 = {1, 2, 0,1,1,9, 1};
        Assertions.assertNotEquals(esperado2, data.getLibrosleidos());

    }

}
