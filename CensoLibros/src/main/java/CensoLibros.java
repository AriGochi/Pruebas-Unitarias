import java.util.Arrays;

public class CensoLibros {
    private int[] Librosleidos;

    public CensoLibros() {
        Librosleidos = new int[7];
    }

    public CensoLibros(int[] librosleidos) {
        Librosleidos = librosleidos;
    }

    public int[] getLibrosleidos() {
        return Librosleidos;
    }

    public void setLibrosleidos(int[] librosleidos) {
        Librosleidos = librosleidos;
    }

    @Override
    public String toString() {
        return "CensoLibros{" +
                "Librosleidos=" + Arrays.toString(Librosleidos) +
                '}';
    }
    public void setLibrosleidos(int index, int dato){
        Librosleidos[index] = dato;

    }
}
