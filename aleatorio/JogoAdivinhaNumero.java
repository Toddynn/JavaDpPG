//Vinícius Gabriel Todis e Emilly Carolina
package aleatorio;
import java.util.Random;
import java.util.Scanner;
    

public class JogoAdivinhaNumero {

    public static void dica(int palpite, int sorteado, int tentativas, int diferenca){
        
        if(tentativas == 5){
            System.out.println("Nao foi dessa vez... :(");
        }
        if(diferenca <= 10){
            System.out.println("Muito quente");
        }else if(diferenca > 10 && diferenca <= 25){
                System.out.println("Quente");
        }else if(diferenca > 25 && diferenca <= 50){
            System.out.println("Morno");
        }else if(diferenca > 50 && diferenca <= 100){
            System.out.println("Frio");
        }else if(diferenca > 100){
            System.out.println("Muito frio");
        }
        if(palpite == sorteado){
                System.out.println("Parabéns, você acertou! O número era " + sorteado);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
        }
    }
}
    
    public static void main(String[] args) {
        int palpite=0; 
        int sorteado; 
        int tentativas=0;
        int diferenca;
        
        try (Scanner entrada = new Scanner(System.in)) {
            Random geradorDeAleatorios = new Random();
            sorteado = geradorDeAleatorios.nextInt(1000) + 1;
            System.out.println("Número entre 1 e 1000 sorteado!");

            do{
                System.out.printf("\n\n\n\n-----------------\n");
                System.out.println("Número de tentativas: " + tentativas);
                
                System.out.print("Qual seu palpite: ");
                palpite = entrada.nextInt();
                
                diferenca = (sorteado - palpite);
                
                tentativas++;
                
                dica(palpite,sorteado, tentativas, diferenca);
            }while (palpite != sorteado);
        }

    }

}
