/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1uc9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class Atividade1Uc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame tela = new JFrame("MVP - Venda");
        tela.setSize(300, 130);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JLabel lblValor = new JLabel("Valor da venda:");
        JTextField txtValor = new JTextField();
        JButton btnCalcular = new JButton("Calcular");

        tela.setLayout(new GridLayout(2, 2));
        tela.add(lblValor);
        tela.add(txtValor);
        tela.add(new JLabel());
        tela.add(btnCalcular);

        btnCalcular.addActionListener(e -> {

            try {
                double valor = Double.parseDouble(txtValor.getText());
                double total = valor;

                if (valor > 500) {
                    String desconto = JOptionPane.showInputDialog(
                            "Desconto (%):");

                    if (desconto != null && !desconto.isEmpty()) {
                        total = valor - (valor * Double.parseDouble(desconto) / 100);
                    }
                }

                JOptionPane.showMessageDialog(null,
                        "Valor final: R$ " + String.format("%.2f", total));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        "Digite apenas números.");
            }
        });

        tela.setVisible(true);
    }
}
