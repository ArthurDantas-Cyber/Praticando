package Estruturas.exc02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        float salAtual;
        float somaA = 0f, somaN = 0f, dif = 0f;

        while(true){
            System.out.print("Informe o nome: ");
            nome = sc.nextLine();
            if (nome.equals("FIM")){
                break;
            }
            System.out.print("Informe o salário: R$");
            salAtual = sc.nextFloat();
            sc.nextLine();
            somaA += salAtual;

            float salNovo = salAtual;
            if (salAtual<= 150){
                salNovo *= 1.25f;
            }
            else if (salAtual <= 300){
                salNovo *= 1.2f;
            }
            else if (salAtual <= 600){
                salNovo *= 1.15f;
            }
            else{
                salNovo *= 1.1f;
            }
            somaN += salNovo;

            System.out.printf("Nome: %s\nSalário Atual: R$%.2f\nSalário Reajustado: R$%.2f\n", nome, salAtual, salNovo);
        }

        dif = somaN - somaA;

        System.out.println("Somatório de salários antigos: R$" + somaA);
        System.out.println("Somatório de salários reajustados: R$" + somaN);
        System.out.println("Diferença entre salários reajustados e antigos: R$" + dif);
    }
}
