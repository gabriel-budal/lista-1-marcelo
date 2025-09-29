package Exercicios;

import java.util.Scanner; 

public class Treze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Taxa de consumo (kW): ");
        double taxaConsumo = input.nextDouble();

        System.out.print("Tempo ligado (horas): ");
        double tempoLigado = input.nextDouble();

        System.out.print("Valor do quilowatt-hora (R$): ");
        double valorKWh = input.nextDouble();

        
        double energiaGasta = taxaConsumo * tempoLigado;
        double valorPago = energiaGasta * valorKWh;

        
        System.out.println("\n--- CONSUMO DE ENERGIA ---");
        System.out.printf("Energia total gasta: %.2f kWh\n", energiaGasta);
        System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);
    }
}

