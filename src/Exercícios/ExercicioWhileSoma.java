package Exercícios;

import java.util.Scanner;

public class ExercicioWhileSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo: ");
            num = entrada.nextInt();

            if (num >= 0) {
                soma += num;
            }
        } while (num >= 0);

        System.out.println(soma);

        entrada.close();
    }
}
