package Estruturas.exc04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 1, c = 0, alvo, flag = 0;

        System.out.print("Forneça um número para checar se o mesmo faz parte da sequência de Fibbonaci: ");
        alvo = s.nextInt();

        while (c < alvo) {
            c = a + b;
            if (alvo == c) {
                flag = 1;
                break;
            }
            a = b;
            b = c;
        }

        if (flag == 1) {
            System.out.printf("%d faz parte da sequência de fibbonaci.", alvo);
        } else {
            System.out.printf("%d não faz parte da sequência de fibonnaci.", alvo);
        }
    }
}
