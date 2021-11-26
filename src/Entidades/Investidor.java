package Entidades;


public class Investidor extends Pessoa{
  private int percentual;
  private String idCarro;

  public Investidor(){
    idCarro = definiridCarro();
  }

  public String definiridCarro(){

    return idCarro;
  }

  public int getPercentual() {
    return percentual;
  }
  public void setPercentual(int percentual) {
    this.percentual = percentual;
  }

  public String getIdCarro() {
    return idCarro;
  }
  public void setIdCarro(String idCarro) {
    this.idCarro = idCarro;
  }
}
