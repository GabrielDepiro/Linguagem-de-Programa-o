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



public class DaoFuncionario {
    
    private Funcionario funcionario;
    String sql;
    

	public void criarFuncionario(Funcionario funcionario) {
    	this.funcionario = funcionario;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "insert into funcionario (cpf, nome, email, cargo) values (?, ?, ?, ?)";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setObject(1, funcionario.getCpf());
            pst.setObject(2, funcionario.getNome());
            pst.setObject(3, funcionario.getEmail());
            pst.setObject(4, funcionario.getCargo());
            
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