import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class IdadeTeste{
    
    public static void main(String[] args){
        System.out.println("*******************Cadastro de Idade************************");
        System.out.println("*Idade: Inteiro");

        ArrayList<Idade> cadastroIdade = new ArrayList<Idade>();
		
		Scanner entrada = new Scanner(System.in);
        int idade = 0;
          
        do{
            try{
                System.out.println("Informe a idade do cliente: *Tecle 0 para sair*");
                idade = entrada.nextInt();
                if(idade != 0){
                    cadastroIdade.add(new Idade(idade));
                }      
            } catch(InputMismatch1Exception error){
                System.err.println(error);
                System.out.println("Caractere invalido");
                entrada.nextLine();
            }
        }while(idade != 0);
        
        for(int i=0; i<cadastroIdade.size(); i++){
          System.out.println(cadastroIdade.get(i).getIdade());
		}
    }
}