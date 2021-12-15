//Vinícius Gabriel Todis & Emilly Rodrigues
import java.util.Random;
import java.util.Scanner;

public class Biblioteca{
    
    
    public static void menu(){
            System.out.println("\tMenu");
            System.out.println("0. Cadastrar livro");
            System.out.println("1. Modificar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Alugar livro");
            System.out.println("4. Listar livros disponiveis");
            System.out.println("5. Listar livros indisponiveis");
            System.out.println("6. Sair");
            System.out.println("Opcao:");
        }
    
        public static void cadastra(){
            System.out.println("Você entrou no método cadastra.");
        }
        
        public static void modifica(){
            System.out.println("Você entrou no método modifica.");
        }
        
        public static void exclui(){
            System.out.println("Você entrou no método exclui.");
        }
    
        public static void consulta(Livro livro){
            System.out.println("Você entrou no método consulta.\n");
            for(int i = 0; i <= consulta.length; i++){
                System.out.printf("Titulo %s | ISBN :%d\n Ano %d | autores %s |\n", produto.getTitulo(), produto.getIsbn(), produto.getAno(), produto.getAutor());
            }
        }
    }
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                cadastra();
                break;
                
            case 2:
                modifica();
                break;
                
            case 3:
                exclui();
                break;
                
            case 4:
                consulta();
                break;

            case 5: 
                consulta();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        Livro produto = new consulta("nome_livro_1", 123, 2000, "joao");
        Livro produto2 = new consulta("nome_livro_2", 456, 2001, "alfredo");
        Livro produto3 = new consulta("nome_livro_3", 789, 2002, "plinio");
        Livro produto4 = new consulta("nome_livro_4", 147, 2003, "rodrigo");
        Livro produto5 = new consulta("nome_livro_5", 852, 2004, "jessica");
        Livro produto6 = new consulta("nome_livro_6", 369, 2005, "raimunda");
        Livro produto7 = new consulta("nome_livro_7", 987, 2006, "josefina");
        Livro produto8 = new consulta("nome_livro_8", 654, 1997, "adalberto");
        Livro produto9 = new consulta("nome_livro_9", 321, 1994, "douglas");


    }
}