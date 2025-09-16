package Exercicios;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
System.out.print("Digite a quantidade de anos:  ");
int anos = input.nextInt();

long batimentos = anos * 365 * 24 * 60 * 60;

System.out.print("O coracao bateu aproximadamente   "  + String.format("%,d", batimentos) + " vezes");

        input.close();
    }
}