/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividae1uc6;

/**
 *
 * @author Gabriel
 */
public class Vendas {
    
String nomeCliente;
  String formaPagamento;
 PacoteViagem pacote;

    public Vendas(String nomeCliente, String formaPagamento, PacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    // conversão de dólar para real
    public double converterParaReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    public void mostrarValores(double totalDolar, double cotacao) {
        double totalReais = converterParaReais(totalDolar, cotacao);

        System.out.println("\n=== VALORES DA VENDA ===");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Total em dólar: $" + totalDolar);
        System.out.println("Cotação do dólar: " + cotacao);
        System.out.println("Total em reais: R$" + totalReais);
    }
}
