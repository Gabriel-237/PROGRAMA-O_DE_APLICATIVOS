class atividade3 {
 import java.util.Scanner;

import java.util.InputMismatchException;

public class SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int somaPares = 0;

        for (int i = 0; i < 4; i++) {
            while (true) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                    numeros[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: digite um número inteiro válido.");
                    sc.next(); // limpa a entrada inválida
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("Vetor informado:");
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nSoma dos números pares: " + somaPares);

        sc.close();
    }
}

}
