import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruUsuario {
    @Test
    public void PruebaNombre() {
        Usuario usuario = new Usuario();
        String[] inicial = {"Pedro", "Perez", "Jesus"};
        usuario.setNombre(inicial);
        String[] esperado = {"Pedro", "Perez", "Pilar"};
        Assertions.assertNotEquals(esperado, usuario.getNombre());
    }

    @Test
    public void PruebaApellido() {
        Usuario usuario = new Usuario();
        String[] inicial2 = {"Perez", "Soto", "Guzman"};
        usuario.setApellido(inicial2);
        String[] esperado2 = {"Perez", "Soto", "Guzman"};
        Assertions.assertArrayEquals(esperado2, usuario.getApellido());
    }

    @Test
    public void PruebaEdad() {
        Usuario usuario = new Usuario();
        int[] inicial3 = {18, 19, 20};
        usuario.setEdad(inicial3);
        int[] esperado3 = {18,19,20};
        Assertions.assertArrayEquals(esperado3, usuario.getEdad());
    }
}
