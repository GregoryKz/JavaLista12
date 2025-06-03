package dev_klaus.lista12;

import java.util.*;

public class Exercicio124_FrequenciaElementos {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 2, 3, 1, 4, 2};
        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int v : vetor) {
            frequencia.put(v, frequencia.getOrDefault(v, 0) + 1);
        }
        System.out.println("Frequência dos elementos: " + frequencia);
    }
}
