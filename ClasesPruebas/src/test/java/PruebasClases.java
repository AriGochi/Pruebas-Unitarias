import org.example.Automovil;
import org.example.Guitarra;
import org.example.Monitor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class PruebasClases {
    @Test
    public void PruebasAutomovil() {
        Automovil auto = new Automovil("Nissan", "Skylan", (byte) 63, "Azul");
        String esperado = "Nissan";
        Assertions.assertEquals(esperado, auto.getMarca());

    }

    @Test
    public void PruebasMonitor() {
        Monitor monitor = new Monitor(14.2, "LG", "3570Lg", "Oled", 15.799);
        Double esperado = 15.799;
        Assertions.assertEquals(esperado, monitor.getPrecio());
    }

    @Test
    public void PruebasGuitarra() {
        Guitarra guitarra = new Guitarra("Yamaha", 6, "Electrica", Color.GREEN);
        int esperado = 6;
        Assertions.assertEquals(esperado, guitarra.getCuerdas());
    }

    @Test
    public void PruebasGuitarra2() {
        Guitarra guitarra = new Guitarra("Yamaha", 6, "Electrica", Color.GREEN);
        Color esperado = Color.GREEN;
        Assertions.assertEquals(esperado, guitarra.getColor());
    }
}