package avaliacao;


public enum EstadoCivil {
    SOLTEIRO, CASADO, SEPARADO,
    DIVORCIADO, VIUVO;
    
    private String texto;

    private EstadoCivil() {
    }

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
