import java.util.Random;
public class JogoDeDado{

    public static void main(String[] args) {
        int[][] frequencia = new int[6][6];
        Random dado = new Random();
       
        for(int i = 0; i < 36000000; i++)
            frequencia[dado.nextInt(6)][dado.nextInt(6)]++;
    
        System.out.printf("%10d%10d%10d%10d%10d%10d\n", 1,2,3,4,5,6);
       
        for(int i = 0 ; i < frequencia.length; i++){
            for(int j = 0; j < frequencia[i].length; j++){
                System.out.printf("%10d", frequencia[i][j]);
            }
            System.out.println();
        }
    }
}