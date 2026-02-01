/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Gabriel
 */
public class IMC {
      public static double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String interpretar(double imc) {
        if (imc < 18.5) return "Magreza";
        if (imc < 25) return "Normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 40) return "Obesidade";
        return "Obesidade grave";
    }

}
