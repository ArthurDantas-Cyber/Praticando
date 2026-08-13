package Classes.exc02;

public class Data {
    private int dia, mes, ano;

    public Data (int dia, int mes, int ano){
        //construtor
        if(validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    private boolean validaData (int d, int m, int a){
        boolean flag = false, vd = false, vm = false, va = false;
        if (a > 1 && a < 9999){
            va = true;
        }
        if (m >= 1 && m <= 12){
            vm = true;
        }
        if (d >=1 && d <= 31){
            vd = true;
        }

        if(va && vm & vd){
            flag = true;
        }

        return flag;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
