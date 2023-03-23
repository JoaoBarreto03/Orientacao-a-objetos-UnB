public class Motocicleta extends Veiculo{
    private boolean controleTracao;
    private boolean freioAbs;
    private boolean pilotoAut;
    private String modoConducao;

    public Motocicleta(String marca, String modelo, int anoFabricacao, int anoModelo, int renavam, int capTanque, int valorDiaria, String categoria, boolean controleTracao, boolean freioAbs, boolean pilotoAut, String modoConducao){
        super(marca, modelo, anoFabricacao, anoModelo, renavam, capTanque, valorDiaria, categoria);
        this.controleTracao = controleTracao;
        this.freioAbs = freioAbs;
        this.pilotoAut = pilotoAut;
        this.modoConducao = modoConducao;
    }

    public boolean isControleTracao() {
        return controleTracao;
    }

    public void setControleTracao(boolean controleTracao) {
        this.controleTracao = controleTracao;
    }

    public boolean isFreioAbs() {
        return freioAbs;
    }

    public void setFreioAbs(boolean freioAbs) {
        this.freioAbs = freioAbs;
    }

    public boolean isPilotoAut() {
        return pilotoAut;
    }

    public void setPilotoAut(boolean pilotoAut) {
        this.pilotoAut = pilotoAut;
    }

    public String getModoConducao() {
        return modoConducao;
    }

    public void setModoConducao(String modoConducao) {
        this.modoConducao = modoConducao;
    }
}
