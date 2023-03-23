public class VeiculoCarga extends VeiculoUtilitario{

    private int tara;
    private int capacidadeCarga;
    private String tipoCarga;

    public VeiculoCarga(String marca, String modelo, int anoFabricacao, int anoModelo, int renavam, int capTanque, int valorDiaria, String categoria, String tipo) {
        super(marca, modelo, anoFabricacao, anoModelo, renavam, capTanque, valorDiaria, categoria, tipo);
        this.tara = tara;
        this.capacidadeCarga = capacidadeCarga;
        this.tipoCarga = tipoCarga;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }
}
