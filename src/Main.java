import javax.swing.JOptionPane;

public class Main {
    static GerenciadorLocatario gLoc = new GerenciadorLocatario();

    public static void main(String[] args) {

        String opcao;

        opcao = JOptionPane.showInputDialog("-------MENU PRINCIPAL-------\nA) Gerenciamento de Locatários\nB) Gerenciamento de Veículos\nC) Gerenciamento de Reservas").toUpperCase();
        String menuLoc = null, menuVeic, menuRes;
        switch (opcao) {
            case "A":
                menuLoc = JOptionPane.showInputDialog("-------Gerenciamento de Locatários-------\nA) Cadastrar locatário\nB) Excluir locatário").toUpperCase();
                break;
            case "B":
                menuVeic = JOptionPane.showInputDialog("-------Gerenciamento de Veículos-------\nA) Cadastrar veículo\nB) Excluir veículo\nC) Pesquisar renavam\nD) Pesquisar marca\nE) Pesquisar modelo\nF) Pesquisar categoria\nG) Atualizar dados").toUpperCase();
                break;
            case "C":
                menuRes = JOptionPane.showInputDialog("-------Gerenciamento de Reservas-------\nA) Cadastrar reserva\nB) Excluir reserva\nC) Emitir relatório\nD) Calcular reserva");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");

        }

        String opcaoFJ;
        String opcaoLoc;
        String nome, nomeSocial, cpf, cnpj, email, telefone;
        Endereco endereco = null;
        switch (menuLoc) {
            case "A":
                opcaoFJ = JOptionPane.showInputDialog("-------Cadastrar Locatário-------\nA) Pessoa Física\nB) Pessoa Jurídica");
                switch (opcaoFJ) {
                    case "A":
                        JOptionPane.showMessageDialog(null, "-------Cadastrar Locatório-------\n");
                        nome = JOptionPane.showInputDialog("Digite o nome:");
                        cpf = JOptionPane.showInputDialog("Digite o CPF");
                        endereco = validaEndereco();
//                        endereco = JOptionPane.showInputDialog("Digite o endereço:");

                        email = JOptionPane.showInputDialog("Digite o email:");
                        telefone = JOptionPane.showInputDialog("Digite o telefone:");
                        PessoaFisica pf = new PessoaFisica(endereco, email, telefone, nome, cpf);
                        break;
                    case "B":
                        JOptionPane.showMessageDialog(null, "-------Cadastrar Locatório-------\n");
                        nomeSocial = JOptionPane.showInputDialog("Digite o nome social:");
                        cnpj = JOptionPane.showInputDialog("Digite o CNPJ");
                        endereco = validaEndereco();
                        //                      endereco = JOptionPane.showInputDialog("Digite o endereço:");
                        email = JOptionPane.showInputDialog("Digite o email:");
                        telefone = JOptionPane.showInputDialog("Digite o telefone:");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
                break;
            case "B":

                nome = JOptionPane.showInputDialog("Digite o nome do Locatário:");
                opcaoFJ = JOptionPane.showInputDialog("CPF ou CNPJ?");
                switch (opcaoFJ) {
                    case "CPF":
                        gLoc.excluirLocatario(nome, "CPF");
                        break;
                    case "CNPJ":
                        gLoc.excluirLocatario(nome, "CNPJ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
                gLoc.excluirLocatario(nome, opcaoFJ);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");


        }

    }

    private static Endereco validaEndereco() {
        Endereco endereco = null;
        String rua = null, complemento = null, bairro = null, cidade = null,
                estado = null, numero = null, cep = null;

        estado = JOptionPane.showInputDialog("Digite o estado:");
        cidade = JOptionPane.showInputDialog("Digite a cidade:");
        bairro = JOptionPane.showInputDialog("Digite o nome do bairro:");
        rua = JOptionPane.showInputDialog("Digite o nome da rua:");
        numero = JOptionPane.showInputDialog("Digite o numero:");
        cep = JOptionPane.showInputDialog("Digite o CEP:");
        complemento = JOptionPane.showInputDialog("Digite o complemento do endereço");

        endereco = new Endereco(rua, complemento, bairro, cidade, estado, numero, cep);
        return endereco;
    }
}




