package Exercicios;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
double salario, percentual, novoSalario;
        
System.out.print("Digite o salario atual:  ");
salario = input.nextDouble();

System.out.print("Digite o percentual de reajuste:  ");
percentual = input.nextDouble();

novoSalario = salario + (salario * percentual / 100);

System.out.print("O novo salario e de R$:   " + novoSalario);
        
        input.close();
    }
}