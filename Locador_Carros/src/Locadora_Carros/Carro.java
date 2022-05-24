package Locadora_Carros;

public class Carro {
	private String marca;
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private float preco;

	public Carro(
			String marca,
			String placa,
			String modelo,
			String cor,
			int ano,
			float preco)
	{
		this.marca=marca;
		this.placa=placa;
		this.modelo=modelo;
		this.cor=cor;
		this.ano=ano;
		this.preco=preco;
	}

	//Marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Placa
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	//Modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Cor
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	//Ano
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	//Preco
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public static void main(String[] args) {
		
	}
}
