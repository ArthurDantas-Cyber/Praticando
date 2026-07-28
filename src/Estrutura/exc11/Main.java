package Estrutura.exc11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        double somatorio = 0;
        int maisQMedia = 0;
        double media;

        System.out.print("Quantidade de funcionarios: ");
        qtd = sc.nextInt();
        double[] salarios = new double[qtd];

        System.out.printf("Digite a seguir os %d salarios: \n", qtd);
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%do Salario: R$", i+1);
            salarios[i] = sc.nextDouble();
            somatorio+=salarios[i];
        }

        if(qtd == 0){
            media = 0;
        }
        else {
            media = somatorio/qtd;
        }

        for (int i = 0; i < qtd; i++) {
            if (salarios[i] > media){
                maisQMedia++;
            }
        }

        System.out.println("Quantidade de funcionário que recebem acima da média: "+ maisQMedia);

    }
}
