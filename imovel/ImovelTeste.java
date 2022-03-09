//VINICIUS GABRIEL TODIS E EMILLY RODRIGUES;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ImovelTeste {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String rua;
        String bairro;
        int numero;
        int cep;
        double preco;

        System.out.println("Informe a rua do imovel novo: ");
        rua = entrada.next();
        System.out.println("Informe o numero do imovel novo: ");
        numero = entrada.nextInt();
        System.out.println("Informe o bairro do imovel novo: ");
        bairro = entrada.next();
        System.out.println("Informe o CEP do imovel novo: ");
        cep = entrada.nextInt();
        System.out.println("Informe o preco do imovel novo: ");
        preco = entrada.nextDouble();
        
        Novo imovel1 = null;
        
        try {
            imovel1 = new Novo(rua, numero, bairro, cep, preco, preco);
            
        } catch (Exception err) {
            System.err.println("Erro" + err);
        }
        
        if(imovel1 != null){
            System.out.println(imovel1);
        }


        System.out.println("Informe a rua do imovel velho: ");
        rua = entrada.next();
        System.out.println("Informe o numero do imovel velho: ");
        numero = entrada.nextInt();
        System.out.println("Informe o bairro do imovel velho: ");
        bairro = entrada.next();
        System.out.println("Informe o CEP do imovel velho: ");
        cep = entrada.nextInt();
        System.out.println("Informe o preco do imovel velho: ");
        preco = entrada.nextDouble();

        
        Velho imovel2 = null;

        try {
            imovel2 = new Velho(rua, numero, bairro, cep, preco, preco);    
        } catch (Exception err) {
            System.err.println("Erro" + err);
        }
        if(imovel2 != null){
            System.out.println(imovel2);
        }
    }
}
