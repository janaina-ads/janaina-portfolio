/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Gabriel
 */
public class GastoCalorico {
    
  public static double basalHomem(double peso, double altura, int idade) {
        return 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
    }

    public static double basalMulher(double peso, double altura, int idade) {
        return 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
    }

    public static double total(double basal, int nivel) {
        switch (nivel) {
            case 0: return basal * 1.2;
            case 1: return basal * 1.375;
            case 2: return basal * 1.55;
            case 3: return basal * 1.725;
            case 4: return basal * 1.9;
            default: return basal;
        }
    }
}
