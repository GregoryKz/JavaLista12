package dev_klaus.lista12;

public class Exercicio120_MaiorEMenorValor {
    public static void main(String[] args) {
        int[] vetor = {9, 2, 15, 3, 7};
        int maior = vetor[0], menor = vetor[0];
        for (int valor : vetor) {
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }
        System.out.println("Maior: " + maior + ", Menor: " + menor);
    }
}
