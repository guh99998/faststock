package model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Categoria categoria;
    private double precoCusto;
    private double precoVenda;
    private int quantidade;
    private int minEstoque;
    private Fornecedor fornecedor;

    public Produto(int id, String nome, String descricao, Categoria categoria, double precoCusto, int quantidade, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.precoCusto = precoCusto;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public void dadosProduto() {
        System.out.println("---------------------");
        System.out.println("ID - " + this.id);
        System.out.println("Nome - " + this.nome);
        System.out.println("Descrição - " + this.descricao);
        System.out.println("Preço de Venda - " + this.precoVenda);
        System.out.println("Preço de Custo - " + this.precoCusto);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setMinEstoque(int minEstoque) {
        this.minEstoque = minEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
}
