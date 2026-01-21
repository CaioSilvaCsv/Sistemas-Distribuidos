
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Caio da silva, Carlos Henrique, Luiz Felipe, Rithiellen Máxima;
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
                // aguarda conexão
                try (Socket cliente = server.accept();
                    PrintWriter out = new PrintWriter(cliente.getOutputStream(), true)){
                        System.out.println("[CONEXÃO] Cliente " + cliente.getInetAddress() + " conectado");
                        
                        // Busca a hora atual do servidor
                        LocalDateTime now = LocalDateTime.now();
                        // Formata a hora
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                        // Imprime a hora no console
                        String formattedDateTime = now.format(formatter);
                        // Imprime a hora no cliente
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
