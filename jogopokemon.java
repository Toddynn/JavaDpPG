//Alunas: Luísa Pedrolli, Gabriela Sena, Gabrieli Aoki Gestal
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.Query;

public class JogoPokemon{
    public static Scanner input;

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Pokemon");
        System.out.println("2. Listar Pokemon");
        System.out.println("3. Batalhar");
        System.out.println("4. Sair");
    }

    public static void PokemonsIniciais(ArrayList<Pokemon> pokemons, ArrayList<Treinador> treinadores){//criar pokemons e treinadores iniciais

        pokemons.add(new Pokemon("Pikachu", 180, 180, 94, "Eletrico",  new Ataque[] //criando pokemon 1
        {new Ataque("Ataque Rapido", 20, 10), new Ataque("Investida trovao", 35, 5), new Ataque("Cauda de ferro", 40, 3) , new Ataque("Choque de trovao", 60, 1)} ));

        pokemons.add(new Pokemon("Scorbunny", 140, 140, 98, "Vento", "Fogo" , new Ataque[] //criando pokemon 2
        {new Ataque("Ataque Rapido", 20, 10), new Ataque("Chute duplo", 40, 5), new Ataque("Brasas", 15, 4) , new Ataque("Ataque fofo", 65, 1)} ));

        treinadores.add(new Treinador("Leaf", 10));//criando treinador 1
        treinadores.add(new Treinador("Ethan", 12));//criando treinador 2
        
        //ver codigo livro
        //pensar em como associar cada treinador com um pokemon
        //ver se precisa de dois treinadores e se o usuario vai escolher o treinador ou ele vai ser predefinido(para todos os pokemons o mesmo)
    } 

    public static void CadastrarPokemons(ArrayList<Pokemon> pokemons, ArrayList<Treinador> treinadores){

        System.out.println("Digite o nome do pokemon: ");
        String nome = input.nextLine(); //armazena o nome do novo pokemon

        System.out.println("Digite o HP total: ");//armazena o hp total, que vai ser igual ao hp atual, pois quando inserimos um novo pokemon ele ainda não gastou hp
        int hPTotal = input.nextInt();

        System.out.println("Digite a iniciativa do pokemon: ");//armazena a iniciativa
        int iniciativa = input.nextInt();

        System.out.println("Digite o ataque: ");//é um vetor, tem que arrumar, mesmo esquema dos autores na avaliação passada
        Ataque ataque = input.nextAtaque();//não lê, pois o tipo da viarável é Ataque, e não tem next"alguma coisa" pra esse tipo

        System.out.println("O pokemon possui 1 ou 2 tipos? ");//pergunta se o pokemon tem um ou dois tipos pra entrar no if
        int tipos = input.nextInt();

        if(tipos==1){//se o pokemon tiver um tipo vai armazenar no objeto do arraylist com um tipo e vice-versa, assim tem como diferenciar os pokemons que tem um tipo e os que tem 2 tipos
            System.out.println("Digite o tipo do pokemon: ");
            String tipo1 = input.nextLine();

            //pokemons.add(new Pokemon(nome, hPTotal, hPTotal, iniciativa, tipo1, ataque));//tem que arrumar vetor de ataque para continuar
        }
        else{
            System.out.println("Digite o tipo 1 do pokemon: ");
            String tipo1 = input.nextLine();

            System.out.println("Digite o tipo 2 do pokemon: ");
            String tipo2 = input.nextLine();

            //pokemons.add(new Pokemon(nome, hPTotal, hPTotal, iniciativa, tipo1, tipo2, ataque));
        }
        //DEIXEI EM COMENTÁRIO A PARTE DE ADICIONAR NO ARRAYLIST POIS TEM QUE ARRUMAR A PARTE DO ATAQUE
    }

    public static void main(String[] args){
        input = new Scanner(System.in);
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        ArrayList<Treinador> treinadores = new ArrayList<Treinador>();
        PokemonsIniciais(pokemons, treinadores); //chamando metodo pra criar pokemons e treinadores iniciais

        int menu = 1;
        while((menu>=1)&(menu<=4)){//rodar o menu enquanto o menu>=1 ou menu<=4
            System.out.println("-------------------------------------------------");
            menu();
            menu = input.nextInt();
            input.nextLine();
            System.out.println("-------------------------------------------------");
            switch(menu){ //escolher opcao do menu

                case 1://Cadastrar Pokemon
                CadastrarPokemons(pokemons, treinadores);
                    break;
                
                case 2://Listar Pokemon
        
                //COLOQUEI PARA IMPRIMIR POKEMONS E TREINADORES JUNTOS
                System.out.println(pokemons);//ver por que não aparece o nome do pokemon
                System.out.println();
                System.out.println(treinadores);//ver por que não aparece o nome do treinador
                    break;

                case 3:// Batalhar
                
                    break;

                case 4://Sair
                
                System.out.println("-------------------------------------------------");
                System.out.println("Jogo encerrado!");
                System.out.println("-------------------------------------------------");
                    break;
            }
        }
    }
}