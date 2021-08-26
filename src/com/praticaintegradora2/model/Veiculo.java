package com.praticaintegradora2.model;

public class Veiculo {
    private Integer velocidade;
    private Double aceleração;
    private String AnguloDeVirada;
    private String Patente;
    private Double Peso;
    private Integer Rodas;
    private String Placa;

    public void removerVeiculo(Veiculo veiculo){

    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAceleração() {
        return aceleração;
    }

    public void setAceleração(Double aceleração) {
        this.aceleração = aceleração;
    }

    public String getAnguloDeVirada() {
        return AnguloDeVirada;
    }

    public void setAnguloDeVirada(String anguloDeVirada) {
        AnguloDeVirada = anguloDeVirada;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Integer getRodas() {
        return Rodas;
    }

    public void setRodas(Integer rodas) {
        Rodas = rodas;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }
}
