package avaliacao;


public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    @Override
    public String toString() {
        return "\n\nJuridico:" + "\ncnpj: " + cnpj + "\ninscricao: " + inscricaoEstadual+
                "\n id: " + super.id + "\nnome: " + super.nome + "telefone: " + super.telefone +
                "\nemail: " + super.email + "Endereco:\n " + super.endereco.getCep() + "\n" +
                super.endereco.getCidade() + "\n" + super.endereco.getComplemento() + "\n" + super.endereco.getLogradouro() + "\n" +
                super.endereco.getNumero();
    }
    

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Juridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    
    
}
