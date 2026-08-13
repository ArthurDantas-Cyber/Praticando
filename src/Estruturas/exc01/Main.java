/*Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números ímpares entre A e B.*/


package Estruturas.exc01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.print("Informe um número: ");
        a = s.nextInt();
        System.out.print("Informe outro numero, maior que o anterior: ");
        b = s.nextInt();

        for (int i = a; i < b; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
