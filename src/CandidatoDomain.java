public class CandidatoDomain {

    private String numero;
    private String partido;
    private String cargo;
    private String nome;
    private Boolean impugnado = false;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getImpugnado() {
        return impugnado;
    }

    public void setImpugnado(Boolean impugnado) {
        this.impugnado = impugnado;
    }
}