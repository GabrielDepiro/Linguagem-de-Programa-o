package Locadora_Carros;

public class Funcionario {
	private String nome;
	private String email;
	private String cargo;
	
	public Funcionario(
			String nome,
			String email,
			String cargo)
	{
		this.nome= nome;
		this.email=email;
		this.cargo=cargo;
	}

	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Função
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public static void main(String[] args) {
		
	}
}
