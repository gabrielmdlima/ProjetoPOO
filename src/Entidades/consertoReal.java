package Entidades;

public class consertoReal {
  private int idConserto;
  public int quantidade;
  public int valor;
  public String descricao;

  public consertoReal(){

  }

  public int getIdConserto() {
    return idConserto;
  }
  public void setIdConserto(int idConserto) {
    this.idConserto = idConserto;
  }

  public int getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public int getValor() {
    return valor;
  }
  public void setValor(int valor) {
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
