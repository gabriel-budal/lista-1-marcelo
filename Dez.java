package Exercicios;

import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //exemplo 19 anos 6 meses e 10 dias
        System.out.print("Digite a idade:   ");
        int anos = input.nextInt();
        
        System.out.print("Digite o meses:   ");
        int meses = input.nextInt();
        
        System.out.print("Digito os dias:   ");
        int dias = input.nextInt();
        
        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.print("Idade em dias e de:   " + totalDias);

        input.close();
    }
}
        