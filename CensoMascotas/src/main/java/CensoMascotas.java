import java.util.Arrays;

public class CensoMascotas {
    private String[] Nombres;

    public CensoMascotas() {
        Nombres = new String[5];
    }

    public CensoMascotas(String[] nombres) {
        Nombres = nombres;
    }

    public String[] getNombres() {
        return Nombres;
    }

    public void setNombres(String[] nombres) {
        Nombres = nombres;
    }

    @Override
    public String toString() {
        return "CensoMascotas{" +
                "Nombres=" + Arrays.toString(Nombres) +
                '}';
    }
    public void SetNombres(String index, String dato){
        Nombres[Integer.parseInt(index)] = dato;


    }
}
