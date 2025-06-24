package Exercicios_conceitos_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaStream {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        List<Integer> lista2 = lista.stream()
                .filter(num -> num % 2 == 1) // filtra impares
                .map(num -> num * 2) // dobra o valor
                .sorted() // classifica crescente
                .collect(Collectors.toList());

        System.out.println("Resultado final da lista: " + lista2);




    }
}
