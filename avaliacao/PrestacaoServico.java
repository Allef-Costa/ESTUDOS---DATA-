package avaliacao;

import java.time.LocalDate;


public class PrestacaoServico extends Juridica{
    LocalDate contratoInicio;
    LocalDate contratoFim;

    @Override
    public String toString() {
        return  "\nInicio de contrato: " + contratoInicio + 
                "\nFim do contrato: " + contratoFim +
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

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public PrestacaoServico() {
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
}
