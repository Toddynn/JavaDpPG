import java.text.Format;

public class Novo extends Imovel{
    private double adicional;

    public Novo(String rua, int numero, String bairro, int cep, String endereco, double preco, double adicional) {
        super(rua, numero, bairro, cep, endereco, preco);
        setAdicional(adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        adicional = 1.5;
        this.adicional = preco * adicional;
    }

    public double total(double total){
        return preco + adicional;
    }

    @Override
    public String toString() {
        return String.format("%s Adicional: %.2f\n Preco final: %.2f\n", super.toString(), getAdicional(), total());
    }
}

