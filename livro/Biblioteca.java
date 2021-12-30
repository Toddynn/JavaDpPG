package livro;

//Vinícius Gabriel Todis & Emilly Rodrigues

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Livro> cadastroLivro;
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
            int quant = 0;
            System.out.println("Você entrou no metodo cadastra. ");
            System.out.println("Quantos livros deseja cadastrar? ");
    
            quant = entrada.nextInt();

            ArrayList<Livro> cadastroLivro = new ArrayList<Livro>();
		    
            String Livro;
          
        for(var j = 0; j < quant; j++) {
            int titulo;
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

            int isbn;
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
            
            int ano;
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
            
            int autor;
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
            int modificar = entrada.nextInt();

            System.out.println("Digite o novo nome do livro :");
            int nomeLivro = entrada.nextInt();

            System.out.println("Digite o novo nome do autor :");
            int nomeAutor = entrada.nextInt();

            System.out.println("Digite o novo isbn do livro :");
            int isbnNovo = entrada.nextInt();

            System.out.println("Digite o novo ano do livro :");
            int novoAno = entrada.nextInt();

            cadastroLivro.get(modificar).setTitulo(nomeLivro).setAutor(nomeAutor).setAno(novoAno).setIsbn(isbnNovo);

            
        }
        
        public static void exclui(Livro livro){
            System.out.println("Você entrou no metodo exclui.");

            
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(i + ": " + cadastroLivro.get(i));
            }
            System.out.println("Qual livro deseja excluir? ");
            int excluir = entrada.nextInt();

            cadastroLivro.get(excluir);
        }
        public static void alugar(Livro livro){
            System.out.println("Você entrou no metodo aluga");
            for(int i=0; i<cadastroLivro.size(); i++){
                System.out.println(i + ": " + cadastroLivro.get(i));
            }
            System.out.println("Qual livro deseja alugar? ");
            int aluga = entrada.nextInt();
            
            cadastroLivro.get(aluga);
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