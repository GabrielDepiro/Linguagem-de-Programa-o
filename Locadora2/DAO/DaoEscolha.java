package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.Cliente_Api;
import controlador.ConnectionManager;
import controlador.Dados;

public class DaoEscolha {

	private Cliente_Api c1;
	private Cliente_Api p1;
	private Cliente_Api p2;
	private Cliente_Api p3;
	private Cliente_Api p4;
	private Cliente_Api p5;
	private Cliente_Api p6;
	private Dados d1;
	private Dados e1;
	private Dados e2;
	private Dados e3;
	
	public DaoEscolha(Cliente_Api c1, Cliente_Api p1, Cliente_Api p2, Cliente_Api p3, Cliente_Api p4, Cliente_Api p5, Cliente_Api p6, Dados e1, Dados e2, Dados e3, Dados d1) {
		this.c1=c1;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.e1=e1;
		this.e2=e2;
		this.e3=e3;
		this.d1=d1;
	}
	public DaoEscolha() {
	}
	
	public void criarEscolhaProduto() {
		Connection con = null;
		try {
			if(e1.getvEnvio() != d1.getvEnvio()) {
			if (p1.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, d1.getvPrazo());
				pst.setObject(2, d1.getvQuantidade());
				pst.setObject(3, e1.getvEnvio());
				pst.setObject(4, p1.getvId_Produto());
				pst.setObject(5, c1.getvCNPJ_Cliente());
				pst.setObject(6, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p2.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, d1.getvPrazo());
				pst.setObject(2, d1.getvQuantidade());
				pst.setObject(3, e1.getvEnvio());
				pst.setObject(4, p2.getvId_Produto());
				pst.setObject(5, c1.getvCNPJ_Cliente());
				pst.setObject(6, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p3.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, d1.getvPrazo());
				pst.setObject(2, d1.getvQuantidade());
				pst.setObject(3, e1.getvEnvio());
				pst.setObject(4, p3.getvId_Produto());
				pst.setObject(5, c1.getvCNPJ_Cliente());
				pst.setObject(6, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p4.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, d1.getvPrazo());
				pst.setObject(2, d1.getvQuantidade());
				pst.setObject(3, e1.getvEnvio());
				pst.setObject(4, p4.getvId_Produto());
				pst.setObject(5, c1.getvCNPJ_Cliente());
				pst.setObject(6, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p5.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, d1.getvPrazo());
				pst.setObject(2, d1.getvQuantidade());
				pst.setObject(3, e1.getvEnvio());
				pst.setObject(4, p5.getvId_Produto());
				pst.setObject(5, c1.getvCNPJ_Cliente());
				pst.setObject(6, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			if (p6.getvId_Produto() != c1.getvId_Produto()) {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, d1.getvPrazo());
				pst.setObject(2, d1.getvQuantidade());
				pst.setObject(3, e1.getvEnvio());
				pst.setObject(4, p6.getvId_Produto());
				pst.setObject(5, c1.getvCNPJ_Cliente());
				pst.setObject(6, c1.getvId_Cliente());
				pst.executeUpdate();
			}
			}
			if(e2.getvEnvio() != d1.getvEnvio()) {
				if (p1.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e2.getvEnvio());
					pst.setObject(4, p1.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p2.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e2.getvEnvio());
					pst.setObject(4, p2.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p3.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e2.getvEnvio());
					pst.setObject(4, p3.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p4.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e2.getvEnvio());
					pst.setObject(4, p4.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p5.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e2.getvEnvio());
					pst.setObject(4, p5.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p6.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e2.getvEnvio());
					pst.setObject(4, p6.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				}
			if(e3.getvEnvio() != d1.getvEnvio()) {
				if (p1.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e3.getvEnvio());
					pst.setObject(4, p1.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p2.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e3.getvEnvio());
					pst.setObject(4, p2.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p3.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e3.getvEnvio());
					pst.setObject(4, p3.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p4.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e3.getvEnvio());
					pst.setObject(4, p4.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p5.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e3.getvEnvio());
					pst.setObject(4, p5.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				if (p6.getvId_Produto() != c1.getvId_Produto()) {
					con = ConnectionManager.getConnection();
					String insert_sql = "insert into escolha (prazo, quantidade, forma_envio, id_produto, cnpj, id_cliente) values (?,?,?,?,?,?)";
					PreparedStatement pst;
					pst = con.prepareStatement(insert_sql);
					pst.setObject(1, d1.getvPrazo());
					pst.setObject(2, d1.getvQuantidade());
					pst.setObject(3, e3.getvEnvio());
					pst.setObject(4, p6.getvId_Produto());
					pst.setObject(5, c1.getvCNPJ_Cliente());
					pst.setObject(6, c1.getvId_Cliente());
					pst.executeUpdate();
				}
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao inserir os dados!", e);
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Erro ao fechar conexÃ£o", e);
			}
		}
	}
	
	public List<Cliente_Api> buscarEscolhaProdutoE1() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p1.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE2() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p1.getvId_Produto());
            pst.setObject(4, e2.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE3() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p1.getvId_Produto());
            pst.setObject(4, e3.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	
	public List<Cliente_Api> buscarEscolhaProdutoE4() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p2.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE5() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p2.getvId_Produto());
            pst.setObject(4, e2.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE6() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p2.getvId_Produto());
            pst.setObject(4, e3.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE7() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p3.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE8() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p3.getvId_Produto());
            pst.setObject(4, e2.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE9() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p3.getvId_Produto());
            pst.setObject(4, e3.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE10() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p4.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE11() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p4.getvId_Produto());
            pst.setObject(4, e2.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE12() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p4.getvId_Produto());
            pst.setObject(4, e3.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE13() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p5.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE14() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p5.getvId_Produto());
            pst.setObject(4, e2.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE15() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p5.getvId_Produto());
            pst.setObject(4, e3.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE16() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p6.getvId_Produto());
            pst.setObject(4, e1.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE17() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p6.getvId_Produto());
            pst.setObject(4, e2.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	public List<Cliente_Api> buscarEscolhaProdutoE18() {
        List<Cliente_Api> clientes = new ArrayList<Cliente_Api>();
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String select_sql = "select * from escolha where cnpj = ? and id_cliente=? and id_produto=? and forma_envio=?";// where cnpj = ?
            PreparedStatement pst;
            pst = con.prepareStatement(select_sql);
            pst.setObject(1, c1.getvCNPJ_Cliente());
            pst.setObject(2, c1.getvId_Cliente());
            pst.setObject(3, p6.getvId_Produto());
            pst.setObject(4, e3.getvEnvio());
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
            	c1.setvId_Escolha(rs.getInt("id_escolha"));
            	clientes.add(c1);	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar tarefas!", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }        
        return clientes;
    }
	
	public void deletarEscolha(Cliente_Api c1) {
    	this.c1=c1;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String insert_sql = "DELETE FROM escolha WHERE cnpj =? and id_cliente=?";
            PreparedStatement pst;
            pst = con.prepareStatement(insert_sql);
            pst.setString(1, c1.getvCNPJ_Cliente());
            pst.setInt(2, c1.getvId_Cliente());
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
                throw new RuntimeException("Erro ao fechar conexÃ£o", e);
            }
        }
    }
	/*
	 * public void criarEscolhaCliente(Cliente c1) { Connection con = null; try {
	 * con = ConnectionManager.getConnection(); String insert_sql =
	 * "insert into escolha (cnpj,id_cliente) values (?,?)"; PreparedStatement pst;
	 * 
	 * pst = con.prepareStatement(insert_sql); pst.setObject(1,
	 * c1.getvCNPJ_Cliente()); pst.setObject(2, c1.getvId_Cliente());
	 * pst.executeUpdate(); } catch (SQLException e) { e.printStackTrace(); throw
	 * new RuntimeException("Erro ao inserir os dados!", e); } finally { try { if
	 * (con != null) con.close(); } catch (SQLException e) { e.printStackTrace();
	 * throw new RuntimeException("Erro ao fechar conexÃ£o", e); } } }
	 */
}
