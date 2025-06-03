package dev_klaus.lista12;

public class Exercicio119_SomaDosElementos {
    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10};
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        System.out.println("Soma dos elementos: " + soma);
    }
}
