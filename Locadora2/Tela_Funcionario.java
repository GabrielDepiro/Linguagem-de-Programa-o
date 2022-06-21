package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.DefaultComboBoxModel;



public class Tela_Funcionario extends JFrame {
	Funcionario f1;

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Email;
	private JTextField Cargo;
	private JTextField CPF;

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
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(65, 177, 45, 13);
		contentPane.add(lblCargo);
		
		CPF = new JTextField();
		CPF.setColumns(10);
		CPF.setBounds(115, 84, 152, 19);
		contentPane.add(CPF);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(65, 87, 45, 13);
		contentPane.add(lblCPF);
		
		JComboBox comboBox_Cargo = new JComboBox();
		comboBox_Cargo.setModel(new DefaultComboBoxModel(new String[] {"Gerente", "Vendedor" }));
		comboBox_Cargo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
		comboBox_Cargo.setBounds(115, 173, 152, 19);
		getContentPane().add(comboBox_Cargo);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList telaFuncionario = new ArrayList<Tela_Funcionario>();
				
				if((!CPF.getText().equals("")) && (!Nome.getText().equals("")) && (!Email.getText().equals(""))
						&& (!Cargo.getText().equals("")));
				
				Funcionario fun = new Funcionario(CPF.getText(),Nome.getText(), Email.getText(), 
						Cargo.getText());
				
				Funcionario f1 = new Funcionario(null, null, null, null);
				
				f1.setCpf(CPF.getText());
				f1.setNome(Nome.getText());
				f1.setEmail(Email.getText());
				f1.setCargo((String) comboBox_Cargo.getSelectedItem());
				
				telaFuncionario.add(fun);
				
				for (int i = 0; i < telaFuncionario.size(); i++) {
					fun = (Funcionario) telaFuncionario.get(i);
					System.out.println(fun.getCpf() + "\r\n" + fun.getNome() + "\r\n" + fun.getEmail()
							+ "\r\n" + fun.getCargo());
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {

						try {
							// Aqui estou inputando os dados do cliente e da soluﾃｧﾃ｣o do cliente no banco

							DaoFuncionario daoCriarFuncionario = new DaoFuncionario();
							daoCriarFuncionario.criarFuncionario(f1);				
						

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
		});
				
			}
			
		});
		btnConfirmar.setBounds(294, 204, 108, 21);
		contentPane.add(btnConfirmar);
		
		
	}
}

