/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author anibal
 */
public class Bicycle extends Transport {

    private int gearCount;

    public Bicycle(String code, String type, int gearCount) {
        super(code, type, 3000);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
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

    @Override
    public String toString() {
        return "Código: " + getCode() + ", Tipo: " + getType() + ", Tarifa Base: " + getBaseRate() + " gearCount: " + getGearCount();
    }


}
