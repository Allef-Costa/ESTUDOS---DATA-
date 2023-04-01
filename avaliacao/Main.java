package avaliacao;

import java.time.LocalDate;


public class Main {

   
    public static void main(String[] args) {
        Medico med1 = new Medico("1", "1", "1", "1", Setor.SAUDE, 5, 5, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, 02, 01), 5, "5", "5", "5",
                new Endereco("5", "5", "5", "5", "5", UnidadeFederativa.ACRE));
        Advogado adv1 = new Advogado("1", "1", "1", "1", Setor.SAUDE, 5, 5, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, 02, 01), 5, "5", "5", "5",
                new Endereco("5", "5", "5", "5", "5", UnidadeFederativa.ACRE));
        Engenheiro eng1 = new Engenheiro ("1", "1", "1", "1", Setor.SAUDE, 5, 5, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, 02, 01), 5, "5", "5", "5",
                new Endereco("5", "5", "5", "5", "5", UnidadeFederativa.ACRE));
        PrestacaoServico pr1 = new PrestacaoServico(LocalDate.of(2000, 02, 01), LocalDate.of(2000, 01, 02), "5", "5", 5, "5", "5", "5",
                new Endereco("1", "1", "1", "1", "1", UnidadeFederativa.ACRE));
        Fornecedor for1 = new Fornecedor("1", "1", "1", 1, "1", "1", "1",
                new Endereco("1", "1", "1", "1", "1", UnidadeFederativa.ACRE));
        
     
     
     
       
        
        
        System.out.println(med1.toString());
        System.out.println(adv1.toString());
        System.out.println(eng1.toString());
        System.out.println(pr1.toString());
        System.out.println(for1.toString());
        
        
        
        
        
    
}}
