package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setType(Type.POPUP);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		btnFuncionario.setBackground(Color.LIGHT_GRAY);
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Tela_Funcionario().setVisible(true);
			}
		});
		btnFuncionario.setBounds(161, 41, 108, 21);
		contentPane.add(btnFuncionario);
		
		JButton btnCarro = new JButton("Carro");
		btnCarro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		btnCarro.setBackground(Color.LIGHT_GRAY);
		btnCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			new Tela_Carro().setVisible(true);
			}
		});
		btnCarro.setBounds(161, 98, 108, 21);
		contentPane.add(btnCarro);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		btnCliente.setBackground(Color.LIGHT_GRAY);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Tela_Cliente().setVisible(true);
			}
		});
		btnCliente.setBounds(161, 155, 108, 21);
		contentPane.add(btnCliente);
	}

}
