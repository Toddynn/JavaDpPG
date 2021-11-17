public class iniciavetor{

    public static void main(String[] args) {
        
        int[] vetor = new int[Integer.parseInt(args[0])];
        int valor = Integer.parseInt(args[1]);
        int incremento = Integer.parseInt(args[2]);

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = valor;
            valor += incremento;
        }
        //for aprimorado serve apenas para ler o vetor.
        for(int v : vetor)
            System.out.print(v + " ");
    }
}