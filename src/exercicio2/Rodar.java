package exercicio2;

public class Rodar {
public static void main(String[] args) {
        int[] A = {-1, -1, 1, 3, 8, 9};

        System.out.print("Vetor analisado: [");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); 
        int resultado = Buscar.buscar(A, 0, A.length - 1);
        if (resultado != -1) {
            System.out.println("Valor igual ao vetor encontrado: \"" + resultado + "\" (no índice " + resultado + ")");
        } else {
            System.out.println("Nenhum elemento possui o valor igual ao seu índice.");
        }
    }
}
