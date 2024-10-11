class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }
}

class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        // Para produtos digitais, aplica-se um desconto diferente
        return preco - (preco * (porcentagem + 5) / 100); // Desconto adicional de 5%
    }
}
