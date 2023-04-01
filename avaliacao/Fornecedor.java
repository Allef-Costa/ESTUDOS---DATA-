package avaliacao;


public class Fornecedor extends Juridica{
    private String produto;

    @Override
    public String toString() {
        return "\nFornecedor " + 
                "\nProduto: " + produto +
                "\nCnpj: " + super.getCnpj() + 
                "\nInscrição Estadual: " + super.getInscricaoEstadual() + 
                "\nId: " + super.id + 
                "\nNome: " + super.nome + 
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email + 
                "\nEndereço: " + super.endereco.getCep() + "\n" + 
                super.endereco.getCidade() + "\n" + super.endereco.getComplemento() + "\n" +
                super.endereco.getLogradouro() + "\n" + super.endereco.getNumero()+ "\n" ;
    }

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public Fornecedor() {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    
}
