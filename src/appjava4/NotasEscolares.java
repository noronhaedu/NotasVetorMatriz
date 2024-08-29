package appjava4;

import java.util.Scanner;

public class NotasEscolares {
    /**
     * Receber 4 notas de 0 a 10 e fazer a média dos 4 bimestres.
     * Considerando média maior ou igual a 7 para aprovação.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float notas[] = new float[5];
        String aluno, resultado;

        System.out.println("Notas Escolares");

        System.out.print("Informe o nome do aluno: ");
        aluno = entrada.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = entrada.nextFloat();

            notas[4] += notas[i];
        }

        notas[4] = notas[4] / 4;

        if (notas[4] >= 7) {
            resultado = "APROVADO.";
        } else {
            resultado = "REPROVADO.";
        }

        System.out.println("O(A) aluno(a) " + aluno + " teve a média " + notas[4] + " e está " + resultado);

        entrada.close();
    }
}
