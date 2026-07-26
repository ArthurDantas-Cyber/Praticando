package Estrutura.exc05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double p, a, i;
        System.out.print("Informe o valor do empréstimo: R$ ");
        p = s.nextDouble();
        System.out.print("Informe o valor da prestação: R$ ");
        a = s.nextDouble();
        System.out.print("Informe o valor da taxa de juros, em porcentagem: ");
        i = s.nextDouble();

        double saldoDevedor = p, juros, amortizado, somaJuros = 0, ultimaParc = 0;
        int cont = 0;

        while (saldoDevedor > 0){
            cont++;
            if (saldoDevedor < a){
                ultimaParc = saldoDevedor;
                juros = saldoDevedor * i/100;
                somaJuros += juros;
                amortizado = saldoDevedor - juros;
                saldoDevedor = 0;
            }
            else {
                juros = saldoDevedor * i/100;
                somaJuros += juros;
                amortizado = a - juros;
                saldoDevedor -= amortizado;
            }

            System.out.println("Mês "+cont+":");
            System.out.printf("Juros pago no mês: R$%.2f\n", juros);
            System.out.printf("Valor amortizado: R$%.2f\n", amortizado);
            System.out.printf("Juros acumulados: R$%.2f\n", somaJuros);
            System.out.printf("Saldo devedor: R$%.2f\n\n", saldoDevedor);
        }

        System.out.println("Meses necessários para pagamento da dívida: "+cont);
        System.out.println("Quantidade da última prestação: R$"+ultimaParc);

    }
}
