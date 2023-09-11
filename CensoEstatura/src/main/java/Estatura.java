import java.util.Arrays;

public class Estatura {
 private String[] nombre;
 private String[] genero;
 private Double[] altura;

    public Estatura() {
    }

    public Estatura(String[] nombre, String[] genero, Double[] altura) {
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getGenero() {
        return genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    public Double[] getAltura() {
        return altura;
    }

    public void setAltura(Double[] altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Estatura{" +
                "nombre=" + Arrays.toString(nombre) +
                ", genero=" + Arrays.toString(genero) +
                ", altura=" + Arrays.toString(altura) +
                '}';
    }
    public void setnombre(int index, String dato){
        nombre[index] = dato;
    }
    public void setgenero(int index, String dato){
        genero[index] = dato;
        
    }
    public void setaltura(int index, Double dato){
        altura[index] = dato;
    }

    public void setnombre(String[] inicial1) {
    }

    public void setnombre(Double[] inicial2) {
    }
}
