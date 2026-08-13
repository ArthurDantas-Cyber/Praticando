package Classes.exc01;

public class Estudantes {
    String nome;
    String matricula;
    double n1;
    double n2;
    double t;

    public Estudantes() {
    }

    public double calculaMedia() {
        double var1 = (this.n1 * (double)2.5F + this.n2 * (double)2.5F + this.t * (double)2.0F) / (double)7.0F;
        return var1;
    }

    public double pontosNecessariosFinal() {
        double var1 = this.calculaMedia();
        return var1 >= (double)7.0F ? (double)0.0F : (double)10.0F - var1;
    }
}
