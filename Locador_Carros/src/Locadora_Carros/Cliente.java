package Locadora_Carros;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private String endere�o;
	
	public Cliente(
			String nome,
			String telefone,
			String email,
			String endere�o)
	
	{
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.endere�o=endere�o;
	}

	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Telefone
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Endere�o
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public static void main(String[] args) {	
	}
}
