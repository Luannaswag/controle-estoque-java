public class Produto {

    String nome;
    int quantidade;
    double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void entrada(int valor) {
        quantidade += valor;
    }

    public boolean saida(int valor) {
        if (valor <= quantidade) {
            quantidade -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double valorTotal() {
        return quantidade * preco;
    }
}

