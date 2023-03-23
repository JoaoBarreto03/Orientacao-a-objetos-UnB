public class VeiculoPasseio extends Veiculo{
    private String tipo;
    private boolean arCondicionado;
    private boolean dirHidraulica;
    private boolean automatico;

    public VeiculoPasseio(String marca, String modelo, int anoFabricacao, int anoModelo, int renavam, int capTanque, int valorDiaria, String categoria, String tipo, boolean arCondicionado, boolean dirHidraulica, boolean automatico) {
        super(marca, modelo, anoFabricacao, anoModelo, renavam, capTanque, valorDiaria, categoria);
        this.tipo = tipo;
        this.arCondicionado = arCondicionado;
        this.dirHidraulica = dirHidraulica;
        this.automatico = automatico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
