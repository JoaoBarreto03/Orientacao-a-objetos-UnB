public class Reserva {
    Locatario reserv;

    private int numReserva;
    private boolean seguroTerceiro;
    private boolean seguroCarro;
    private String tipoDiaria;
    private String dataLocacao;
    private String horaLocacao;
    private String  dataEntrega;
    private String horaEntrega;

    public Reserva(int numReserva, boolean seguroTerceiro, boolean seguroCarro, String tipoDiaria, String dataLocacao, String horaLocacao, String horaEntrega, String dataEntrega) {
        super();
        this.numReserva = numReserva;
        this.seguroTerceiro = seguroTerceiro;
        this.seguroCarro = seguroCarro;
        this.tipoDiaria = tipoDiaria;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataEntrega = dataEntrega;
        this.horaEntrega = horaEntrega;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public boolean isSeguroTerceiro() {
        return seguroTerceiro;
    }

    public void setSeguroTerceiro(boolean seguroTerceiro) {
        this.seguroTerceiro = seguroTerceiro;
    }

    public boolean isSeguroCarro() {
        return seguroCarro;
    }

    public void setSeguroCarro(boolean seguroCarro) {
        this.seguroCarro = seguroCarro;
    }

    public String getTipoDiaria() {
        return tipoDiaria;
    }

    public void setTipoDiaria(String tipoDiaria) {
        this.tipoDiaria = tipoDiaria;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(String horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

}
