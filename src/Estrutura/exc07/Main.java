package Estrutura.exc07;
import java.util.Scanner;

public class Main {

    static void delta(int a, int b, int c) {
        int resultado = (int)Math.pow(b, 2) -4 * a * c;
        int status;

        if (resultado > 0){
            status = 2;
        } else if (resultado == 0) {
            status = 1;
        }else {
            status = 0;
        }

        int r1 = (int)(-b + Math.sqrt(resultado)) / 2 * a;
        int r2 = (int)(-b - Math.sqrt(resultado)) / 2 * a;

        System.out.printf("Status (quantidade de raízes reais): %d\n", status);
        System.out.printf("Raiz 1: %d\n", r1);
        System.out.printf("Raiz 2: %d\n", r2);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;

        System.out.print("Informe o valor de A: ");
        a = s.nextInt();
        System.out.print("Informe o valor de B: ");
        b = s.nextInt();
        System.out.print("Informe o valor de C: ");
        c = s.nextInt();

        delta(a, b, c);
    }

}
