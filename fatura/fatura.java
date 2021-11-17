public class fatura{

    private String codigo;
    private String descricao;
    private int quant;
    private double preco;

    public fatura(String codigo, String descricao, int quant, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quant = quant;
        this.double = preco;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getQant(){
        return quant;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
        
    public fatura(String codigo, String descricao, int quant, double preco){

        this.codigo = codigo;
        this.descricao = descricao;

        if(quant > 0)
            this.quant = quant;
        
        if(preco > 0)
            this.preco = preco;

    }

    public double getfatura(){
        
        return quant * preco;
        
    }
}