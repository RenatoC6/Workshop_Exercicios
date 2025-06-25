package Logica_programacao;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

            long fat= 1;
            for (int i = 2; i <= num; i++) {
                fat *= i;
            }
            System.out.println("O fatorial de " + num + " é: " + fat);
        }
}
