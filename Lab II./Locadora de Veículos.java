package Locadora_de_Veículos;

public class Carro {

		private String placa;
		private double potencia;
		private String modelo;
		private String cor;
		private String marca;
		private boolean cambio_automatico;
		private int ano;
		private float preco;

		public Carro(
			String plac, //
			double poten,
			String model,
			String cor,
			String marca,
			boolean cambio_automatico,
			int ano) 
		{
			placa=plac;
			potencia=poten;
			modelo=model;
			this.cor=cor;
			this.marca=marca;
			this.cambio_automatico=cambio_automatico;
				this.ano=ano;
			}

			public float get_preco() {
				return preco;
			}

			public void set_preco(float novopreco) {
				preco=novopreco;
			}

			public void andar() {
				System.out.println("Andando");
			}

			public boolean freio() {
				System.out.println("Freando");
				return true;

			}
			public void correr (int velocidade) {
				System.out.println("Estou correndo "+velocidade+"Km");
			}
			public static void main(String[] args) {

				Carro C1 = new 
			Carro("FDP0589",2.0,"Face","Cinza","Cherry",false,2011);
				Carro C2 = new 
			Carro ("PAOH456",5.9,"Brasilia","Branco","Chevrolet",true,2022);
			
				C1.ano=2020;
				C1.cor="vermelho";
				C1.andar();
			    C1.set_preco(10000);
			    System.out.println("novo preço é "+ C1.get_preco());

				C2.marca="ferrari";
				C2.correr(300);
				C2.freio();
		}
		}

package Locadora_de_Veículos;

public class Vendedor {
	private String nome;
	private int idade;
	private int tempo_empresa;
	private float salario;
	private int media_vendas;
	
	public Vendedor(
		String nome,
		int idade,
		int tempo_empresa,
		float salario,
		int media_vendas)
	{
		this.nome = nome;
		this.idade = idade;
		this.tempo_empresa = tempo_empresa;
		this.salario = salario;
		this.media_vendas = media_vendas;
	}
	
	public Vendedor(String string, int i, int j, double d) {
		// TODO Auto-generated constructor stub
	}

	public float get_idade() {
		return idade;
	}
	public void set_idade(float novo_idade) {
		salario = novo_idade;
	}
	
	public float get_tempo_empresa() {
		return tempo_empresa;
	}
	public void set_tempo_empresa(float novo_tempo_empresa) {
		salario = novo_tempo_empresa;
	}
	
	public float get_salario() {
		return salario;
	}
	public void set_salario(float novo_salario) {
		salario = novo_salario;
	}
	
	public float get_salario() {
		return salario;
	}
	public void set_salario(float novo_salario) {
		salario = novo_salario;
	}
	
	public static void main(String[] args) {
		Vendedor V1 = new
	Vendedor("Gabriel", 32, 9, 4.500);
		
	}
}

