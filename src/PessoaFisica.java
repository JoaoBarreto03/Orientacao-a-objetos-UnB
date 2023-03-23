public class PessoaFisica extends Locatario{
    private String nome;
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(Endereco endereco, String email, int telefone, String nome, String cpf, String estadoCivil) {
        super(endereco, email, telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
