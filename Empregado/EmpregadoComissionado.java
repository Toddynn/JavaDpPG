public class EmpregadoComissionado extends Empregado {
    private double vendasBrutas;
    private double taxaComissao;

    public EmpregadoComissionado(String nome, int numeroSeguro, double vendasBrutas, double taxaComissao) {
        super(nome, numeroSeguro);
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    public double ganhos() {
        return vendasBrutas * taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    @Override
    public String toString() {
        return String.format("nome = %s Seguro = %d \nVendas brutas = %.2f \nTaxa = %.2f \nGanhos = %.2f\n",getNome(), getNumeroSeguro(),  getVendasBrutas(), getTaxaComissao(), ganhos());
    }

        
}