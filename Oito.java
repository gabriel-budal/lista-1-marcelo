package Exercicios;

import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        final double mm_polegada = 25.4;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit:   ");
        double F = input.nextDouble();
        double C = (5 * F - 160) / 9;
        System.out.print("A temperatura em Celcius é de:    " + C);
        
        System.out.print("Digite a quantidade de chuva em polegadas:   ");
        double polegadas = input.nextDouble();
        double mm = polegadas * mm_polegada;
        System.out.print("Digite a quantidade de chuva em mm é de:   " + mm);
        
        input.close();
    }
}
        