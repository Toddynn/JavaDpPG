public class carroteste{

    public static void main(String[] args) {
        carro carro1 = new carro("bravo", "laranja", 100);

        carro1.setModelo("Nivus");

        System.out.printf("modelo %s | cor %s | velocidade %d\n", carro1.getModelo(), carro1.getCor(), carro1.getVelocidade());
        
        carro1.acelerar();
        carro1.acenderfarol();
        carro1.frear();
    }
}