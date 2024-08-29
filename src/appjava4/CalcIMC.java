package appjava4;

import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado;
        float peso, altura, imc;

        System.out.println("CALCULADORA DE IMC");
        System.out.print("Digite o seu peso para calcular o seu IMC: ");
        peso = entrada.nextFloat();

        System.out.print("Agora digite a sua altura: ");
        altura = entrada.nextFloat();

        imc = calcIMC(altura, peso);


        if (imc < 16) {
            resultado = "Magreza grave.";
        } else if (imc < 16.9) {
            resultado = "Magreza moderada.";
        } else if (imc < 18.5) {
            resultado = "Magreza leve.";
        } else if (imc < 24.9) {
            resultado = "Peso ideal.";
        } else if (imc < 29.9) {
            resultado = "Sobrepeso.";
        } else if (imc < 34.9) {
            resultado = "Obesidade grau I.";
        } else if (imc < 39.9) {
            resultado = "Obesidade grau II.";
        } else {
            resultado = "Obesidade mórbida.";
        }

        System.out.println("O seu IMC é " + imc + ". E o resultado é: " + resultado);

        entrada.close();
    }
    /**
     * Função calcIMC calcula o IMC de um indivíduo.
     * Recebe os seguintes parâmetros: altura e peso.
     * @param altura
     * @param peso
     * @return
     */
    public static float calcIMC(float altura, float peso) {

        return (float) (peso / Math.pow(altura, 2));
    }
}
