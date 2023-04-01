package avaliacao;


public enum Setor {
    ENGENHARIA("ENG", "Engenharia"),
    SAUDE("SAU", "Saude"),
    JURIDICO("JURI", "Juridico");

    private Setor(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    private Setor() {
    }
    
    private String nome;
    private String sigla;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
