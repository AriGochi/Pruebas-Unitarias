import java.util.Arrays;

public class Libros {
    private String[] titulo;
    private String[] autor;
    private String[] editorial;

    public Libros() {
    }

    public Libros(String[] titulo, String[] autor, String[] editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String[] getTitulo() {
        return titulo;
    }

    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
    }

    public String[] getAutor() {
        return autor;
    }

    public void setAutor(String[] autor) {
        this.autor = autor;
    }

    public String[] getEditorial() {
        return editorial;
    }

    public void setEditorial(String[] editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo=" + Arrays.toString(titulo) +
                ", autor=" + Arrays.toString(autor) +
                ", editorial=" + Arrays.toString(editorial) +
                '}';
    }

    public void setTitulo(int index, String dato) {
        titulo[index] = dato;

    }

    public void setAutor(int index, String dato) {
        autor[index] = dato;
    }

    public void setEditorial(int index, String dato) {
        editorial[index] = dato;

    }
}
