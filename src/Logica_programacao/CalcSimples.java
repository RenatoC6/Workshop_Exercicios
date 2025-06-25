package Logica_programacao;

import java.util.Scanner;

public class CalcSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros e um operacao para calculo simples: ");

        System.out.print("primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado;
        boolean operacaoInvalida = true;

        switch(operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoInvalida = false;
                resultado = 0;
                break;
        }

        if(operacaoInvalida) {
            System.out.println("Resultado: " + resultado);
        }


    }
}
