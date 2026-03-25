/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1carrera;

/**
 *
 * @author Antonio
 */
// Corredor.java
import java.time.Duration;

public class Corredor {
    private int dorsal;
    private Duration tiempo;

    public Corredor(int dorsal, Duration tiempo) {
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public int getDorsal() { return dorsal; }
    public Duration getTiempo() { return tiempo; }

    @Override
    public String toString() {
        return String.format("Dorsal %d - %02d:%02d:%02d",
            dorsal,
            tiempo.toHoursPart(),
            tiempo.toMinutesPart(),
            tiempo.toSecondsPart());
    }
}
