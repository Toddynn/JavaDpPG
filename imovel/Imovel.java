//VINICIUS GABRIEL TODIS E EMILLY RODRIGUES;

public class Imovel {
    private String rua;
    private int numero;
    private String bairro;
    private int cep;
    private double preco;
    
    public Imovel(String rua, int numero, String bairro, int cep, double preco) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.preco = preco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Rua: %s\n Numero: %d\n Bairro: %s\n CEP: %d\n Preco: %.2f\n", getRua(), getNumero(), getBairro(), getCep(), getPreco());
    }

    
}
