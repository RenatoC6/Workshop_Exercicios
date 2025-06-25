package Conceitos_java;

public class Matrizes {

    public static void main(String[] args) {

        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        int soma =0;

        for(int linha = 0; linha < matriz.length; linha++){
            int somaLinha = 0;
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print( matriz[linha][coluna] + " ");
                somaLinha += matriz[linha][coluna];
                soma += matriz[linha][coluna];
            }
            System.out.println("= soma da linha: " + somaLinha);
        }
        System.out.println("soma total da matriz: " + soma);
    }
}
