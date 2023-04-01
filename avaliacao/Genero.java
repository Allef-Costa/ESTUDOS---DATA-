package avaliacao;


public enum Genero {
    MASCULINO("M", "Masculino"),
    FEMININO("F", "Feminino");
    
     String nome;
     String sigla;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    private Genero() {
    }

    private Genero(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    
}
