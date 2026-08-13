package Classes.exc01;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Estudantes var1 = new Estudantes();
        var1.nome = "Arthur";
        var1.matricula = "BSI001";
        var1.n1 = (double)6.0F;
        var1.n2 = (double)6.0F;
        var1.t = (double)6.0F;
        System.out.printf("%.2f\n", var1.calculaMedia());
        System.out.printf("%.0f", var1.pontosNecessariosFinal());
    }
}