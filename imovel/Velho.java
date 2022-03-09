//VINÍCIUS GABRIEL TODIS E EMILLY RODRIGUES;

public class Velho extends Imovel{
    private double desconto;

    public Velho(String rua, int numero, String bairro, int cep, double preco, double desconto) {
        super(rua, numero, bairro, cep, preco);
        setDesconto(desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        desconto = 2.5;
        this.desconto = getPreco() / desconto;
    }

    @Override
    public String toString() {
        return String.format("%s Desconto: %.2f\n Preco final: %.2f\n", super.toString(), getDesconto());
    }
}
