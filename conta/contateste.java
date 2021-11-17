public class contateste{
    public static void imprimirconta(conta pessoa){
        System.out.printf("Nome %s | Saldo &.2f\n" pessoa.getNome(), pessoa.getSaldo())
    }
    public static void main(String[] args) {
        conta pessoa = new conta("lucas", 1000);
        conta pessoa2 = new conta("leticia", 2000);
        conta pessoa3 = new conta("osvaldo", 1500);

        imprimirconta(pessoa);
        pessoa.deposito(-1);
        imprimirconta(pessoa);
        pessoa.saque(1200);
        imprimirconta(pessoa);

        
    }
}