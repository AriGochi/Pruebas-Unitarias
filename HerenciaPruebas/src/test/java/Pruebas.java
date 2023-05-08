import org.example.Automovil;
import org.example.Taxi;
import org.example.Vehiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Pruebas {

    @Test
    public void PruebasVehiculo() {
        Vehiculo vehiculo = new Vehiculo("Carro", "Mediana", 4, 5);
        int esperado = 5;
        Assertions.assertEquals(esperado, vehiculo.getCapacidadAsientos());

    }

    @Test
    public void PruebasAutomovil() {
        Automovil automovil = new Automovil("Automovil", "Mediana", 4, 5, "Jeep", " Año 2023", 56, 250);
        int esperado = 56;
        Assertions.assertEquals(esperado, automovil.getCapacidadLitros());

    }

    @Test
    public void PruebasTaxi() {
        Taxi taxi1 = new Taxi("Automovil","Mediana",4,5,"Tsuru Tuneado","Año 2000",40,180,"$30 pesos","Uber",5);
        int esperado = 180;
        Assertions.assertEquals(esperado, taxi1.getVelocidad());

    }
}