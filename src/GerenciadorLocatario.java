import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class GerenciadorLocatario {
    List<PessoaFisica> pessoasFisicas = new LinkedList<>();
    List<PessoaJuridica> pessoasJuridicas = new LinkedList<>();

    public GerenciadorLocatario(){

    }

    public boolean cadastrarLocatario(Locatario loc, int opcao) {
        boolean resposta = false;

        switch(opcao) {
            case 1:
                resposta = pessoasFisicas.add((PessoaFisica) loc);
                break;
            case 2:
                resposta = pessoasJuridicas.add((PessoaJuridica) loc);
        }
        return resposta;
    }

    public Locatario pesquisarLocatario(String nome ,int num, String opcao){
        Locatario loc = null;
        boolean resposta = false;
        switch (opcao) {
            case "CPF":
                if(pessoasFisicas != null) {
                    for (PessoaFisica pf : pessoasFisicas) {
                        if (pf.getCpf().equalsIgnoreCase(nome)) {
                            if (num != 0) {
                                JOptionPane.showMessageDialog(null, "CPF encontrado: " + pf.getCpf() + "\nNome: " + pf.getNome() + "\nEmail: " + pf.getEmail() + "\nTelefone: " + pf.getTelefone() + "\nEstado: " + pf.getEndereco().getEstado() + "\nCidade: " + pf.getEndereco().getCidade());
                                loc = pf;
                                resposta = true;
                            }
                        }
                    }
                }
                break;
            case "CNPJ":
                if(pessoasFisicas != null) {
                    for (PessoaJuridica pj : pessoasJuridicas) {
                        if (pj.getCnpj().equalsIgnoreCase(nome)) {
                            if (num != 0) {
                                JOptionPane.showMessageDialog(null, "CNPJ encontrado: " + pj.getCnpj() + "\nNome Social: " + pj.getNomeSocial() + "\nEmail: " + pj.getEmail() + "\nTelefone: " + pj.getTelefone() + "\nEstado: " + pj.getEndereco().getEstado() + "\nCidade: " + pj.getEndereco().getCidade());
                                loc = pj;
                                resposta = true;
                            }
                        }
                    }
                }
                break;
            case "NOME":
                if(pessoasFisicas != null) {
                    for (PessoaFisica pf : pessoasFisicas) {
                        if (pf.getNome().equalsIgnoreCase(nome)) {
                            if (num != 0) {
                                JOptionPane.showMessageDialog(null, "Nome encontrado: " + pf.getNome() + "\nCPF: " + pf.getCpf() + "\nEmail: " + pf.getEmail() + "\nTelefone: " + pf.getTelefone() + "\nEstado: " + pf.getEndereco().getEstado() + "\nCidade: " + pf.getEndereco().getCidade());
                                loc = pf;
                                resposta = true;
                            }
                        }
                    }
                }
                break;
            case "NOME SOCIAL":
                if(pessoasFisicas != null) {
                    for (PessoaJuridica pj : pessoasJuridicas) {
                        if (pj.getNomeSocial().equalsIgnoreCase(nome)) {
                            if (num != 0) {
                                JOptionPane.showMessageDialog(null, "Nome social encontrado: " + pj.getNomeSocial() + "\nCNPJ: " + pj.getCnpj() + "\nEmail: " + pj.getEmail() + "\nTelefone: " + pj.getTelefone() + "\nEstado: " + pj.getEndereco().getEstado() + "\nCidade: " + pj.getEndereco().getCidade());
                                loc = pj;
                                resposta = true;
                            }
                        }
                    }
                }
                break;
            case "EMAIL":
                if(pessoasFisicas != null) {
                    for (PessoaFisica pf : pessoasFisicas) {
                        if (pf.getEmail().equalsIgnoreCase(nome)) {
                            if (num != 0) {
                                JOptionPane.showMessageDialog(null, "EMAIL encontrado: " + pf.getEmail() + "\nNome: " + pf.getNome() + "\nCPF: " + pf.getCpf() + "\nTelefone: " + pf.getTelefone() + "\nEstado: " + pf.getEndereco().getEstado() + "\nCidade: " + pf.getEndereco().getCidade());
                                loc = pf;
                                resposta = true;
                            }
                        }
                    }
                }
                if(pessoasJuridicas != null) {
                    for (PessoaJuridica pj : pessoasJuridicas) {
                        if (pj.getEmail().equalsIgnoreCase(nome)) {
                            if (num != 0) {
                                JOptionPane.showMessageDialog(null, "EMAIL encontrado: " + pj.getEmail() + "\nNome Social: " + pj.getNomeSocial() + "\nCNPJ: " + pj.getCnpj() + "\nTelefone: " + pj.getTelefone() + "\nEstado: " + pj.getEndereco().getEstado() + "\nCidade: " + pj.getEndereco().getCidade());
                                loc = pj;
                                resposta = true;
                            }
                        }
                    }
                }
                break;
        }
        return loc;
    }
    public boolean excluirLocatario(String nome, String pfpj){
        boolean resposta = false;
        Locatario busca;
        switch (pfpj) {
            case "CPF":
                busca = pesquisarLocatario(nome, 1, "CPF");
                if(busca != null){
                    pessoasFisicas.remove(busca);
                    resposta = true;
                }
                break;
            case "CNPJ":
                busca = pesquisarLocatario(nome, 1, "CNPJ");
                if(busca != null){
                    pessoasJuridicas.remove(busca);
                    resposta = true;
                }
                break;
        }
        return resposta;
    }
    public boolean editarPessoaFisica(PessoaFisica pf) {
        boolean resposta = false;
        String opcao;
        boolean emBranco = false;

        if(pf != null) resposta = true;

//        switch(opcao) {
//            case "A":
//                String nome = null;
//                while(!)
//        }
        return resposta;
    }
}
