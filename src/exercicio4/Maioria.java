package exercicio4;

public class Maioria {

    public static Integer encontrar(int[] vetor, int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        }

        int meio = inicio + (fim - inicio) / 2;

        Integer maioriasEsquerda = encontrar(vetor, inicio, meio);
        Integer maioriaDireita = encontrar(vetor, meio + 1, fim);

        if (maioriasEsquerda != null && maioriasEsquerda.equals(maioriaDireita)) {
            return maioriasEsquerda;
        }

        int contEsquerda = maioriasEsquerda != null ? contar(vetor, inicio, fim, maioriasEsquerda) : 0;
        int contDireita = maioriaDireita != null ? contar(vetor, inicio, fim, maioriaDireita) : 0;

        int tamanho = fim - inicio + 1;

        if (contEsquerda > tamanho / 2) return maioriasEsquerda;
        if (contDireita > tamanho / 2) return maioriaDireita;

        return null;
    }

    private static int contar(int[] vetor, int inicio, int fim, int valor) {
        int count = 0;
        for (int i = inicio; i <= fim; i++) {
            if (vetor[i] == valor) count++;
        }
        return count;
    }
}
