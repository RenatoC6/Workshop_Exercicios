package Logica_programacao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("O número " + num + " é PAR.");
        } else {
            System.out.println("O número " + num + " é ÍMPAR.");
        }

    }
}
