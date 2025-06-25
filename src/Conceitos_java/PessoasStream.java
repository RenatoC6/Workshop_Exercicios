package Conceitos_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PessoasStream {

    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Maria", 20);
        pessoas.put("Joao", 31);
        pessoas.put("Pedro", 50);
        pessoas.put("Antonio", 29);

        Set<String> maisDe30 = new HashSet<>();

        for (String nome : pessoas.keySet()) {
            int idade = pessoas.get(nome);
            if (idade > 30) {
                maisDe30.add(nome);
            }
        }

        System.out.println("Pessoas com mais de 30 anos:");
        for (String nome : maisDe30) {
            System.out.println(nome);
        }


    }

}
