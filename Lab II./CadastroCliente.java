package Locadora_de_Carros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Idade;
	private JTextField Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 41, 64, 13);
		contentPane.add(lblNome);
		
		Nome = new JTextField();
		Nome.setBounds(57, 40, 96, 19);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(10, 106, 45, 13);
		contentPane.add(lblIdade);
		
		Idade = new JTextField();
		Idade.setBounds(57, 103, 96, 19);
		contentPane.add(Idade);
		Idade.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 168, 45, 13);
		contentPane.add(lblEmail);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(57, 167, 96, 19);
		contentPane.add(Email);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList cli = new ArrayList<Cliente>();
				if((Nome.getText().equals(""))&& !(Idade.getText().equals(""))&& !(Email.getText().equals("")))
				{
					Cliente c4 = new Cliente(Nome.getText(), Idade.getText(), Email.getText());
					cli.add(c4);
					Nome.setText("");
					Idade.setText("");
					Email.setText("");
				}
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirmar.setBounds(321, 166, 105, 21);
		contentPane.add(btnConfirmar);
	}
}
