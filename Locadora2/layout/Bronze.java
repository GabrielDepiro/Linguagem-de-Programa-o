package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

import DAO.DaoCliente;
import DAO.DaoEscolha;
import DAO.DaoEscolha_Dados;
import controlador.Cliente_Api;
import controlador.Dados;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bronze {

	JFrame frmBronze;
	Cliente_Api c1;
	EscopoInsert vProList;
	private JTextField textField_vQuantidade;
	Cliente_Api p1;
 	Cliente_Api p2;
 	Cliente_Api p3;
 	Cliente_Api p4;
 	Cliente_Api p5;
	Cliente_Api p6;	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bronze window = new Bronze();
					window.frmBronze.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Bronze(Cliente_Api c1, Cliente_Api p1, Cliente_Api p2, Cliente_Api p3, Cliente_Api p4, Cliente_Api p5, Cliente_Api p6) {
		this.c1=c1;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		this.p5=p5;
		this.p6=p6;
		initialize();
	}
	public Bronze() {
		initialize();
	}
	/*
	/**
	 * Create the application.
	
	public Bronze(Cliente c1) {
		this.c1=c1;
		initialize();
	}
*/
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBronze = new JFrame();
		frmBronze.setTitle("Bronze");
		frmBronze.getContentPane().setBackground(SystemColor.windowBorder);
		frmBronze.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipos de Dados:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 200, 31);
		frmBronze.getContentPane().add(lblNewLabel);
		
		JCheckBox vDados_PDF = new JCheckBox("PDF");
		vDados_PDF.setForeground(Color.WHITE);
		vDados_PDF.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_PDF.setBackground(SystemColor.windowBorder);
		vDados_PDF.setBounds(10, 47, 150, 31);
		frmBronze.getContentPane().add(vDados_PDF);
		
		JCheckBox vDados_JSON = new JCheckBox("JSON");
		vDados_JSON.setForeground(Color.WHITE);
		vDados_JSON.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_JSON.setBackground(SystemColor.windowBorder);
		vDados_JSON.setBounds(162, 47, 150, 31);
		frmBronze.getContentPane().add(vDados_JSON);
		
		JCheckBox vDados_CSV = new JCheckBox("CSV");
		vDados_CSV.setForeground(Color.WHITE);
		vDados_CSV.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_CSV.setBackground(SystemColor.windowBorder);
		vDados_CSV.setBounds(314, 47, 150, 31);
		frmBronze.getContentPane().add(vDados_CSV);
		
		JCheckBox vDados_Planilhas = new JCheckBox("Planilhas");
		vDados_Planilhas.setForeground(Color.WHITE);
		vDados_Planilhas.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_Planilhas.setBackground(SystemColor.windowBorder);
		vDados_Planilhas.setBounds(466, 47, 150, 31);
		frmBronze.getContentPane().add(vDados_Planilhas);
		
		JCheckBox vDados_Tabelas = new JCheckBox("Tabelas");
		vDados_Tabelas.setForeground(Color.WHITE);
		vDados_Tabelas.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_Tabelas.setBackground(SystemColor.windowBorder);
		vDados_Tabelas.setBounds(10, 80, 150, 31);
		frmBronze.getContentPane().add(vDados_Tabelas);
		
		JCheckBox vDados_Audio = new JCheckBox("Audio");
		vDados_Audio.setForeground(Color.WHITE);
		vDados_Audio.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_Audio.setBackground(SystemColor.windowBorder);
		vDados_Audio.setBounds(162, 80, 150, 31);
		frmBronze.getContentPane().add(vDados_Audio);
		
		JCheckBox vDados_Texto = new JCheckBox("Texto");
		vDados_Texto.setForeground(Color.WHITE);
		vDados_Texto.setFont(new Font("Arial", Font.BOLD, 15));
		vDados_Texto.setBackground(SystemColor.windowBorder);
		vDados_Texto.setBounds(314, 80, 150, 31);
		frmBronze.getContentPane().add(vDados_Texto);
		
		JLabel lblFormasDeEnvio = new JLabel("Formas de Envio:");
		lblFormasDeEnvio.setForeground(Color.WHITE);
		lblFormasDeEnvio.setFont(new Font("Arial", Font.BOLD, 20));
		lblFormasDeEnvio.setBounds(10, 117, 200, 31);
		frmBronze.getContentPane().add(lblFormasDeEnvio);
		
		JCheckBox vEnvio_API = new JCheckBox("API");
		vEnvio_API.setForeground(Color.WHITE);
		vEnvio_API.setFont(new Font("Arial", Font.BOLD, 15));
		vEnvio_API.setBackground(SystemColor.windowBorder);
		vEnvio_API.setBounds(10, 154, 150, 31);
		frmBronze.getContentPane().add(vEnvio_API);
		
		JCheckBox vEnvio_SFTP = new JCheckBox("SFTP");
		vEnvio_SFTP.setForeground(Color.WHITE);
		vEnvio_SFTP.setFont(new Font("Arial", Font.BOLD, 15));
		vEnvio_SFTP.setBackground(SystemColor.windowBorder);
		vEnvio_SFTP.setBounds(162, 160, 150, 31);
		frmBronze.getContentPane().add(vEnvio_SFTP);
		
		JCheckBox vEnvio_Upload = new JCheckBox("Upload");
		vEnvio_Upload.setForeground(Color.WHITE);
		vEnvio_Upload.setFont(new Font("Arial", Font.BOLD, 15));
		vEnvio_Upload.setBackground(SystemColor.windowBorder);
		vEnvio_Upload.setBounds(314, 160, 150, 31);
		frmBronze.getContentPane().add(vEnvio_Upload);
		
		JLabel lblPrazoDeDados = new JLabel("Prazo de Dados Recebidos");
		lblPrazoDeDados.setForeground(Color.WHITE);
		lblPrazoDeDados.setFont(new Font("Arial", Font.BOLD, 20));
		lblPrazoDeDados.setBounds(10, 191, 292, 31);
		frmBronze.getContentPane().add(lblPrazoDeDados);
		
		JSpinner vContagem = new JSpinner();
		vContagem.setFont(new Font("Arial", Font.BOLD, 15));
		vContagem.setBounds(10, 232, 40, 31);
		frmBronze.getContentPane().add(vContagem);
		
		JComboBox comboBox_vPazo = new JComboBox();
		comboBox_vPazo.setForeground(Color.WHITE);
		comboBox_vPazo.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox_vPazo.setBackground(SystemColor.windowBorder);
		comboBox_vPazo.setModel(new DefaultComboBoxModel(new String[] {"Dias", "Semanas", "Meses"}));
		comboBox_vPazo.setBounds(60, 232, 252, 31);
		frmBronze.getContentPane().add(comboBox_vPazo);
		
		JLabel lblQuantidadeRecebida = new JLabel("Quantidade Recebida");
		lblQuantidadeRecebida.setForeground(Color.WHITE);
		lblQuantidadeRecebida.setFont(new Font("Arial", Font.BOLD, 20));
		lblQuantidadeRecebida.setBounds(10, 273, 292, 31);
		frmBronze.getContentPane().add(lblQuantidadeRecebida);
		
		JButton btnNewButton_Avancar = new JButton("Avan\u00E7ar");
		btnNewButton_Avancar.addActionListener(new ActionListener() {

			Dados d1 = new Dados();
			Dados t1 = new Dados();
			Dados t2 = new Dados();
			Dados t3 = new Dados();
			Dados t4 = new Dados();
			Dados t5 = new Dados();
			Dados t6 = new Dados();
			Dados t7 = new Dados();
			Dados e1 = new Dados();
			Dados e2 = new Dados();
			Dados e3 = new Dados();
			
			
			public void actionPerformed(ActionEvent e) {
				
				//<------------------------------ADICIONANDO OS TIPOS DE DADOS NUMA ARRAY------------------------------>

				ArrayList<String> vDadosList = new ArrayList<String>();
				
				if(vDados_PDF.isSelected()) {
					vDadosList.add("PDF");
					t1.setvId_Dados(1);
					}
				
				if(vDados_JSON.isSelected()) {
					vDadosList.add("JSON");
					t2.setvId_Dados(2);
				}
				
				if(vDados_CSV.isSelected()) {
					vDadosList.add("CSV");
					t3.setvId_Dados(3);
				}
				
				if(vDados_Planilhas.isSelected()) {
					vDadosList.add("Planilhas");
					t4.setvId_Dados(4);
				}
				
				if(vDados_Audio.isSelected()) {
					vDadosList.add("Audio");
					t6.setvId_Dados(6);
				}
				
				if(vDados_Tabelas.isSelected()) {
					vDadosList.add("Tabelas");
					t5.setvId_Dados(5);
				}
				
				if(vDados_Texto.isSelected()) {
					vDadosList.add("Texto");
					t7.setvId_Dados(7);
					}
				//<------------------------------FIM DA ARRAY DOS TIPOS DE DADOS------------------------------>
				
				//<------------------------------ADICIONANDO AS FORMAS DE ENVIO NUMA ARRAY------------------------------>
				ArrayList<String> vEnviarList = new ArrayList<String>();
				
				if(vEnvio_API.isSelected()) {
					vEnviarList.add("API");
					e1.setvEnvio("API");
				}
				
				if(vEnvio_SFTP.isSelected()) {
					vEnviarList.add("SFTP");
					e2.setvEnvio("SFTP");
				}
				if(vEnvio_Upload.isSelected()) {
					vEnviarList.add("Upload");
					e3.setvEnvio("Upload");
				}
				//<------------------------------FIM DA FORMA DE ENVIO------------------------------>

				//<------------------------------RECEBENDO A QUANTIDADE DE DADOS------------------------------>
				d1.setvQuantidade(textField_vQuantidade.getText());
				d1.setvPrazo(vContagem.getValue()+""+comboBox_vPazo.getSelectedItem());
				//<------------------------------FIM DA QUANTIDADE DE DADOS------------------------------>

				if(vDadosList.size() != 0 &&
						vEnviarList.size() !=0 &&
						!textField_vQuantidade.getText().equals("") &&
						!comboBox_vPazo.getSelectedItem().equals("<Selecione uma das opﾃｧﾃｵes>")
						) {
					
				}
				//executando select do cliente para usa-lo na prﾃｳxima etapa
				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarClientes(c1);
				
				//inserindo todos os dados na tabla escolha
				DaoEscolha daoCriarEscolha = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
				daoCriarEscolha.criarEscolhaProduto();
				
				//select ta tabela escolha que acabamos de criar para conseguir inputar os
				//dados na tabela escolha_dados(para cada id escolha terá uma combinação de id_produto e forma_envio)
				
				  if(e1.getvEnvio()!=d1.getvEnvio()) { 
					  if(p1.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE1(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
					  }
					  if(p2.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE4(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p3.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE7(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p4.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE10(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p5.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE13(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p6.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE16(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
				  }  
				  if(e2.getvEnvio()!=d1.getvEnvio()){
					  if(p1.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE2(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
					  }
					  if(p2.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE5(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p3.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE8(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p4.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE11(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p5.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE14(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p6.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE17(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
				  }
				  if(e3.getvEnvio()!=d1.getvEnvio()) { 
					  if(p1.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE3(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
					  }
					  if(p2.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE6(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p3.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE9(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p4.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE12();
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p5.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE15(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
					  if(p6.getvId_Produto()!=c1.getvId_Produto()) {
						  DaoEscolha daoExibirEscolha1 = new DaoEscolha(c1, p1, p2, p3, p4, p5, p6, e1, e2, e3, d1);
						  daoExibirEscolha1.buscarEscolhaProdutoE18(); 
						  
						  DaoEscolha_Dados daoCriarEscolhaDados = new DaoEscolha_Dados(c1, d1, t1, t2, t3, t4, t5, t6, t7);
						  daoCriarEscolhaDados.criarEscolhaDados(); 
						  }
				  }
				 
				// aqui setamos qual dela vai ser aberta
				Silver window = new Silver();
				// aqui setamos a nova tela como visivel
				window.setVisible(true);
				// e para n�ｾ�ｽｧ�ｾゑｽｸ�ｾ��ｿｽ ficar com duas telas abertas, ordenamos a atual a ficar invisivel
				frmBronze.setVisible(false);
				
				JOptionPane.showMessageDialog(null,"Concluido com Sucesso");
			}
		});
		btnNewButton_Avancar.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_Avancar.setBounds(589, 480, 150, 30);
		frmBronze.getContentPane().add(btnNewButton_Avancar);
		
		textField_vQuantidade = new JTextField();
		textField_vQuantidade.setBounds(10, 303, 302, 31);
		frmBronze.getContentPane().add(textField_vQuantidade);
		textField_vQuantidade.setColumns(10);
		
		JButton btnNewButton_Retornar_1 = new JButton("Retornar");
		btnNewButton_Retornar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {										
					public void run() {		
						try {
							//aqui setamos qual dela vai ser aberta
							Menu window = new Menu();
							//aqui setamos a nova tela como visivel
							window.frmMenu.setVisible(true);
							//e para nﾃｧﾂｸﾅ� ficar com duas telas abertas, ordenamos a atual a ficar invisivel
							frmBronze.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
			
		

  btnNewButton_Retornar_1.setFont(new Font("Arial", Font.BOLD, 15));
  btnNewButton_Retornar_1.setBounds(60, 480, 150, 30);
  frmBronze.getContentPane().add(btnNewButton_Retornar_1);
  frmBronze.setBounds(100, 100, 800, 600);
  frmBronze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}
}
