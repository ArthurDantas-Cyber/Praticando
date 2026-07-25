package Estrutura.exc03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i = 0;
        int[] vetor = new int[8];


        System.out.print("Informe um número entre 0 e 128 para saber seu equivalente em binário: ");
        num = s.nextInt();

        do {
            vetor[i] = num % 2;
            i++;
            num /= 2;
        } while (num != 0);

        for (int j = i - 1; j >= 0 ; j--) {
            System.out.printf("%d ",vetor[j]);
        }

    }
}
