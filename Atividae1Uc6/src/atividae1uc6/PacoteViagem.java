/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividae1uc6;

/**
 *
 * @author Gabriel
 */
public class PacoteViagem {

    Transporte transporte;
    Hospedagem hospedagem;
    String destino;
    int dias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }

   
    public double calcularTotalHospedagem() {
        return hospedagem.getValorDiaria() * dias;
    }

       public double aplicarMargem(double valor, double margemPercentual) {
        return valor + (valor * (margemPercentual / 100));
    }

    public double calcularTotalPacote(double margemLucro, double taxasAdicionais) {
        double valorBase = transporte.getValor() + calcularTotalHospedagem();
        double valorComMargem = aplicarMargem(valorBase, margemLucro);
        return valorComMargem + taxasAdicionais;
    }

    public String getDestino() {
        return destino;
    }

    public int getDias() {
        return dias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }
}
