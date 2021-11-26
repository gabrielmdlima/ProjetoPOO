package Entidades;

public class Pessoa {
  private int idPessoa;
  private int senha;
  private String login;
  private String nome;



  public Pessoa(){

  }

  public int getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogin() {
    return login;
  }
  public void setSenha(int senha) {
    this.senha = senha;
  }

  public int getSenha() {
    return senha;
  }
  public void setLogin(String login) {
    this.login = login;
  }

}
