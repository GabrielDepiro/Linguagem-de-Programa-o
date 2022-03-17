package LocadoraCarros;

public class Clientes {
	private String nome;
	private int idade; 
	private String email; 
	private int telefone; 
	   
	   
	      
	 public Clientes (String nome, int idade, String email, int telefone){ 
	   
		  this.nome = nome; 
		  this.idade = idade; 
		  this.email = email; 
		  this.telefone = telefone; 
	   
	  } 
	   
	  public void Informacao(){ 
		  System.out.println("Nome: " + nome + "\n" + 
				  "Idade: " + idade + "\n" + 
				  "Email: " + email + "\n" + 
				  "Telefone: " + telefone + "\n"); 
	      } 
	   
	   
	  public static void main(String[] args) { 
	   
		  Cliente C1 = new Cliente("Costa", 29, "costa@gmail.com.br", (12)985345671); 
		  Cliente C2 = new Cliente("Evangelista", 22, "evangelista@yahoo.com", (12)989547879); 
	   
		  C1.Informacao(); 
		  C2.Informacao(); 
	           
	      } 
}

