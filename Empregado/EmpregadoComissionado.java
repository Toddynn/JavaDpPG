public class EmpregadoComissionado {
    private String nome;
    private int numeroSeguro;
    private double vendasBrutas;
    private double taxaComissao;

    public EmpregadoComissionado(String nome, int numeroSeguro, double vendasBrutas, double taxaComissao) {
        this.nome = nome;
        this.numeroSeguro = numeroSeguro;
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    public double ganhos() {
        return vendasBrutas * taxaComissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(int numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
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
        return String.format("nome = %s Seguro = %d \nVendas brutas = %.2f \nTaxa = %.2f \nGanhos = %.2f\n", getNome(), getNumeroSeguro(), getVendasBrutas(), getTaxaComissao(), ganhos());
    }

        
}