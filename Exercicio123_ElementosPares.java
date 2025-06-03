package dev_klaus.lista12;

public class Exercicio123_ElementosPares {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};
        int pares = 0;
        for (int num : vetor) {
            if (num % 2 == 0) pares++;
        }
        System.out.println("Quantidade de pares: " + pares);
    }
}
