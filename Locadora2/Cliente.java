package controlador;

public class Cliente {
	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	private String endereço;
	
	public Cliente(
			String cpf,
			String nome,
			String telefone,
			String email,
			String endereço)
	
	{
		this.cpf=cpf;
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.endereço=endereço;
	}

	//CPF
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
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
