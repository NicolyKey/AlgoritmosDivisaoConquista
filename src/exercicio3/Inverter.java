package exercicio3;

public class Inverter {
 
    public static String invertida (String string){

        if (string.length() <= 1) {
            return string; 
        }

        int meio = string.length() / 2;

        String esquerda = string.substring(0, meio);
        String direita = string.substring(meio);

        String esquerdaInvertida = invertida(esquerda);
        String direitaInvertida = invertida(direita);

        return direitaInvertida + esquerdaInvertida;
    }
}

