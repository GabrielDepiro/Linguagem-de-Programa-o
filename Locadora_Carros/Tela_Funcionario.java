package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;



public class Tela_Funcionario extends JFrame {
	Funcionario f1;

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Email;
	private JTextField Cpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Funcionario frame = new Tela_Funcionario();
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
	public Tela_Funcionario() {
		setTitle("Funcion\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(65, 116, 45, 13);
		contentPane.add(lblNome);
		
		Nome = new JTextField();
		Nome.setBounds(115, 113, 152, 19);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(65, 145, 45, 13);
		contentPane.add(lblEmail);
		
		Email = new JTextField();
		Email.setBounds(115, 142, 152, 19);
		Email.setColumns(10);
		contentPane.add(Email);
		
		JLabel Cargo = new JLabel("Cargo");
		Cargo.setBounds(65, 177, 45, 13);
		contentPane.add(Cargo);
		
		Cpf = new JTextField();
		Cpf.setColumns(10);
		Cpf.setBounds(115, 84, 152, 19);
		contentPane.add(Cpf);
		
		JLabel Cpf = new JLabel("CPF");
		Cpf.setBounds(65, 87, 45, 13);
		contentPane.add(Cpf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(115, 173, 152, 21);
		contentPane.add(comboBox);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList telaFuncionario = new ArrayList<Tela_Funcionario>();
				
				if((!Cpf.getText().equals("")) && (!Nome.getText().equals("")) && (!Email.getText().equals(""))
						&& (!Cargo.getText().equals("")));
				
				Funcionario fun = new Funcionario(Cpf.getText(),Nome.getText(), Email.getText(), 
						Cargo.getText());
				
				telaFuncionario.add(fun);
				
				for (int i = 0; i < telaFuncionario.size(); i++) {
					fun = (Funcionario) telaFuncionario.get(i);
					System.out.println(fun.getNome() + "\r\n" + fun.getEmail()
							+ "\r\n" + fun.getCargo());
				}
			}
		});
		btnConfirmar.setBounds(294, 204, 108, 21);
		contentPane.add(btnConfirmar);
		
	}
}
