package controlador;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.Carro;
import controlador.ConnectionManager;
import controlador.ConexaoBanco;



public class DaoCarro {
    
    private Carro carro;
    String sql;
    

	public void criarCarro(Carro carro) {
    	this.carro = carro;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into carro (marca, placa, modelo, cor, ano, preco) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, carro.getMarca());
            pst.setObject(2, carro.getPlaca());
            pst.setObject(3, carro.getModelo());
            pst.setObject(4, carro.getCor());
            pst.setObject(5, carro.getAno());
            pst.setObject(6, carro.getPreco());
            
            pst.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inserir os dados!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão", e);
            }
        }
	}
}