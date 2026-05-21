package exercicio2;

public class Buscar {
    public static int buscar(int[] posicao, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = inicio + (fim - inicio) / 2;

        if (posicao[meio] == meio) {
            return meio;
        }

        if (posicao[meio] < meio) {
            return buscar(posicao, meio + 1, fim);
        }
        
        else {
            return buscar(posicao, inicio, meio - 1);
        }
    }
}