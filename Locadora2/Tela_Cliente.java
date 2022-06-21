package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.DaoCliente;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class Tela_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Telefone;
	private JTextField Email;
	private JTextField Endere�o;
	private JTextField CPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cliente frame = new Tela_Cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_Cliente() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(65, 90, 45, 13);
		contentPane.add(lblNome);
		
		Nome = new JTextField();
		Nome.setBounds(115, 87, 182, 19);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(65, 119, 45, 13);
		contentPane.add(lblTelefone);
		
		Telefone = new JTextField();
		Telefone.setBounds(115, 116, 182, 19);
		Telefone.setColumns(10);
		contentPane.add(Telefone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(65, 148, 45, 13);
		contentPane.add(lblEmail);
		
		Email = new JTextField();
		Email.setBounds(115, 145, 182, 19);
		Email.setColumns(10);
		contentPane.add(Email);
		
		JLabel lblEndere�o = new JLabel("Endere\u00E7o");
		lblEndere�o.setBounds(65, 177, 45, 13);
		contentPane.add(lblEndere�o);
		
		Endere�o = new JTextField();
		Endere�o.setBounds(115, 174, 182, 19);
		Endere�o.setColumns(10);
		contentPane.add(Endere�o);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(65, 61, 33, 13);
		contentPane.add(lblCPF);
		
		CPF= new JTextField();
		CPF.setColumns(10);
		CPF.setBounds(115, 58, 182, 19);
		contentPane.add(CPF);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList telaCliente = new ArrayList<Tela_Cliente>();
				
				if((!CPF.getText().equals("")) && (!Nome.getText().equals("")) && (!Telefone.getText().equals(""))
						&& (!Email.getText().equals("")) && (!Endere�o.getText().equals("")));
				Cliente cli = new Cliente(CPF.getText(), Nome.getText(), Telefone.getText(), 
						Email.getText(), Endere�o.getText());
				
				Cliente c1 = new Cliente(null, null, null, null, null);
				
				c1.setCpf(CPF.getText());
				c1.setNome(Nome.getText());
				c1.setTelefone(Telefone.getText());
				c1.setEmail(Email.getText());
				c1.setEndere�o(Endere�o.getText());
				
				telaCliente.add(cli);
				
				for (int i = 0; i < telaCliente.size(); i++) {
					cli = (Cliente) telaCliente.get(i);
					System.out.println(cli.getCpf() + "\r\n" + cli.getNome() + "\r\n" + cli.getTelefone()
							+ "\r\n" + cli.getEmail() + "\r\n" + cli.getEndere�o());
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {

						try {
							// Aqui estou inputando os dados do cliente e da soluﾃｧﾃ｣o do cliente no banco

							DaoCliente daoCriarCliente = new DaoCliente();
							daoCriarCliente.criarCliente(c1);				
						

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
			
		});
			
		btnConfirmar.setBounds(320, 200, 104, 21);
		contentPane.add(btnConfirmar);
		
		
}
}
