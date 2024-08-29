package appjava2;

import java.util.Scanner;

public class SwitchNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        String conceito = "";

        System.out.print("Digite a nota do aluno: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                System.out.println(nota + "não é uma nota válida.");
                break;
        }

        System.out.println(conceito);

        entrada.close();
    }
}
