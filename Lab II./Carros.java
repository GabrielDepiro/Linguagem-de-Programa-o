
package LocadoraCarros;

public class Carros {

	private String placa;
	private double potencia; 
	private String modelo; 
	private String cor; 
	private String marca; 
	private boolean cambio_automatico; 
	private int ano; 
	private float preco; 
	  
	public Carros( 
			String plac,  
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
		System.out.println("Estou correndo "+ "velocidade+"Km"); } 
	public static void main(String[] args) { 
	  
	 Carro C1 = new  
	 Carro("FDP0589",2.0,"Face","Cinza","Cherry",false, 2011); 
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
}
