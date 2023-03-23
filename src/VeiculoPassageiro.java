public class VeiculoPassageiro extends VeiculoUtilitario{
    private boolean arCondicionado;
    private boolean dirHidraulica;
    private boolean televisao;
    private int capacidadePassageiros;

    public VeiculoPassageiro(String marca, String modelo, int anoFabricacao, int anoModelo, int renavam, int capTanque, int valorDiaria, String categoria, String tipo, boolean arCondicionado, boolean dirHidraulica, boolean televisao, int capacidadePassageiros) {
        super(marca, modelo, anoFabricacao, anoModelo, renavam, capTanque, valorDiaria, categoria, tipo);
        this.arCondicionado = arCondicionado;
        this.dirHidraulica = dirHidraulica;
        this.televisao = televisao;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isDirHidraulica() {
        return dirHidraulica;
    }

    public void setDirHidraulica(boolean dirHidraulica) {
        this.dirHidraulica = dirHidraulica;
    }

    public boolean isTelevisao() {
        return televisao;
    }

    public void setTelevisao(boolean televisao) {
        this.televisao = televisao;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
