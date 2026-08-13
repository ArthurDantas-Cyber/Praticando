package Estruturas.exc08;
import java.util.Scanner;

public class Main {
    static boolean ehPrimo (int num){
        boolean primo = true;
        if (num <= 1){
            primo = false;
        } else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, cont = 0;

        System.out.print("Descubra os N primeiros números primos. Digite um valor para N: ");
        num = s.nextInt();

        int i = 0;
        while (cont < 20){
            if (ehPrimo(i)){
                System.out.printf("%d ",i);
                cont++;
            }
            i++;
        }

    }
}
