package avaliacao;

import java.time.LocalDate;


public class Engenheiro extends Funcionario{
    private String crea;

    @Override
    public String toString() {
        return "Engenheiro \n" +
                "crea: " + crea + 
                "\nCpf: " + super.cpf + 
                "\nRg: " + super.rg + 
                "\nMatricula: " + super.matricula + 
                "\nSetor: " + super.setor.getNome() + 
                "\nSalario: " + super.salario + 
                "\nIdade: " + super.idade + 
                "\nGenero: " + super.genero.nome + 
                "\nEstado civil: " + super.estadoCivil + 
                "\nData nascimento: " + super.getDataNascimento() +
                "\nId: " + super.id + 
                "\nNome: " + super.nome + 
                "\nTelefone: " + super.telefone + 
                "\nEmail: " + super.telefone + 
                "\nEndereco: " + super.endereco.getCep() + "\n" + 
                super.endereco.getCidade() + "\n" + super.endereco.getComplemento() + "\n" +
                super.endereco.getLogradouro() + "\n" + super.endereco.getNumero()+ "\n" ;
                
                
    }
    
    

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    
    
    
    
}
