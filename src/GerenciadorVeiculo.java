import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.List;

public class GerenciadorVeiculo {
    List<VeiculoPasseio> veiculoPasseio = new LinkedList<>();
    List<Motocicleta> motocicleta = new LinkedList<>();
    List<VeiculoCarga> veiculoCarga = new LinkedList<>();
    List<VeiculoPassageiro> veiculoPassageiro = new LinkedList<>();

    int passeio = 0, passageiro = 0, carga = 0, moto = 0;

    public GerenciadorVeiculo() {

    }

    public boolean cadastrarVeiculo(Veiculo veiculo) {
        boolean resposta = false;
        switch (veiculo.getCategoria()) {
            case "Passeio":
                if (passeio == 0) {
                    //this.veiculoPasseio();
                    passeio++;
                }
                resposta = veiculoPasseio.add((VeiculoPasseio) veiculo);
                break;

            case "Passageiro":
                if (passageiro == 0) {
                    //this.veiculoPassageiro;
                    passageiro++;
                }
                resposta = veiculoPassageiro.add((VeiculoPassageiro) veiculo);
                break;

            case "Carga":
                if (carga == 0) {
                    //this.veiculoCarga;
                    passageiro++;
                }
                resposta = veiculoCarga.add((VeiculoCarga) veiculo);
                break;

            case "Motocicleta":
                if (moto == 0) {
                    //this.motocicleta();
                    moto++;
                }
                resposta = motocicleta.add((Motocicleta) veiculo);
                break;

            default:
                JOptionPane.showMessageDialog(null, "ERRO");
        }
        return resposta;
    }

    public boolean excluirVeiculo(int renavam) {
        boolean resposta = false;
        Veiculo veic;

        veic = pesquisarVeiculo(renavam, 0);

        if(veic != null) resposta = true;
        if(resposta) {
            switch (veic.getCategoria()) {
                case "Passeio":
                    veiculoPasseio.remove(veic);
                    break;
                case "Motocicleta":
                    motocicleta.remove(veic);
                    break;
                case "Carga":
                    veiculoCarga.remove(veic);
                    break;
                case "Passageiro":
                    veiculoPassageiro.remove(veic);
                    break;
            }
        }

        return resposta;
    }

    public Veiculo pesquisarVeiculo(int renavam, int busca) {
        Veiculo veic = null;
        boolean resposta = false;


        if(veiculoPasseio != null && resposta == false) {
            for(VeiculoPasseio vp : veiculoPasseio) {
                if(vp.getRenavam() == renavam) {
                    if(busca != 0) JOptionPane.showMessageDialog(null, "RENAVAM ENCONTRADO");
                    veic = vp;
                    resposta = true;
                }
            }
        }
        if(veiculoPassageiro != null && resposta == false) {
            for(VeiculoPassageiro vp : veiculoPassageiro) {
                if(vp.getRenavam() == renavam) {
                    if(busca != 0) JOptionPane.showMessageDialog(null, "RENAVAM ENCONTRADO");
                    veic = vp;
                    resposta = true;
                }
            }
        }
        if(veiculoCarga != null && resposta == false) {
            for(VeiculoCarga vc : veiculoCarga) {
                if(vc.getRenavam() == renavam) {
                    if(busca != 0) JOptionPane.showMessageDialog(null, "RENAVAM ENCONTRADO");
                    veic = vc;
                    resposta = true;
                }
            }
        }
        if(motocicleta != null && resposta == false) {
            for(Motocicleta m : motocicleta) {
                if(m.getRenavam() == renavam) {
                    if(busca != 0) JOptionPane.showMessageDialog(null, "RENAVAM ENCONTRADO");
                    veic = m;
                    resposta = true;
                }
            }
        }
        return veic;
    }
}
