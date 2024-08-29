package Exercícios;

import java.util.Scanner;

public class ExercicioAnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano: ");
        ano = entrada.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 == 0) {
                System.out.println(ano+" é um ano bissexto.");
            } else if (ano % 100 == 0 && ano % 400 != 0) {
                System.out.println(ano+" não é um ano bissexto.");
            } else {
                System.out.println(ano+" é um ano bissexto.");
            }
        } else {
            System.out.println(ano+" não é um ano bissexto.");
        }

        entrada.close();
    }
}