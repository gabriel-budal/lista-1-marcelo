package Exercicios;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
System.out.print("Digite o primeiro numero  ");
double num1 = input.nextDouble();
        
System.out.print("Digite o segundo numero   ");
double num2 = input.nextDouble();
        
System.out.print("Digite o terceiro numero  ");
double num3 = input.nextDouble();
        
double media = (num1 + num2 + num3) / 3;

System.out.print("A media e:  " + media);

        input.close();
    }
}