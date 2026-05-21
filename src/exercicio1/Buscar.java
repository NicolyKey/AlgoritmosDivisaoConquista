package exercicio1;

public class Buscar {
    public static int buscar(int[] vetor, int alvo, int inicio, int fim) {
        if (inicio > fim) {
            return -1; 
        }

        int meio = inicio + (fim - inicio) / 2;
        if (vetor[meio] == alvo) {
            return meio;
        }

        if (alvo < vetor[meio]) {
            return buscar(vetor, alvo, inicio, meio - 1);
        }

        else {
            return buscar(vetor, alvo, meio + 1, fim);
        }
    }
}