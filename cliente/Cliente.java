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
 * @author caios
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ip = "localhost";
        int porta = 1234;

        try (Socket cliente = new Socket(ip, porta);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()))){
                String resposta = in.readLine();
                System.out.println(resposta);
            } catch(IOException ioe){
                System.out.println("Não foi possivel acessar o servidor: " + ioe.getMessage());
            }
    }
    
}
