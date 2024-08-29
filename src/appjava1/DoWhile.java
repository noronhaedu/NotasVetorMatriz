package appjava1;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor;

        do {
            System.out.println("Você quer sair?");
            System.out.print("Diga as palavras mágicas: ");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigdo!");

        entrada.close();
    }
}
