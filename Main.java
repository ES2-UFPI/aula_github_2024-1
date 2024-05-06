import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
        
        int op1;
        do {
            op1 = mainMenu.getSelection();

            switch (op1) {
                case 1:
                    contaMenu();
                    break;
                case 2:
                    clienteMenu();
                    break;
                case 3:
                    operacaoMenu();
                    break;
                case 4:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op1 != 4);
    }

    public static void contaMenu() {
        Menu contaMenu = new Menu("Menu Conta", Arrays.asList("Abrir Conta", "Voltar"));

        int op2;
        do {
            op2 = contaMenu.getSelection();

            switch (op2) {
                case 1:
                    System.out.println("Abrir Conta selecionado");
                    // Implemente a lógica para abrir uma conta
                    break;
                case 2:
                    System.out.println("Voltar para o Menu Principal");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op2 != 2);
    }

    public static void clienteMenu() {
        Menu clienteMenu = new Menu("Menu Cliente", Arrays.asList("Consultar Saldo", "Consultar Extrato", "Voltar"));

        int op3;
        do {
            op3 = clienteMenu.getSelection();

            switch (op3) {
                case 1:
                    System.out.println("Consultar Saldo selecionado");
                    // Implemente a lógica para consultar saldo
                    break;
                case 2:
                    System.out.println("Consultar Extrato selecionado");
                    // Implemente a lógica para consultar extrato
                    break;
                case 3:
                    System.out.println("Voltar para o Menu Principal");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op3 != 3);
    }

    public static void operacaoMenu() {
        Menu operacaoMenu = new Menu("Menu Operação", Arrays.asList("Realizar Saque", "Realizar Depósito", "Realizar Transferência", "Voltar"));

        int op4;
        do {
            op4 = operacaoMenu.getSelection();

            switch (op4) {
                case 1:
                    System.out.println("Realizar Saque selecionado");
                    // Implemente a lógica para realizar saque
                    break;
                case 2:
                    System.out.println("Realizar Depósito selecionado");
                    // Implemente a lógica para realizar depósito
                    break;
                case 3:
                    System.out.println("Realizar Transferência selecionado");
                    // Implemente a lógica para realizar transferência
                    break;
                case 4:
                    System.out.println("Voltar para o Menu Principal");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op4 != 4);
    }
}