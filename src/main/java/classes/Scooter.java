/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author anibal
 */
public class Scooter extends Transport {

    private String color;

    public Scooter(String code, String type, String color) {
        super(code, type, 2000); // La tarifa base para scooters es 2000
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculateAmount(int distancia) {
        double porcentaje = 0.0;

        if (distancia >= 0 && distancia <= 1000) {
            porcentaje = 0.4;
        } else if (distancia > 1000 && distancia <= 2000) {
            porcentaje = 0.3;
        } else if (distancia > 2000 && distancia <= 3000) {
            porcentaje = 0.25;
        } else {
            porcentaje = 0.15;
        }

        double monto = getBaseRate() * porcentaje;
        return monto;
    }
}
