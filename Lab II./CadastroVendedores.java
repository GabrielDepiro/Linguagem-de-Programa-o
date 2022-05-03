package Locadora_de_Carros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroVendedores extends JFrame {

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Idade;
	private JTextField Tempo_Empresa;
	private JTextField Salário;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVendedores frame = new CadastroVendedores();
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
	public CadastroVendedores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(10, 24, 57, 13);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(10, 94, 57, 13);
		contentPane.add(lblIdade);
		
		JLabel lblTempo_empresa = new JLabel("Tempo_Empresa");
		lblTempo_empresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTempo_empresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTempo_empresa.setBounds(10, 159, 135, 13);
		contentPane.add(lblTempo_empresa);
		
		JLabel lblSalário = new JLabel("Sal\u00E1rio");
		lblSalário.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalário.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalário.setBounds(160, 24, 57, 13);
		contentPane.add(lblSalário);
		
		Nome = new JTextField();
		Nome.setBounds(20, 47, 96, 19);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		Idade = new JTextField();
		Idade.setColumns(10);
		Idade.setBounds(20, 117, 96, 19);
		contentPane.add(Idade);
		
		Tempo_Empresa = new JTextField();
		Tempo_Empresa.setColumns(10);
		Tempo_Empresa.setBounds(20, 182, 96, 19);
		contentPane.add(Tempo_Empresa);
		
		Salário = new JTextField();
		Salário.setHorizontalAlignment(SwingConstants.CENTER);
		Salário.setColumns(10);
		Salário.setBounds(170, 47, 96, 19);
		contentPane.add(Salário);
		
		btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList ven=new ArrayList<Vendedores>();
				if((!Nome.getText().equals(""))&& (!Idade.getText().equals(""))&& (!Tempo_Empresa.getText().equals(""))&&(!Nome.getText().equals(""))&&(!Salário.getText().equals("")))
				{
					Vendedores v4=new Vendedores(Nome.getText(),Idade.getText(),Tempo_Empresa.getText(),Salário.getText());
					ven.add(v4);
					Nome.setText("");
					Idade.setText("");
					Tempo_Empresa.setText("");
					Salário.setText("");
				}
			}
		});
		btnNewButton.setBounds(266, 181, 111, 21);
		contentPane.add(btnNewButton);
	}

}
