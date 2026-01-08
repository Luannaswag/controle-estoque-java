public class Produto {

    String nome;
    int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
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
}

