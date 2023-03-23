import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opcao;

        opcao = JOptionPane.showInputDialog("-------MENU PRINCIPAL-------\nA) Menu de Gerenciamento de Locatários\nB) Menu de Gerenciamento de Veículos\nC) Menu de Gerenciamento de Reservas").toUpperCase();

        switch (opcao) {
            case "A":
                String menuLoc;
                menuLoc = JOptionPane.showInputDialog("-------Menu de Gerenciamento de Locatários-------\nA) Cadastrar Locatário\nB) Excluir Locatário");
            case "B":
                String menuVeic;
                menuVeic = JOptionPane.showInputDialog("-------Menu de Gerenciamento de Veículos-------\nA) Cadastrar veículo\nB) Excluir veículo\nC) Pesquisar renavam");


        }

    }
}