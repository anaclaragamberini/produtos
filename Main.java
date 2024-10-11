public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new ProdutoFisico("Camiseta", 100.0);
        Produto produto2 = new ProdutoDigital("E-book", 50.0);
        Produto produto3 = new ProdutoFisico("Calça", 150.0);
        
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);

        double desconto = 10.0; // 10% de desconto
        estoque.exibirPrecosComDesconto(desconto);
    }

}
