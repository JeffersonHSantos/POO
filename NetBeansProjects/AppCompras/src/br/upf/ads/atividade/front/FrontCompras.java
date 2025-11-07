package br.upf.ads.atividade.front;
import br.upf.ads.atividade.model.Compra;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class FrontCompras {
    private static final ArrayList<Compra> compras = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }    
    
    public static void menu() {
        int opcao;

        do {
            System.out.println("\nMENU DE COMPRAS");
            System.out.println("1. Incluir Compra");
            System.out.println("2. Listar Compras");
            System.out.println("3. Alterar Compra");
            System.out.println("4. Excluir Compra");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> incluirCompra();
                case 2 -> listarCompras();
                case 3 -> alterarCompra();
                case 4 -> excluirCompra();
                case 5 -> System.exit(0);
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 5);

        listarCompras();
    }

    private static void incluirCompra() {
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade: ");
        int qtd = scanner.nextInt();

        System.out.print("Preco: ");
        double preco = scanner.nextDouble();

        Compra compra = new Compra(codigo, nome, qtd, preco);
        
       
        
        if (compras.contains(compra))
            System.out.println("Já existe.");
        else {
             compras.add(compra);
                System.out.println("Compra adicionada com sucesso!");
        }
        ;
    }

    private static void listarCompras() {
        if (compras.isEmpty()) {
            System.out.println("Nenhuma compra cadastrada.");
        } else {
            for (Compra c : compras) {
                System.out.println(c);
            }
        }
    }

    private static void alterarCompra() {
        System.out.print("Informe o codigo da compra para alterar: ");
        int codigo = scanner.nextInt();

        for (Compra c : compras) {
            if (c.getCodigo() == codigo) {
                scanner.nextLine();
                System.out.print("Novo nome do produto: ");
                c.setNomeProduto(scanner.nextLine());

                System.out.print("Nova quantidade: ");
                c.setQuantidade(scanner.nextInt());

                System.out.print("Novo preco: ");
                c.setPreco(scanner.nextDouble());

                System.out.println("Compra alterada com sucesso.");
                return;
            }
        }
        System.out.println("Compra nao encontrada.");
    }

    private static void excluirCompra() {
        System.out.print("Informe o codigo da compra para excluir: ");
        int codigo = scanner.nextInt();

        boolean removido = compras.removeIf(c -> c.getCodigo() == codigo);
        if (removido) {
            System.out.println("Compra removida com sucesso.");
        } else {
            System.out.println("Compra nao encontrada.");
        }
    }
}
