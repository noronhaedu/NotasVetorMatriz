package appjava4;

import java.util.Scanner;

/**
 * Criar algoritmo para receber as notas de 5 alunos de 4 bimestres, a
 * frequência do aluno e apresentar o resultado final considerando média maior
 * ou igual a 7 e frequência maior ou igual a 75% para aprovação.
 */
public class NotasVetorMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String aluno[][] = new String[5][2];
        float notas[][] = new float[5][6];

        System.out.println("Notas Escolares");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            aluno[i][0] = entrada.next();

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                notas[i][j] = entrada.nextFloat();
                notas[i][5] += notas[i][j];
            }
            notas[i][5] = notas[i][5] / 4;

            System.out.print("Agora digite a frequência do " + aluno[i][0] + ": ");
            notas[i][4] = entrada.nextFloat();

            if (notas[i][4] < 75) {
                aluno[i][1] = "REPROVADO(A) POR FALTA.";
            } else if (notas[i][5] < 7) {
                aluno[i][1] = "REPROVADO(A) POR NOTA.";
            } else {
                aluno[i][1] = "APROVADO(A).";
            }

            System.out.println("---------------------------------");
        }

        System.out.println("Resultado");

        for (int i = 0; i < 5; i++) {
            System.out.println("O(a) aluno(a) " + aluno[i][0]
                    + ":\nMédia: " + notas[i][5]
                    + "\nFrequência: " + notas[i][4]
                    + "\nResultado final: " + aluno[i][1]);
        }

        entrada.close();
    }
}