package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import controlador.DaoCarro;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Tela_Carro extends JFrame {

	private JPanel contentPane;
	private JTextField textMarca;
	private JTextField textPlaca;
	private JTextField textModelo;
	private JTextField textCor;
	private JTextField textAno;
	private JTextField textPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Carro frame = new Tela_Carro();
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
	public Tela_Carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(40, 40, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(40, 65, 46, 14);
		contentPane.add(lblPlaca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(40, 90, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(40, 115, 46, 14);
		contentPane.add(lblCor);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(40, 140, 46, 14);
		contentPane.add(lblAno);
		
		JLabel lblPreço = new JLabel("Pre\u00E7o");
		lblPreço.setBounds(40, 165, 46, 14);
		contentPane.add(lblPreço);
		
		textMarca = new JTextField();
		textMarca.setBounds(96, 37, 153, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setColumns(10);
		textPlaca.setBounds(96, 62, 153, 20);
		contentPane.add(textPlaca);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(96, 87, 153, 20);
		contentPane.add(textModelo);
		
		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(96, 112, 153, 20);
		contentPane.add(textCor);
		
		textAno = new JTextField();
		textAno.setColumns(10);
		textAno.setBounds(96, 137, 153, 20);
		contentPane.add(textAno);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(96, 162, 153, 20);
		contentPane.add(textPreco);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList telaCarro = new ArrayList<Tela_Carro>();
				
				if((!textMarca.getText().equals("")) && (!textPlaca.getText().equals(""))
						&& (!textModelo.getText().equals("")) && (!textCor.getText().equals("")) &&
						(! textAno.getText().equals("")) && (!textPreco.getText().equals("")));
				Carro car = new Carro(textMarca.getText(), textPlaca.getText(), 
						textModelo.getText(), textCor.getText(), Integer.parseInt(textAno.getText()),
						Float.valueOf(textPreco.getText()).floatValue());
				
				Carro car1 = new Carro(getTitle(), getTitle(), getTitle(), getTitle(), getDefaultCloseOperation(), getOpacity());
				
				car1.setMarca(textMarca.getText());
				car1.setPlaca(textPlaca.getText());
				car1.setModelo(textModelo.getText());
				car1.setCor(textCor.getText());
				car1.setAno(Integer.parseInt(textAno.getText()));
				car1.setPreco(Float.valueOf(textPreco.getText()));
				
				telaCarro.add(car);
				
				for (int i = 0; i < telaCarro.size(); i++) {
					car = (Carro) telaCarro.get(i);
					System.out.println(car.getMarca() + "\r\n" + car.getPlaca()
							+ "\r\n" + car.getModelo() + "\r\n" + car.getCor()
							+ "\r\n" + car.getAno()+ "\r\n" + car.getPreco());
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {

						try {
							// Aqui estou inputando os dados do cliente e da soluï¾ƒï½§ï¾ƒï½£o do cliente no banco

							DaoCarro daoCriarCarro = new DaoCarro();
							daoCriarCarro.criarCarro(car1);				
						

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnConfirmar.setBounds(277, 191, 105, 23);
		contentPane.add(btnConfirmar);
	}
}
