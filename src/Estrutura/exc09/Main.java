package Estrutura.exc09;
import java.util.Scanner;

public class Main {
    public static long fatorial (int num){
        long resultado = 1;

        for (int i = num; i > 0; i--) {
            resultado *= i;
        }
        
        return resultado;
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        double d, a;

        System.out.print("Qual sua distância do topo da montanha (em metros): ");
        d = s.nextDouble();
        System.out.print("Qual o ângulo da sua distância em relação a montanha: ");
        a = s.nextDouble();

        double cos = 1;
        int sinal = -1;
        for (int i = 2; i <= 18; i+=2) {
            cos += sinal * Math.pow(a, i) / fatorial(i);
            sinal *= -1;
        }

        double dhor = d*cos;
        double altura = Math.sqrt(Math.pow(d, 2) - Math.pow(dhor, 2));

        System.out.printf("altura da montanha: %.2f", altura);
    }
}