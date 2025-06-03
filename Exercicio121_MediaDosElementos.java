package dev_klaus.lista12;

public class Exercicio121_MediaDosElementos {
    public static void main(String[] args) {
        double[] vetor = {5.5, 7.2, 8.1, 6.3};
        double soma = 0;
        for (double v : vetor) soma += v;
        double media = soma / vetor.length;
        System.out.println("Média: " + media);
    }
}
