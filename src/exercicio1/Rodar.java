package exercicio1;
import java.util.Scanner;

public class Rodar {
    public static void main(String[] args) {
     int[] A = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    
        System.out.print("Lista: [");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que você deseja buscar: ");
        int valorBuscado = scanner.nextInt();
        int indiceResultado = Buscar.buscar(A, valorBuscado, 0, A.length - 1);
        if (indiceResultado != -1) {
            System.out.println("O número " + valorBuscado + " foi encontrado no índice: " + indiceResultado);
        } else {
            System.out.println("O número " + valorBuscado + " não existe nesta lista.");
        }
        scanner.close();
    }
}

