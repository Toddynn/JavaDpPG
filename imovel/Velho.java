import java.text.Format;

public class Velho extends Imovel{
    private double desconto;

    public Velho(String rua, int numero, String bairro, int cep, String endereco, double preco, double desconto) {
        super(rua, numero, bairro, cep, endereco, preco);
        setDesconto(desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        desconto = 2.5;
        this.desconto = preco / desconto;
    }

    public double desc(double desc){
        return preco - adicional;
    }

    @Override
    public String toString() {
        return String.format("%s Desconto: %.2f\n Preco final: %.2f\n", super.toString(), getDesconto(), desc());
    }
}
