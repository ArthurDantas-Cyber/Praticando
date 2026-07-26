package Estrutura.exc06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        String palavraInversa ="";
        int j; //controla o indice da palavraInversa

        System.out.print("Informe uma palavra para verificar se a mesma é um palíndromo: ");
        palavra = sc.next();

        for (int i = palavra.length() - 1; i >= 0 ; i--) {
            palavraInversa += palavra.charAt(i);
        }

        if(palavra.equals(palavraInversa)){
            System.out.println(palavra + " é um palíndromo.");
        }
        else {
            System.out.println(palavra + " Não é um palíndromo.");
        }
    }
}
