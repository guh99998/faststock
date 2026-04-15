package classes;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> produtos = new ArrayList<>();
    List<Fornecedor> fornecedores = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("----------------------------");
            System.out.println("ID - " + produto.getId());
            System.out.println("Nome - " + produto.getNome());
            System.out.println("Descrição - " + produto.getDescricao());
            System.out.println("Preço - " + produto.getPreco());
        }
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void removerFornecedor(Fornecedor fornecedor) {
        fornecedores.remove(fornecedor);
    }

    public void listarFornecedores() {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("----------------------------");
            System.out.println("ID - " + fornecedor.getId());
            System.out.println("Nome - " + fornecedor.getNome());
            System.out.println("Telefone - " + fornecedor.getTelefone());
            System.out.println("E-mail - " + fornecedor.getEmail());
        }
    }

    public void listarProdutosPorFornecedor (Fornecedor fornecedor) {
        for (Produto produto : produtos) {
            if (produto.getIdFornecedor() == fornecedor.getId()) {
                produto.dadosProduto();
            }
        }
    }
}
