import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruUsuario {
    @Test
    public void PruebaNombre() {
        Usuario usuario = new Usuario();
        String[] inicial = {"Pedro", "Perez", String.valueOf(12)};
        usuario.setNombre(inicial);
        String[] esperado = {"Pedro", "Perez", "Macmillan Publishers"};
        Assertions.assertNotEquals(esperado, usuario.getNombre());
    }

    @Test
    public void PruebadOS() {
        Usuario usuario = new Usuario();
        String[] inicial2 = {"Pedro", "Perez", String.valueOf(12)};
        usuario.setNombre(inicial2);
        String[] esperado2 = {"Pedro", "Perez", String.valueOf(12)};
        Assertions.assertArrayEquals(esperado2, usuario.getNombre());
    }

    @Test
    public void PruebaTRES() {
        Usuario usuario = new Usuario();
        String[] inicial3 = {"Juan", "Guzman", String.valueOf(19)};
        usuario.setNombre(inicial3);
        String[] esperado3 = {"Juan", "Guzman", String.valueOf(19)};
        Assertions.assertArrayEquals(esperado3, usuario.getNombre());
    }
}
