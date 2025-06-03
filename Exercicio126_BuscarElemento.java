package dev_klaus.lista12;

public class Exercicio126_BuscarElemento {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int busca = 3;
        boolean encontrado = false;
        for (int valor : vetor) {
            if (valor == busca) {
                encontrado = true;
                break;
            }
        }
        System.out.println("Elemento " + busca + (encontrado ? " encontrado." : " não encontrado."));
    }
}
