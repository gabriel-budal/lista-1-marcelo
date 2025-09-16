package Exercicios;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
int num1, num2, soma;

System.out.print("Digite o primeiro numero  ");
num1 = input.nextInt();

System.out.print("Digite o segundo numero   ");
num2 = input.nextInt();

soma = num1 + num2;
        
System.out.print("A soma dos numeros é: " + soma);

input.close();
    }
}