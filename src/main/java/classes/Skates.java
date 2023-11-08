/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author anibal
 */
public class Skates extends Transport {

    private int wheelCount;

    public Skates(String code, String type, int wheelCount) {
        super(code, type, 1500);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public double calculateAmount(int distancia) {
        double porcentaje = 0.0;

        if (distancia >= 0 && distancia <= 1000) {
            porcentaje = 0.2;
        } else if (distancia > 1000 && distancia <= 2000) {
            porcentaje = 0.15;
        } else if (distancia > 2000 && distancia <= 3000) {
            porcentaje = 0.1;
        } else {
            porcentaje = 0.05;
        }

        // Realizar el cálculo basado en la tarifa base y el porcentaje
        double monto = getBaseRate() * porcentaje;
        return monto;
    }

    @Override
    public String toString() {
        return "Código: " + getCode() + ", Tipo: " + getType() + ", Tarifa Base: " + getBaseRate() + ", cantidad de ruedas: " + getWheelCount();
    }
}
