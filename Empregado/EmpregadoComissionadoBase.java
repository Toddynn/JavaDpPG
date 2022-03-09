import java.text.Format;

public class EmpregadoComissionadoBase extends EmpregadoComissionado {
    private double salarioBase;

    public EmpregadoComissionadoBase(String nome, int numeroSeguro, double vendasBrutas, double taxaComissao, double salarioBase) {
        super(nome, numeroSeguro, vendasBrutas, taxaComissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ganhos() {
        return salarioBase + super.ganhos();
    }

    @Override
    public String toString() {
        return String.format("nome = %s Seguro = %d \nVendas brutas = %.2f \nTaxa = %.2f \nGanhos = %.2f \nSalarioBase = %.2f", getNome(), getNumeroSeguro(), getVendasBrutas(), getTaxaComissao(), ganhos(), getSalarioBase());
    }
    

}