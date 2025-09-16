package Exercicios;

import java.util.Scanner;

public class Três {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
double cotacaoDolar, valorProdutoDolar, valorProdutoReal;

System.out.print("Digite o valor da cotacao atual do dolar (em reais)  ");
cotacaoDolar = input.nextDouble();

System.out.print("Digite o valor do produtor em dolares  ");
valorProdutoDolar = input.nextDouble();

valorProdutoReal = valorProdutoDolar * cotacaoDolar;

System.out.print("O valor do produto em reais e: R$  " + valorProdutoReal);

        input.close();
    }
}