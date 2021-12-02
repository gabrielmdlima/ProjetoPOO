package Dao;

import Entidades.Financas;
import Entidades.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeiculoDao {

  public static void inserirVeiculo(Veiculo veiculo) throws SQLException {
    try {
      boolean ok = true;
      String query = "insert into veiculo values (null,?,?,?,?,?,?,?,?)";
      Connection con = Conexao.abrirConexao();
      PreparedStatement ps;
      ps = con.prepareStatement(query);
      ps.setString(1, veiculo.getPlaca());
      ps.setString(2, veiculo.getModelo());
      ps.setString(3, veiculo.getMarca());
      ps.setInt(4, veiculo.getAno());

      ps.execute();
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

  public static List<Veiculo> getVeiculo() throws ClassNotFoundException, SQLException {

    List<Veiculo> carro = new ArrayList<>();
    String query = "select * from veiculo;";

    Connection con = Conexao.abrirConexao();
    try {
      PreparedStatement ps = con.prepareStatement(query);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        Veiculo veiculo = new Veiculo();
        int id = rs.getInt("id");
        String placa = rs.getString("placa");
        String modelo = rs.getString("modelo");
        String marca = rs.getString("marca");
        int ano = rs.getInt("ano");

        veiculo.setIdVeiculo(id);
        veiculo.setPlaca(placa);
        veiculo.setModelo(modelo);
        veiculo.setMarca(marca);
        veiculo.setAno(ano);

        carro.add(veiculo);
      }

    } catch (SQLException ex) {
      Logger.getLogger(FinancasDao.class
              .getName()).log(Level.SEVERE, null, ex);
    }
    return carro;

  }
}
