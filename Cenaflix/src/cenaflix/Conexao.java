/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaflix;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Janaina
 */
/**
 * Classe responsável por realizar a conexão com o banco de dados MySQL.
 */
public class Conexao {
  public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/CENAFLIX",
                "teste",
                "1234"
            );
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return null;
        }
    }
  
}
