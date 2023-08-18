import java.util.Arrays;

public class CensoEstatura {
    private double[] registros;

    public CensoEstatura() {
    }

    public CensoEstatura(double[] registros) {
        this.registros = registros;
    }

    public double[] getRegistros() {
        return registros;
    }

    public void setRegistros(double[] registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return "CensoEstatura{" +
                "registros=" + Arrays.toString(registros) +
                '}';
    }

    public void setRegistro(int index, double dato) {
        registros[(int) index] = dato;
    }

}
