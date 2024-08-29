package Exercícios;

import java.util.Scanner;

public class ExercicioMaiorNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            num = entrada.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é " + maior);

        entrada.close();
    }
}
