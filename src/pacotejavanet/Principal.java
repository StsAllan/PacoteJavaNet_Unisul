package pacotejavanet;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;


public class Principal {
public static void main(String[] args) {
    
    String endereço;
    int porta;
    
    endereço = JOptionPane.showInputDialog("Escreva o endereço a ser pesquisado");
    porta = Integer.parseInt(JOptionPane.showInputDialog("Digite a porta do endereço pesquisado"));
    
try {
Socket sock = new Socket(endereço, porta);
PrintWriter out = new
PrintWriter(sock.getOutputStream(),true);
BufferedReader in = new BufferedReader(new
InputStreamReader(sock.getInputStream()));
String linha="";
out.println("GET / HTTP/1.0\n");
while ((linha = in.readLine()) != null) {
System.out.println("echo: " + linha);
}
}catch ( IOException e ) {
System.err.println( "Problemas de IO" );
}
}
}
