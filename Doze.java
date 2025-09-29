package Exercicios;

import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Taxa fixa por dia (R$): ");
        double taxaFixaPorDia = input.nextDouble();

        System.out.print("Taxa por Km rodado (R$): ");
        double taxaPorKm = input.nextDouble();

        System.out.print("Número de dias: ");
        int numeroDias = input.nextInt();

        System.out.print("Quilometragem rodada (Km): ");
        double kmRodado = input.nextDouble();

        
        double desconto = taxaFixaPorDia * 0.10;
        double taxaComDesconto = taxaFixaPorDia - desconto;
        double valorTotal = (taxaComDesconto * numeroDias) + (taxaPorKm * kmRodado);

        
        System.out.println("\n--- RESUMO DO ALUGUEL ---");
        System.out.printf("Número de dias: %d\n", numeroDias);
        System.out.printf("Quilometragem rodada: %.2f Km\n", kmRodado);
        System.out.printf("Valor do desconto por dia: R$ %.2f\n", desconto);
        System.out.printf("Valor total do aluguel: R$ %.2f\n", valorTotal);
    }
}
