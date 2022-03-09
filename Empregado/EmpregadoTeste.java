public class EmpregadoTeste {
    public static void main(String[] args) {
        EmpregadoComissionado empregado1 = 
            new EmpregadoComissionado("Josevaldo", 123321, 30000, 0.1);
        EmpregadoComissionadoBase empregado2 = 
            new EmpregadoComissionadoBase("Creusa", 456654, 25000, 0.12, 1000);
        EmpregadoHorista empregado3 =
            new EmpregadoHorista("Plinio", 789987, 40, 200);
        EmpregadoAssalariado empregado4 = null;
        try {
            empregado4 = new EmpregadoAssalariado("Claudio", 147741, 250);
        } catch (Exception err) {
            System.err.println("Erro" + err);
        }
            
        System.out.println(empregado1);

        System.out.println(empregado2);

        System.out.println(empregado3);
        if(empregado4 != null){
            System.out.println(empregado4);
        }
        
    }
}