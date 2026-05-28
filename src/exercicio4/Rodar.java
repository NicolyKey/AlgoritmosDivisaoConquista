package exercicio4;

public class Rodar {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 1, 1, 3};

        Integer resultado = Maioria.encontrar(vetor, 0, vetor.length - 1);

        if (resultado != null) {
            System.out.println("Elemento majoritário: " + resultado);
        } else {
            System.out.println("Nenhum elemento majoritário encontrado.");
        }
    }
}
