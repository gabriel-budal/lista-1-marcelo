package Exercicios;

import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final double custo_m2 = 100.0;
        Scanner input = new Scanner(System.in);
        
System.out.print("Digite o raio da lata:  ");
double raio = input.nextDouble();

System.out.print("Digite a altura da lata:  ");
double altura = input.nextDouble();

double area = 2 * PI * raio * (raio + altura);
double custo = area * custo_m2;

System.out.print("O custo da lata é: R$ " + custo);

        input.close();
    }
}