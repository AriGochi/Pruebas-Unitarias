import java.util.Arrays;

public class CensoCalificaciones {
   private double[] Calificaciones;

    public CensoCalificaciones() {
    }

    public CensoCalificaciones(double[] calificaciones) {
        Calificaciones = calificaciones;
    }

    public double[] getCalificaciones() {
        return Calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        Calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "CensoCalificaciones{" +
                "Calificaciones=" + Arrays.toString(Calificaciones) +
                '}';
    }
    public void setCalificaciones(int index, int dato){ //Siempre sera INT  
        Calificaciones[index] = dato;
    }
}
