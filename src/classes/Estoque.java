package classes;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private List<Categoria> categorias = new ArrayList<>();

    public void cadastrarProdutoEstoque(Produto produto) {
        produtos.add(produto);
    }

    public void removerProdutoEstoque(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("----------------------------");
            System.out.println("ID - " + produto.getId());
            System.out.println("Nome - " + produto.getNome());
            System.out.println("Fornecedor - " + produto.getFornecedor().getNomeFornecedor());
            System.out.println("Categoria - " + produto.getCategoria().getNomeCategoria());
            System.out.println("Descrição - " + produto.getDescricao());
            System.out.println("Quantidade - " + produto.getQuantidade());
            System.out.println("Preço de Custo - " + produto.getPrecoCusto());
            System.out.println("Preço de Venda - " + produto.getPrecoVenda());
            System.out.println("Ganho - " + (produto.getPrecoVenda() - produto.getPrecoCusto()));
        }
    }

    public void listarProdutosPorCategoria() {
        for (Categoria categoria : categorias) {
            System.out.println("---------------------");
            System.out.println(categoria.getNomeCategoria());
            for (Produto produto : produtos) {
                if (produto.getCategoria().getIdCategoria() == categoria.getIdCategoria()) {
                    produto.dadosProduto();
                }
            }
        }
    }

    public void cadastrarCategoriaEstoque(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoriaEstoque(Categoria categoria) {
        categorias.remove(categoria);
    }

    public void listarCategorias() {
        for (Categoria categoria : categorias) {
            System.out.println("----------------------------");
            System.out.println("ID - " + categoria.getIdCategoria());
            System.out.println("Nome - " + categoria.getNomeCategoria());
        }
    }

    public void cadastrarFornecedorEstoque(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void removerFornecedorEstoque(Fornecedor fornecedor) {
        fornecedores.remove(fornecedor);
    }

    public void listarFornecedores() {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("----------------------------");
            System.out.println("ID - " + fornecedor.getIdFornecedor());
            System.out.println("Nome - " + fornecedor.getNomeFornecedor());
            System.out.println("Telefone - " + fornecedor.getTelefoneFornecedor());
            System.out.println("E-mail - " + fornecedor.getEmailFornecedor());
        }
    }

    public void listarProdutosPorFornecedor () {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("---------------------");
            System.out.println(fornecedor.getNomeFornecedor());
            for (Produto produto : produtos) {
                if (produto.getFornecedor().getIdFornecedor() == fornecedor.getIdFornecedor()) {
                    produto.dadosProduto();
                }
            }

        }
    }
}
