package Locadora_Carros;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private String enderešo;
	
	public Cliente(
			String nome,
			String telefone,
			String email,
			String enderešo)
	
	{
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.enderešo=enderešo;
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

	//Enderešo
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public static void main(String[] args) {	
	}
}
