public class PessoaJuridica extends Locatario{
    private String nomeSocial;
    private String cnpj;
    private String funcionarios;

    public PessoaJuridica(String nomeSocial, String cnpj, String funcionarios, Endereco endereco, String email, int telefone) {
        super(endereco, email, telefone);
        this.nomeSocial = nomeSocial;
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }
    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }
}
