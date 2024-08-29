package Exercícios;

import java.util.Scanner;

public class ExercicioNumeroPrimo {
    public static void main(String[] args) {
        int Primo = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                Primo++;
            }
        }

        /*
         * if (numero < 100) {
         * if (Primo > 0) {
         * System.out.println(numero + " é um número primo");
         * } else {
         * System.out.println(numero + " não é um número primo");
         * }
         * } else {
         * System.out.println("Números maiores que 100 não são primos");
         * }
         */

        switch (Primo) {
            case 1:
                System.out.println(numero + " é um número especial");
                break;

            case 2:
            System.out.println(numero + " é um número primo");
                break;

            default:
                System.out.println(numero + " não é um número primo");
                break;
        }

        entrada.close();
    }
}
