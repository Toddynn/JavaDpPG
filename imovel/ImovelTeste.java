import java.util.Scanner;

public class ImovelTeste {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String rua;
        String bairro;
        int numero;
        int cep;
        double preço;

        System.println("Informe a rua do imovel novo: ");
        rua = entrada.next();
        System.println("Informe o numero do imovel novo: ");
        numero = entrada.nextInt();
        System.println("Informe o bairro do imovel novo: ");
        bairro = entrada.next();
        System.println("Informe o CEP do imovel novo: ");
        cep = entrada.nextInt();
        System.println("Informe o preco do imovel novo: ");
        preco = entrada.nextDouble();

        System.println("Informe a rua do imovel velho: ");
        rua = entrada.next();
        System.println("Informe o numero do imovel velho: ");
        numero = entrada.nextInt();
        System.println("Informe o bairro do imovel velho: ");
        bairro = entrada.next();
        System.println("Informe o CEP do imovel velho: ");
        cep = entrada.nextInt();
        System.println("Informe o preco do imovel velho: ");
        preco = entrada.nextDouble();

        Novo imovel1 = null;
        Velho imovel2 = null;

        try {
            imovel1 = new Novo(" " + rua, " " + numero," " + bairro," " + cep," " + preco);
            imovel2 = new Velho(" " + rua, " " + numero," " + bairro," " + cep," " + preco);
        } catch (Exception err) {
            System.err.println("Erro" + err);
        }
        
        if(Novo != null){
            System.out.println(imovel1);
        }
        if(Velho != null){
            System.out.prinln(imovel2);
        }
    }
}
