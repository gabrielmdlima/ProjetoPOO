package Dao;

import Entidades.Financas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinancasDao {

  public static void inserirFinancas(Financas financas) throws SQLException {
    try {
      boolean ok = true;
      String query = "insert into financas values (null,?,?,?,?,?,?,?,?)";
      Connection con = Conexao.abrirConexao();
      PreparedStatement ps;
      ps = con.prepareStatement(query);
      ps.setInt(1, financas.getIdVeiculo());
      ps.setFloat(2, financas.getValorLeilao());
      ps.setFloat(3, financas.getConsertoEstimado());
      ps.setFloat(4, financas.getFipe());
      ps.setFloat(5, financas.getLucroEstimado());
      ps.setFloat(6, financas.getConsertoReal());
      ps.setFloat(7, financas.getValorVenda());
      ps.setFloat(8, financas.getLucroReal());

      ps.execute();
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(FinancasDao.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

  public static List<Financas> getFinancas() throws ClassNotFoundException, SQLException {

    List<Financas> financa = new ArrayList<>();
    String query = "select * from financas;";

    Connection con = Conexao.abrirConexao();
    try {
      PreparedStatement ps = con.prepareStatement(query);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        Financas financas = new Financas();
        int id = rs.getInt("id");
        int idVeiculo = rs.getInt("idVeiculo");
        float valorLeilao = rs.getFloat("valorLeilao");
        float consertoEstimado = rs.getFloat("consertoEstimado");
        float fipe = rs.getFloat("fipe");
        float lucroEstimado = rs.getFloat("lucroEstimado");
        float consertoReal = rs.getFloat("consertoReal");
        float valorVenda = rs.getFloat("valorVenda");
        float lucroReal = rs.getFloat("lucroReal");

        financas.setIdFinancas(id);
        financas.setIdVeiculo(idVeiculo);
        financas.setValorLeilao(valorLeilao);
        financas.setConsertoEstimado(consertoEstimado);
        financas.setFipe(fipe);
        financas.setLucroEstimado(lucroEstimado);
        financas.setConsertoReal(consertoReal);
        financas.setValorVenda(valorVenda);
        financas.setLucroReal(lucroReal);
        financa.add(financas);
      }

    } catch (SQLException ex) {
      Logger.getLogger(FinancasDao.class
              .getName()).log(Level.SEVERE, null, ex);
    }
    return financa;

  }
}

