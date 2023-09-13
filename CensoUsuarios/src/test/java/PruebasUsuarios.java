import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebasUsuarios {
    @Test
    public void pruebaUno() {
        CensoUsuarios data = new CensoUsuarios();
        String[] inicial = {"usuario1", "usuario2", "usuario3"};
        data.setUsuarios(inicial);
        String[] esperado = {"usuario1", "usuario2", "usuario3"};
        Assertions.assertArrayEquals(esperado, data.getUsuarios());

    }

    @Test
    public void pruebaDos() { //Marca error
        CensoUsuarios data = new CensoUsuarios();
        String[] inicial3 = {"usuarioA", "usuarioB", "usuarioC"};
        data.setUsuarios(inicial3);
        String[] esperado3 = {"usuarioC", "usuarioE", "usuarioP"};
        Assertions.assertNotEquals(esperado3, data.getUsuarios());
    }

    @Test
    public void pruebaTres() {
        CensoUsuarios data = new CensoUsuarios();
        String[] inicial2 = {"usuarioO", "usuarioR", "usuarioC"};
        data.setUsuarios(inicial2);
        String[] esperado2 = {"usuarioO", "usuarioR", "usuarioC"};
        Assertions.assertArrayEquals(esperado2, data.getUsuarios());


    }
}
