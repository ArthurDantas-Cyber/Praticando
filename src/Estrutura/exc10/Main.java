package Estrutura.exc10;
import java.util.Scanner;

public class Main {
    static String sem (int num){
        String saida = "";
        switch (num){
            case 1:
                saida = "Janeiro";
                break;
            case 2:
                saida = "Fevereiro";
                break;
            case 3:
                saida = "Março";
                break;
            case 4:
                saida = "Abril";
                break;
            case 5:
                saida = "Maio";
                break;
            case 6:
                saida = "Junho";
                break;
            case 7:
                saida = "Julho";
                break;
            case 8:
                saida = "Agosto";
                break;
            case 9:
                saida = "Setembro";
                break;
            case 10:
                saida = "Outubro";
                break;
            case 11:
                saida = "Novembro";
                break;
            case 12:
                saida = "Dezembro";
                break;
        }
        return saida;
    }

    static String com (int num){
        String[] vetor = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return vetor[num - 1];
    }

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = 13;

        while (n < 0 || n > 12){
            System.out.print("Digite um numero (entre 1 e 12) para saber seu mês correspondente: ");
            n = s.nextInt();
        }

        System.out.println(com(n));
        System.out.println(sem(n));


    }
}