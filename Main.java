import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== CONTROLE DE ESTOQUE ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Entrada de produto");
            System.out.println("3 - Saída de produto");
            System.out.println("4 - Listar estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();

                System.out.print("Quantidade inicial: ");
                int quantidade = scanner.nextInt();

                produtos.add(new Produto(nome, quantidade));
                System.out.println("Produto cadastrado!");
            }

            if (opcao == 2) {
                System.out.print("Produto: ");
                String nome = scanner.nextLine();

                for (Produto p : produtos) {
                    if (p.nome.equalsIgnoreCase(nome)) {
                        System.out.print("Quantidade de entrada: ");
                        int valor = scanner.nextInt();
                        p.entrada(valor);
                        System.out.println("Entrada registrada!");
                    }
                }
            }

            if (opcao == 3) {
                System.out.print("Produto: ");
                String nome = scanner.nextLine();

                for (Produto p : produtos) {
                    if (p.nome.equalsIgnoreCase(nome)) {
                        System.out.print("Quantidade de saída: ");
                        int valor = scanner.nextInt();

                        if (p.saida(valor)) {
                            System.out.println("Saída registrada!");
                        } else {
                            System.out.println("Estoque insuficiente!");
                        }
                    }
                }
            }

            if (opcao == 4) {
                for (Produto p : produtos) {
                    System.out.println(p.nome + " - Quantidade: " + p.quantidade);
                }
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
