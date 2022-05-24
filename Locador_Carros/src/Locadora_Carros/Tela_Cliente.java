package Locadora_Carros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	private JTextField textField;
	private JTextField Telefone;
	private JTextField Email;
	private JTextField Endereço;

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
		
		JLabel Nome = new JLabel("Nome");
		Nome.setBounds(65, 38, 45, 13);
		contentPane.add(Nome);
		
		textField = new JTextField();
		textField.setBounds(115, 35, 182, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(65, 92, 45, 13);
		contentPane.add(lblTelefone);
		
		Telefone = new JTextField();
		Telefone.setBounds(115, 89, 182, 19);
		Telefone.setColumns(10);
		contentPane.add(Telefone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(65, 146, 45, 13);
		contentPane.add(lblEmail);
		
		Email = new JTextField();
		Email.setBounds(115, 143, 182, 19);
		Email.setColumns(10);
		contentPane.add(Email);
		
		JLabel lblEndereço = new JLabel("Endere\u00E7o");
		lblEndereço.setBounds(65, 200, 45, 13);
		contentPane.add(lblEndereço);
		
		Endereço = new JTextField();
		Endereço.setBounds(115, 197, 182, 19);
		Endereço.setColumns(10);
		contentPane.add(Endereço);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList telaCliente = new ArrayList<Tela_Cliente>();
				
				if((!Nome.getText().equals("")) && (!Telefone.getText().equals(""))
						&& (!Email.getText().equals("")) && (!Endereço.getText().equals("")));
				
				Cliente cli = new Cliente(Nome.getText(), Telefone.getText(), 
						Email.getText(), Endereço.getText());
				
				telaCliente.add(cli);
				
				for (int i = 0; i < telaCliente.size(); i++) {
					cli = (Cliente) telaCliente.get(i);
					System.out.println(cli.getNome() + "\r\n" + cli.getTelefone()
							+ "\r\n" + cli.getEmail() + "\r\n" + cli.getEndereço());
				}
			}
		});
		btnConfirmar.setBounds(320, 200, 104, 21);
		contentPane.add(btnConfirmar);
}
}
