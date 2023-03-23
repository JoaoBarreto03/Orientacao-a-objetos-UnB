public class VeiculoUtilitario extends Veiculo{

    private String tipo;

    public VeiculoUtilitario(String marca, String modelo, int anoFabricacao, int anoModelo, int renavam, int capTanque, int valorDiaria, String categoria, String tipo) {
        super(marca, modelo, anoFabricacao, anoModelo, renavam, capTanque, valorDiaria, categoria);
        this.tipo = this.tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
