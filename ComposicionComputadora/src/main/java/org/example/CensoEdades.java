package org.example;

import java.util.Arrays;

public class CensoEdades {
    private int[] registros;

    public CensoEdades(int[] registros) {
        this.registros = registros;
    }

    public CensoEdades() {
        registros = new int[10];
    }

    public int[] getRegistros() {
        return registros;
    }

    public void setRegistros(int[] registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return "CensoEdades{" +
                "registros=" + Arrays.toString(registros) +
                '}';
    }

    public void setRegistro(int index, int dato){
        registros[index] = dato;
    }


}
