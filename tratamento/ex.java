public class ex{
    public static void main(String[] args) {
        int divisao = 0;
        try{
            divisao = 10/0;
        } 
        catch(ArithmeticException error){
            
        }
        System.out.println(divisao);
    }
    
}