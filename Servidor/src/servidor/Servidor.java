/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author caios
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int porta = 1234;

        try(ServerSocket server = new ServerSocket(porta)){
            System.out.println("[SERVIDOR] Relogio online na porta : " + porta);

            while(true){
                try (Socket cliente = server.accept();
                    PrintWriter out = new PrintWriter(cliente.getOutputStream(), true)){
                        System.out.println("[CONEXÃO] Cliente " + cliente.getInetAddress() + " conectado");

                        LocalDateTime now = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                        String formattedDateTime = now.format(formatter);
                        System.out.println(formattedDateTime);
                        out.println("Hora atual do servidor: " + formattedDateTime);
                }catch(IOException ioe){
                    System.out.println("Error no cliente: " + ioe.getMessage());
                }
            }
        }catch(IOException ioe){
            System.out.println("Error no servidor: " + ioe.getMessage());
        }
    }
}
