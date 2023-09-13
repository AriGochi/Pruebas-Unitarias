import java.util.Arrays;

public class Usuario {
    private String[] nombre;
    private String[] apellido;
    private int[] edad;

    public Usuario() {
    }

    public Usuario(String[] nombre, String[] apellido, int[] edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre=" + Arrays.toString(nombre) +
                ", apellido=" + Arrays.toString(apellido) +
                ", edad=" + Arrays.toString(edad) +
                '}';
    }

    public void setNombre(int index, String dato) {
        nombre[index] = dato;

    }

    public void setApellido(int index, String dato) {
        apellido[index] = dato;
    }

    public void setEdad(int index, int dato) {
        edad[index] = dato;
    }

    public void setEdad(String[] inicial3) {
    }

    public void setApellido(int[] inicial3) {
    }
}