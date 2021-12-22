//Vinícius Gabriel Todis & Emilly Rodrigues
import java.util.Random;
import java.util.Scanner;

public class Biblioteca{
    static Scanner entrada = new Scanner(System.in);
    public static void imprimirMenu(){
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
            quant = 0;
            System.out.println("Você entrou no metodo cadastra. ");
            System.out.println("Quantos livros deseja cadastrar? ");
    
            quant = entrada.nextInt();

            ArrayList<Livro> cadastroLivro = new ArrayList<Livro>();
		    
            String Livro = 0;
          
        for(var j = 0; j < quant; j++) {
            do{ 
                System.out.println("Informe o título do livro:");
                titulo = entrada.nextInt();
            if(titulo != 0){
                cadastroLivro.add(new Livro(titulo));
            }      
            }while(titulo != 0);
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(cadastroLivro.get(i).getTitulo());
            }

            do{ 
                System.out.println("Informe o ISBN do livro:");
                isbn = entrada.nextInt();
            if(isbn != 0){
                cadastroLivro.add(new Livro(isbn));
            }      
            }while(isbn != 0);
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(cadastroLivro.get(i).getIsbn());
            }
            
            do{ 
                System.out.println("Informe o ano livro:");
                ano = entrada.nextInt();
            if(ano != 0){
                cadastroLivro.add(new Livro(ano));
            }      
            }while(ano != 0);
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(cadastroLivro.get(i).getAno());
            }
            
            do{ 
                System.out.println("Informe o Autor do livro:");
                autor = entrada.nextInt();
            if(autor != 0){
                cadastroLivro.add(new Livro(autor));
            }      
            }while(autor != 0);
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(cadastroLivro.get(i).getAutor());
            }
            
        }
        }
        
        public static void modifica(Livro livro){
            System.out.println("Você entrou no metodo modifica. ");
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(i + ": " + cadastroLivro.get(i));
            }
            System.out.println("Qual livro deseja modificar? ");
            modificar = entrada.nextInt();

            System.out.println("Digite o novo nome do livro :");
            nomeLivro = entrada.nextInt();

            System.out.println("Digite o novo nome do autor :");
            nomeAutor = entrada.nextInt();

            System.out.println("Digite o novo isbn do livro :");
            isbnNovo = entrada.nextInt();

            System.out.println("Digite o novo ano do livro :");
            novoAno = entrada.nextInt();

            cadastroLivro.get(modificar).setTitulo(nomeLivro).setAutor(nomeautor).setAno(novoAno).setIsbn(isbnNovo);

            
        }
        
        public static void exclui(Livro livro){
            System.out.println("Você entrou no metodo exclui.");
        }
    
        public static void consulta(Livro livro){
            System.out.println("Você entrou no metodo consulta.\n");
            for(int i = 0; i <= consulta.length; i++){
                System.out.printf("Titulo %s | ISBN :%d\n Ano %d | autores %s |\n", livro.getTitulo(), livro.getIsbn(), livro.getAno(), livro.getAutor());
            }
        }
    
    public static void main(String[] args) {
        imprimirMenu();
        int opcao;
        opcao = entrada.nextInt();

        do{

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


    }
}