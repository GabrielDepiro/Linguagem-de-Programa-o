package controlador;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.Cliente;
import controlador.ConnectionManager;
import controlador.ConexaoBanco;



public class DaoCliente {
    
    private Cliente cliente;
    String sql;
    

	public void criarCliente(Cliente cliente) {
    	this.cliente = cliente;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into cliente (cpf, nome, telefone, email, endereco) values (?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, cliente.getCpf());
            pst.setObject(2, cliente.getNome());
            pst.setObject(3, cliente.getTelefone());
            pst.setObject(4, cliente.getEmail());
            pst.setObject(5, cliente.getEndere�o());
            
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
                throw new RuntimeException("Erro ao fechar conex�o", e);
            }
        }
	}
	public void deletarCl(Cliente Cliente) {
    	this.cliente=cliente;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "DELETE FROM cliente WHERE CPF =?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, cliente.getCpf());
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
                throw new RuntimeException("Erro ao fechar conex�o", e);
            }
        }
    }
}