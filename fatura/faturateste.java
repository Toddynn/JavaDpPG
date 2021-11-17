public class faturateste{
    public static void imprimirfatura(fatura produto) {
        System.out.printf("codigo %s | descricao :%s\n quant %d | preco %.2f | valor %.2f\n", produto.getCodigo(), produto.getDescricao(), produto.getQuant(), produto.getPreco(), produto.getfatura());
    }

    public static void main(String[] args) {
        
        fatura produto = new fatura("123", "mouse", 3, 509);
        fatura produto2 = new fatura("234", "teclado", 2, 300);
        fatura produto3 = new fatura("345", "monitor", 2, 400);
        fatura produto4 = new fatura("456", "headset", 5, 700);

       imprimirfatura(produto);
       imprimirfatura(produto2);
       imprimirfatura(produto3);
       imprimirfatura(produto4);
    }
}