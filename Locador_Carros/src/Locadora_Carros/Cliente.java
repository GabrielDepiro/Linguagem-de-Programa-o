package Locadora_Carros;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private String endereço;
	
	public Cliente(
			String nome,
			String telefone,
			String email,
			String endereço)
	
	{
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.endereço=endereço;
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

	//Endereço
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public static void main(String[] args) {	
	}
}
