package appjava1;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("Sair")) {
            System.out.print("Você escolheu: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}
