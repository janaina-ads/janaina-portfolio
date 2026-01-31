/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividae1uc6;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Atividae1Uc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Cadastro de Pacote de Viagem ===");
        System.out.print("Tipo de transporte (aéreo, rodoviário...): ");
        String tipoTransporte = scanner.nextLine();
        System.out.print("Valor do transporte (em dólar): ");
        double valorTransporte = scanner.nextDouble();
        scanner.nextLine();
        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        System.out.print("Descrição da hospedagem: ");
        String descricaoHosp = scanner.nextLine();
        System.out.print("Valor da diária (em dólar): ");
        double diaria = scanner.nextDouble();

        System.out.print("Quantidade de dias: ");
        int dias = scanner.nextInt();
        scanner.nextLine();

        Hospedagem hospedagem = new Hospedagem(descricaoHosp, diaria);
        System.out.print("Destino da viagem: ");
        String destino = scanner.nextLine();

        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, dias);

        System.out.print("Margem de lucro (%): ");
        double margem = scanner.nextDouble();

        System.out.print("Taxas adicionais (em dólar): ");
        double taxas = scanner.nextDouble();

        double totalPacote = pacote.calcularTotalPacote(margem, taxas);

        System.out.println("\n=== PACOTE CADASTRADO ===");
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Dias: " + pacote.getDias());
        System.out.println("Hospedagem total: $" + pacote.calcularTotalHospedagem());
        System.out.println("Total do pacote (em dólar): $" + totalPacote);
        scanner.nextLine();
        System.out.print("\nNome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Forma de pagamento: ");
        String formaPg = scanner.nextLine();

        Vendas venda = new Vendas(cliente, formaPg, pacote);

        System.out.print("Cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        venda.mostrarValores(totalPacote, cotacao);

        scanner.close();
    }
}
