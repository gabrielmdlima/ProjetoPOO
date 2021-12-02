package Entidades;

public class Veiculo {
  private int idVeiculo;
  private int ano;
  public String placa;
  private String modelo;
  private String marca;

  public Veiculo(){

  }

  public int getIdVeiculo() {
    return idVeiculo;
  }
  public void setIdVeiculo(int idVeiculo) {
    this.idVeiculo = idVeiculo;
  }

  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getPlaca() {
    return placa;
  }
  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
}
