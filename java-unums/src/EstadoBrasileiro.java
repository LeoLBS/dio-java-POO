public enum EstadoBrasileiro {
    PARANA("PR", "Paraná", 12),
    SAO_PAULO("SP", "São Paulo", 14);

    private String sigla;
    private String nome;
    private int codigoIbge;

    private EstadoBrasileiro(String sigla, String nome, int codigoIbge){
        this.sigla = sigla;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
