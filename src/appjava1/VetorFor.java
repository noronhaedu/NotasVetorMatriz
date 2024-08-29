package appjava1;

public class VetorFor {
    public static void main(String[] args) {
        int [] vetor = {2,3,5,9,11};

        for (int i = 0; i < vetor.length; i++) {
            //System.out.printf("Valor da posição %d: %d", i, vetor[i]);
            System.out.println("Valor da posição "+i+": "+vetor[i]+"\n");
        }
    }
}
