package controlador;

public class Cliente {
	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	private String enderešo;
	
	public Cliente(
			String cpf,
			String nome,
			String telefone,
			String email,
			String enderešo)
	
	{
		this.cpf=cpf;
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.enderešo=enderešo;
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
