import java.util.Scanner;

public class PessoaTeste{

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        p.setNome("Gelson");
        p.setIdade(16);
        p.setSalario(0);
        System.out.println("nome = " + p.getNome() + "\n idade = " + p.getIdade() + "\n salario" + p.getSalario());
        
        Pessoa p2 = new Pessoa("Claudio", 24);
        p2.setSalario(2000);
        System.out.println("nome = " + p2.getNome() + "\n idade = " + p2.getIdade());
        
        Pessoa p3 = new Pessoa("Juarez", 30);
        p3.setSalario(3000, 10);
        System.out.println("nome = " + p3.getNome() + "\n idade = " + p3.getIdade() + "\n salario = " + p3.getSalario());
        
    } 
}