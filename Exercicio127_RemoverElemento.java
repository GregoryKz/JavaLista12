package dev_klaus.lista12;
import java.util.*;

public class Exercicio127_RemoverElemento {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 2, 4};
        int remover = 2;
        List<Integer> novo = new ArrayList<>();
        for (int v : vetor) {
            if (v != remover) novo.add(v);
        }
        System.out.println("Novo vetor: " + novo);
    }
}
