import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruLibro {
    @Test
    public void ProbarUno() {
        Libros libros = new Libros();
        String[] inicial = {"Lo que el viento se llevo", "Margaret Mitchell", "Macmillan Publishers"};
        libros.setTitulo(inicial);
        String[] esperado = {"Lo que el viento se llevo", "Margaret Mitchell", "Macmillan Publishers"};
        Assertions.assertArrayEquals(esperado, libros.getTitulo());

    }

    @Test
    public void ProbarAutor() {
        Libros libros = new Libros();
        String[] inicial1 = {"Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana"};
        libros.setAutor(inicial1);
        String[] esperado1 = {"Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana"};
        Assertions.assertArrayEquals(esperado1, libros.getAutor());

    }

    @Test
    public void ProbarEdit() {
        Libros libros = new Libros();
        String[] inicial2 = {"El amor en los tiempos del cólera", "Gabriel García Márquez", "La Oveja Negra Ltda"};
        libros.setEditorial(inicial2);
        String[] esperado2 = {"El amor en los tiempos del cólera", "Gabriel García Márquez", "La Oveja Negra Ltda"};
        Assertions.assertArrayEquals(esperado2, libros.getEditorial());


    }

    @Test
    public void ProbarTituloFiferente() {
        Libros libros = new Libros();
        String[] inicial3 = {"Lo que el viento se llevo", "Margaret Mitchell", "Macmillan Publishers"};
        libros.setTitulo(inicial3);
        String[] esperado3 = {"El amor en los tiempos del cólera", "Margaret Mitchell", "Macmillan Publishers"};
        Assertions.assertNotEquals(esperado3, libros.getTitulo());
    }

    @Test
    public void ProbarAutorDiferente() {
        Libros libros = new Libros();
        String[] inicial4 = {"Lo que el viento se llevo", "Margaret Mitchell", "Macmillan Publishers"};
        libros.setTitulo(inicial4);
        String[] esperado4 = {"El amor en los tiempos del cólera", "Pancho", "Macmillan Publishers"};
        Assertions.assertNotEquals(esperado4, libros.getTitulo());
    }

    @Test
    public void ProbarEditorialDiferente() {
        Libros libros = new Libros();
        String[] inicial5 = {"Lo que el viento se llevo", "Margaret Mitchell", "Macmillan Publishers"};
        libros.setTitulo(inicial5);
        String[] esperado5 = {"El amor en los tiempos del cólera", "Gabriel García Márquez", "No se"};
        Assertions.assertNotEquals(esperado5, libros.getTitulo());
    }
}
