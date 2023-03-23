
public class Locatario {

    private Endereco endereco;
    private String email;
    private int telefone;
    private int quantLocacoes = 0;
    private boolean temLocacao = false;

    public Locatario(Endereco endereco, String email, int telefone) {
        super();
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getQuantLocacoes() {
        return quantLocacoes;
    }

    public void setQuantLocacoes(int quantLocacoes) {
        this.quantLocacoes = quantLocacoes;
    }

    public boolean isTemLocacao() {
        return temLocacao;
    }

    public void setTemLocacao(boolean temLocacao) {
        this.temLocacao = temLocacao;
    }
}
