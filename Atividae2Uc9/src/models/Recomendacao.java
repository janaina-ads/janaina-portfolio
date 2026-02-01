/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Gabriel
 */
public class Recomendacao {
     public static double carbo(double calorias) {
        return calorias * 0.5 / 4;
    }

    public static double proteina(double calorias) {
        return calorias * 0.25 / 4;
    }

    public static double gordura(double calorias) {
        return calorias * 0.25 / 9;
    }
} 

