/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 
 * @author Caio da silva, Carlos Henrique, Luiz Felipe, Rithielle;
 */
public class Cliente {
    public static void main(String[] args) {
        String ip = "localhost";
        int porta = 1234;

        /** 
         * Tenta se conectar ao servidor
         * 
         * @param ip
         * @param porta
        */
        try (Socket cliente = new Socket(ip, porta);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()))){
                // ler a resposta do servidor
                String resposta = in.readLine();
                // imprime a resposta no console
                System.out.println(resposta);
            } catch(IOException ioe){
                System.out.println("Não foi possivel acessar o servidor: " + ioe.getMessage());
            }
    }
    
}
