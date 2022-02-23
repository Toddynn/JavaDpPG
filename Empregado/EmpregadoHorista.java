import java.text.Format;

public class EmpregadoHorista extends Empregado {
    
    private int horas;
    private double retribuicao;

    public EmpregadoHorista(String nome, int numeroSeguro, int horas, double retribuicao) {
        super(nome, numeroSeguro);
        setHoras(horas);
        setRetribuicao(retribuicao);
    }

    public int getHoras() {
            return horas;
    }

    public void setHoras(int horas) {
        if(horas >= 0 && horas <= 168){
            this.horas = horas;
        }
    }

    public double getRetribuicao() {
        return retribuicao;
    }

    public void setRetribuicao(double retribuicao) {
        if(retribuicao >= 0){
            this.retribuicao = retribuicao;
        }
    }
    
    
    public double ganhos() {
        double horasExtras = 0;
        if(horasExtras > 40){
            horasExtras = horas - 40;
        }
        return retribuicao * (horas - horasExtras) + retribuicao * horasExtras * 1.5;
    }

    @Override
    public String toString() {
        return String.format("%s Horas = %d\n Retribuicao = %.2f\nGanhos = %.2f", super.toString(), getHoras(), getRetribuicao(), ganhos());
    }

    
    
}