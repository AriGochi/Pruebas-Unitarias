import java.util.Arrays;

public class CensoUsuarios {
    private String[] Usuarios;

    public CensoUsuarios(String[] usuarios) {
        Usuarios = usuarios;
    }

    public CensoUsuarios() {

    }

    public String[] getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(String[] usuarios) {
        Usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "CensoUsuarios{" +
                "Usuarios=" + Arrays.toString(Usuarios) +
                '}';
    }
    public void setUsuarios(String index, String dato){
        Usuarios[Integer.parseInt(index)] = dato;

    }
}
