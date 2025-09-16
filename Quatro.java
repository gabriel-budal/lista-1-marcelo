package Exercicios;

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
double horasTrabalhadas, valorHora, salarioBruto, salarioLiquido, desconto;

System.out.print("Digite o total de horas trabalhadas no mes  ");
horasTrabalhadas = input.nextDouble();

System.out.print("Digite valor da hora de trabalho  ");
valorHora = input.nextDouble();

salarioBruto = horasTrabalhadas * valorHora;
desconto = salarioBruto * 0.06;
salarioLiquido = salarioBruto - desconto;

System.out.print("Salario bruto e de: R$  " + salarioBruto);
System.out.print("Desconto do vale transporte e de:  " + desconto);
System.out.print("Salario liquido e de: R$  " + salarioLiquido);

        input.close();
    }
}