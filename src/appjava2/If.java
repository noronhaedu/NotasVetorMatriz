package appjava2;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        double nota = 0.0;
        double media = 7.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota: ");
        nota = entrada.nextDouble();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 9.1) {
                System.out.print("Conceito A\n");
                System.out.print("Hall da Fama!\n");
            } else if (nota >= media) {
                System.out.println("Aprovado!");
            } else if (nota >= 3.0 && nota < media) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovação");
            }
        }

        entrada.close();
    }
}
