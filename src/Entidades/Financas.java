package Entidades;

public class Financas {
  private int idFinancas;
  private float valorLeilao;
  private float valorVenda;
  private float lucroEstimado;
  private float lucroReal;
  private float consertoEstimado;
  private consertoReal consertoReal;

  public Financas(){

  }

  public int getIdFinancas() {
    return idFinancas;
  }
  public void setIdFinancas(int idFinancas) {
    this.idFinancas = idFinancas;
  }

  public float getValorLeilao() {
    return valorLeilao;
  }
  public void setValorLeilao(float valorLeilao) {
    this.valorLeilao = valorLeilao;
  }

  public float getValorVenda() {
    return valorVenda;
  }
  public void setValorVenda(float valorVenda) {
    this.valorVenda = valorVenda;
  }

  public float getLucroEstimado() {
    return lucroEstimado;
  }
  public void setLucroEstimado(float lucroEstimado) {
    this.lucroEstimado = lucroEstimado;
  }

  public float getLucroReal() {
    return lucroReal;
  }
  public void setLucroReal(float lucroReal) {
    this.lucroReal = lucroReal;
  }

  public float getConsertoEstimado() {
    return consertoEstimado;
  }
  public void setConsertoEstimado(float consertoEstimado) {
    this.consertoEstimado = consertoEstimado;
  }

  public Entidades.consertoReal getConsertoReal() {
    return consertoReal;
  }
  public void setConsertoReal(Entidades.consertoReal consertoReal) {
    this.consertoReal = consertoReal;
  }
}
