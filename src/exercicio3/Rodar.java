package exercicio3;

import java.util.Scanner;

public class Rodar {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra para inverter: ");
        String entrada = scanner.next();
        String resultado = Inverter.invertida(entrada);

        System.out.println("String original: \"" + entrada + "\"");
        System.out.println("Resultado: \"" + resultado + "\"");

        scanner.close();
    }
}
