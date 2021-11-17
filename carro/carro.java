public class carro{
    private String modelo;
    private String cor;
    private int velocidade;

    public carro(String modelo, String cor, int velocidade){
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public void acelerar(){
        System.out.prinln("Acelerando o carro");
    }
}