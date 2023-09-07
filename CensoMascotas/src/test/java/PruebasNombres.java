import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebasNombres {
    @Test
    public void Pruebauno(){
        CensoMascotas data = new CensoMascotas();
        String [] inicial = {"Kane","Moli","Duke"};
        data.setNombres(inicial);
        String[] esperado = {"Kane","Moli","Duke"};
        Assertions.assertArrayEquals( esperado,data.getNombres());

    }
    @Test
    public void pruebaDos(){
        CensoMascotas data = new CensoMascotas();
        String [] inicial2 = {"Fido", "Lola", "Rocky", "Canela", "Simba"};
        data.setNombres(inicial2);
        String[] esperado2 = {"Fido", "Lola", "Rocky", "Canela", "Simba"};
        Assertions.assertArrayEquals(esperado2, data.getNombres());
    }
    @Test
    public void pruebaTres(){
        CensoMascotas data = new CensoMascotas();
        String[] inicial3 ={"Peque", "MOca", "Choco","Mora"};
        data.setNombres(inicial3);
        String[] esperado3 = {"Peque", "MOca", "Choco","Mora"};
        Assertions.assertArrayEquals(esperado3,data.getNombres());


    }
}