/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Calculable;

/**
 *
 * @author anibal
 */
public abstract class Transport implements Calculable {

    private String code;
    private String type;
    private int baseRate;

    public Transport(String code, String type, int baseRate) {
        this.code = code;
        this.type = type;
        this.baseRate = baseRate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
    
}
